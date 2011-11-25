/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class MySqlConnectionTest {

    public MySqlConnectionTest() {
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
     * Test of addUser method, of class MySqlConnection.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        String username = "";
        String password = "";
        String birthDay = "";
        MySqlConnection instance = new MySqlConnection();
        boolean expResult = false;
        boolean result = instance.addUser(username, password, birthDay);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserPicture method, of class MySqlConnection.
     */
    @Test
    public void testUpdateUserPicture_String_InputStream() {
        System.out.println("updateUserPicture");
        String username = "";
        InputStream in = null;
        MySqlConnection instance = new MySqlConnection();
        boolean expResult = false;
        boolean result = instance.updateUserPicture(username, in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserPicture method, of class MySqlConnection.
     */
    @Test
    public void testUpdateUserPicture_5args() {
        System.out.println("updateUserPicture");
        String username = "";
        String password = "";
        String birhtDay = "";
        InputStream in = null;
        String filePath = "";
        MySqlConnection instance = new MySqlConnection();
        boolean expResult = false;
        boolean result = instance.updateUserPicture(username, password, birhtDay, in, filePath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpassword method, of class MySqlConnection.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        String username = "";
        MySqlConnection instance = new MySqlConnection();
        String expResult = "";
        String result = instance.getpassword(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userExists method, of class MySqlConnection.
     */
    @Test
    public void testUserExists() {
        System.out.println("userExists");
        String username = "";
        String password = "";
        MySqlConnection instance = new MySqlConnection();
        boolean expResult = false;
        boolean result = instance.userExists(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class MySqlConnection.
     */
    @Test
    public void testFinalize() throws Exception {
        System.out.println("finalize");
        MySqlConnection instance = new MySqlConnection();
        try {
            instance.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(MySqlConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}