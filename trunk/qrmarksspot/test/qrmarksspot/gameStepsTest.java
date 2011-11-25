/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acar
 */
public class gameStepsTest {

    public gameStepsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class gameSteps.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        gameSteps instance = new gameSteps();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preprocess method, of class gameSteps.
     */
    @Test
    public void testPreprocess() {
        System.out.println("preprocess");
        gameSteps instance = new gameSteps();
        instance.preprocess();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prerender method, of class gameSteps.
     */
    @Test
    public void testPrerender() {
        System.out.println("prerender");
        gameSteps instance = new gameSteps();
        instance.prerender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class gameSteps.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        gameSteps instance = new gameSteps();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestBean1 method, of class gameSteps.
     */
    @Test
    public void testGetRequestBean1() {
        System.out.println("getRequestBean1");
        gameSteps instance = new gameSteps();
        RequestBean1 expResult = null;
        RequestBean1 result = instance.getRequestBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class gameSteps.
     */
    @Test
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        gameSteps instance = new gameSteps();
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionBean1 method, of class gameSteps.
     */
    @Test
    public void testGetSessionBean1() {
        System.out.println("getSessionBean1");
        gameSteps instance = new gameSteps();
        SessionBean1 expResult = null;
        SessionBean1 result = instance.getSessionBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}