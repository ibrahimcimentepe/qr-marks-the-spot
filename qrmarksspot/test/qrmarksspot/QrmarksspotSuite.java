/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author acar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({qrmarksspot.gameStepsTest.class,qrmarksspot.signupTest.class,qrmarksspot.createGameTest.class,qrmarksspot.SessionBean1Test.class,qrmarksspot.ApplicationBean1Test.class,qrmarksspot.loginTest.class,qrmarksspot.RequestBean1Test.class,qrmarksspot.homeTest.class})
public class QrmarksspotSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}