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
public class ApplicationBean1Test {

    public ApplicationBean1Test() {
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
     * Test of init method, of class ApplicationBean1.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ApplicationBean1 instance = new ApplicationBean1();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ApplicationBean1.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        ApplicationBean1 instance = new ApplicationBean1();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocaleCharacterEncoding method, of class ApplicationBean1.
     */
    @Test
    public void testGetLocaleCharacterEncoding() {
        System.out.println("getLocaleCharacterEncoding");
        ApplicationBean1 instance = new ApplicationBean1();
        String expResult = "";
        String result = instance.getLocaleCharacterEncoding();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}