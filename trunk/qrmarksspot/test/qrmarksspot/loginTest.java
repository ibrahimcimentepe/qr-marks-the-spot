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
public class loginTest {

    public loginTest() {
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
     * Test of init method, of class login.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        login instance = new login();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preprocess method, of class login.
     */
    @Test
    public void testPreprocess() {
        System.out.println("preprocess");
        login instance = new login();
        instance.preprocess();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prerender method, of class login.
     */
    @Test
    public void testPrerender() {
        System.out.println("prerender");
        login instance = new login();
        instance.prerender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class login.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        login instance = new login();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionBean1 method, of class login.
     */
    @Test
    public void testGetSessionBean1() {
        System.out.println("getSessionBean1");
        login instance = new login();
        SessionBean1 expResult = null;
        SessionBean1 result = instance.getSessionBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class login.
     */
    @Test
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        login instance = new login();
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestBean1 method, of class login.
     */
    @Test
    public void testGetRequestBean1() {
        System.out.println("getRequestBean1");
        login instance = new login();
        RequestBean1 expResult = null;
        RequestBean1 result = instance.getRequestBean1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login_action method, of class login.
     */
    @Test
    public void testLogin_action() {
        System.out.println("login_action");
        login instance = new login();
        String expResult = "";
        String result = instance.login_action();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class login.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        login instance = new login();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class login.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        login instance = new login();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWarning method, of class login.
     */
    @Test
    public void testGetWarning() {
        System.out.println("getWarning");
        login instance = new login();
        String expResult = "";
        String result = instance.getWarning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class login.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        login instance = new login();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class login.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        login instance = new login();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWarning method, of class login.
     */
    @Test
    public void testSetWarning() {
        System.out.println("setWarning");
        String warning = "";
        login instance = new login();
        instance.setWarning(warning);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}