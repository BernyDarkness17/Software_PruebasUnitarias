/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Berny
 */
public class AsistenciaTest {
    
    public AsistenciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Asistencia.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Asistencia instance = new Asistencia();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Asistencia.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Asistencia instance = new Asistencia();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Asistencia.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Asistencia instance = new Asistencia();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Asistencia.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Asistencia instance = new Asistencia();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isAsistio method, of class Asistencia.
     */
    @Test
    public void testIsAsistio() {
        System.out.println("isAsistio");
        Asistencia instance = new Asistencia();
        boolean expResult = false;
        boolean result = instance.isAsistio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsistio method, of class Asistencia.
     */
    @Test
    public void testSetAsistio() {
        System.out.println("setAsistio");
        boolean asistio = false;
        Asistencia instance = new Asistencia();
        instance.setAsistio(asistio);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Asistencia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Asistencia instance = new Asistencia();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
