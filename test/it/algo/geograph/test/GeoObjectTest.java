/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.algo.geograph.test;

import it.algo.geograph.agentfarm.domain.Route;
import it.algo.geograph.agentfarm.domain.Position;
import it.algo.geograph.agentfarm.domain.Agent;
import java.util.Iterator;
import java.io.IOException;
import org.cloudtm.framework.CloudtmConfig.Framework;
import pt.ist.fenixframework.Config;
import it.algo.geograph.agentfarm.domain.Root;
import org.cloudtm.framework.TransactionalCommand;
import org.cloudtm.framework.Init;
import org.cloudtm.framework.TxManager;
import org.cloudtm.framework.TxSystem;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabio Cottefoglie <cottefoglie@algorithmica.it>
 */
public class GeoObjectTest {

  private static TxManager txManager = null;
  private static final Void VOID = null;

  public GeoObjectTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
    if (txManager != null) {
      return;
    }

    Config config = new Config() {

      {
        domainModelPath = "src/common/dml/geograph-agent-farm.dml";
        dbAlias = "config/infinispanNoFile.xml";
        repositoryType = pt.ist.fenixframework.Config.RepositoryType.INFINISPAN;
        rootClass = Root.class;
      }
    };

    Init.initializeTxSystem(config, Framework.ISPN);
    txManager = TxSystem.getManager();
  }

  @After
  public void tearDown() {
  }

  @Test
  public void createAndFind() {
    txManager.withTransaction(new TransactionalCommand<Void>() {
      // store a geo object

      @Override
      public Void doIt() {
        Route route = new Route();
        BigDecimal lat = new BigDecimal("42.438878");
        BigDecimal lon = new BigDecimal("-71.119277");
        txManager.save(route);
        Root root = (Root) txManager.getRoot();
        route.setRoot(root);

        Position position = new Position();
        position.setLatitude(lat);
        position.setLongitude(lon);
        txManager.save(position);
        route.addPositions(position);
        return VOID;
      }
    });


    txManager.withTransaction(new TransactionalCommand<Position>() {
      // load the persisted geo object and check latitude and longitude

      @Override
      public Position doIt() {
        Root root = (Root) txManager.getRoot();
        Route route = (Route) root.getRoutes().toArray()[0];
        Position position = (Position) route.getPositions().toArray()[0];
        assertEquals(new BigDecimal("42.438878"), position.getLatitude());
        assertEquals(new BigDecimal("-71.119277"), position.getLongitude());
        position.setAgent(null);
        position.setRoute(null);
        return position;
      }
    });
  }

}
