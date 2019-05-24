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
public class MensajeTest {
    
    public MensajeTest() {
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
     * Test of getId method, of class Mensaje.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Mensaje instance = new Mensaje();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Mensaje.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Mensaje instance = new Mensaje();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTexto method, of class Mensaje.
     */
    @Test
    public void testGetTexto() {
        System.out.println("getTexto");
        Mensaje instance = new Mensaje();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTexto method, of class Mensaje.
     */
    @Test
    public void testSetTexto() {
        System.out.println("setTexto");
        String texto = "";
        Mensaje instance = new Mensaje();
        instance.setTexto(texto);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Mensaje.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Mensaje instance = new Mensaje();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Mensaje.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Mensaje instance = new Mensaje();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_asignatura method, of class Mensaje.
     */
    @Test
    public void testGetId_asignatura() {
        System.out.println("getId_asignatura");
        Mensaje instance = new Mensaje();
        int expResult = 0;
        int result = instance.getId_asignatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_asignatura method, of class Mensaje.
     */
    @Test
    public void testSetId_asignatura() {
        System.out.println("setId_asignatura");
        int id_asignatura = 0;
        Mensaje instance = new Mensaje();
        instance.setId_asignatura(id_asignatura);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Mensaje.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mensaje instance = new Mensaje();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
