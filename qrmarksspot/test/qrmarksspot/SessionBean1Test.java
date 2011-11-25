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
public class SessionBean1Test {

    public SessionBean1Test() {
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
     * Test of init method, of class SessionBean1.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        SessionBean1 instance = new SessionBean1();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passivate method, of class SessionBean1.
     */
    @Test
    public void testPassivate() {
        System.out.println("passivate");
        SessionBean1 instance = new SessionBean1();
        instance.passivate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activate method, of class SessionBean1.
     */
    @Test
    public void testActivate() {
        System.out.println("activate");
        SessionBean1 instance = new SessionBean1();
        instance.activate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class SessionBean1.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        SessionBean1 instance = new SessionBean1();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class SessionBean1.
     */
    @Test
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        SessionBean1 instance = new SessionBean1();
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class SessionBean1.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        SessionBean1 instance = new SessionBean1();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class SessionBean1.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        SessionBean1 instance = new SessionBean1();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLoggedIn method, of class SessionBean1.
     */
    @Test
    public void testIsLoggedIn() {
        System.out.println("isLoggedIn");
        SessionBean1 instance = new SessionBean1();
        boolean expResult = false;
        boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoggedIn method, of class SessionBean1.
     */
    @Test
    public void testSetLoggedIn() {
        System.out.println("setLoggedIn");
        boolean loggedIn = false;
        SessionBean1 instance = new SessionBean1();
        instance.setLoggedIn(loggedIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class SessionBean1.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        SessionBean1 instance = new SessionBean1();
        instance.login(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class SessionBean1.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        SessionBean1 instance = new SessionBean1();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}