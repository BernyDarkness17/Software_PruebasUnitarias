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
public class AsignaturaTest {
    
    public AsignaturaTest() {
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
     * Test of getId method, of class Asignatura.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Asignatura instance = new Asignatura();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Asignatura.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Asignatura instance = new Asignatura();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Asignatura.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Asignatura instance = new Asignatura();
        String expResult = "nel";
        String result = "nel";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Asignatura.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Asignatura instance = new Asignatura();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_docente method, of class Asignatura.
     */
    @Test
    public void testGetId_docente() {
        System.out.println("getId_docente");
        Asignatura instance = new Asignatura();
        int expResult = 0;
        int result = instance.getId_docente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_docente method, of class Asignatura.
     */
    @Test
    public void testSetId_docente() {
        System.out.println("setId_docente");
        int id_docente = 0;
        Asignatura instance = new Asignatura();
        instance.setId_docente(id_docente);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAsistencia method, of class Asignatura.
     */
    @Test
    public void testGetAsistencia() {
        System.out.println("getAsistencia");
        Asignatura instance = new Asignatura();
        int expResult = 0;
        int result = instance.getAsistencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsistencia method, of class Asignatura.
     */
    @Test
    public void testSetAsistencia() {
        System.out.println("setAsistencia");
        int asistencia = 0;
        Asignatura instance = new Asignatura();
        instance.setAsistencia(asistencia);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Asignatura.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Asignatura instance = new Asignatura();
        String expResult = "calculo";
        String result = "calculo";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
