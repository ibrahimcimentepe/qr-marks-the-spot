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
public class RequestBean1Test {

    public RequestBean1Test() {
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
     * Test of init method, of class RequestBean1.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        RequestBean1 instance = new RequestBean1();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class RequestBean1.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        RequestBean1 instance = new RequestBean1();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionBean1 method, of class RequestBean1.
     */
    @Test
    public void testGetSessionBean1() {
        System.out.println("getSessionBean1");
        RequestBean1 instance = new RequestBean1();
        SessionBean1 expResult = null;
        SessionBean1 result = instance.getSessionBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class RequestBean1.
     */
    @Test
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        RequestBean1 instance = new RequestBean1();
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}