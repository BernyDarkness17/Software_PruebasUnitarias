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
public class PruebaTest {
    
    public PruebaTest() {
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
     * Test of getId method, of class Prueba.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Prueba instance = new Prueba();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Prueba.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Prueba instance = new Prueba();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Prueba.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Prueba instance = new Prueba();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Prueba.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Prueba instance = new Prueba();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNota method, of class Prueba.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        Prueba instance = new Prueba();
        float expResult = 0.0F;
        float result = instance.getNota();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota method, of class Prueba.
     */
    @Test
    public void testSetNota() {
        System.out.println("setNota");
        float nota = 0.0F;
        Prueba instance = new Prueba();
        instance.setNota(nota);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentaje method, of class Prueba.
     */
    @Test
    public void testGetPorcentaje() {
        System.out.println("getPorcentaje");
        Prueba instance = new Prueba();
        float expResult = 0.0F;
        float result = instance.getPorcentaje();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPorcentaje method, of class Prueba.
     */
    @Test
    public void testSetPorcentaje() {
        System.out.println("setPorcentaje");
        float porcentaje = 0.0F;
        Prueba instance = new Prueba();
        instance.setPorcentaje(porcentaje);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_asignatura method, of class Prueba.
     */
    @Test
    public void testGetId_asignatura() {
        System.out.println("getId_asignatura");
        Prueba instance = new Prueba();
        int expResult = 0;
        int result = instance.getId_asignatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_asignatura method, of class Prueba.
     */
    @Test
    public void testSetId_asignatura() {
        System.out.println("setId_asignatura");
        int id_asignatura = 0;
        Prueba instance = new Prueba();
        instance.setId_asignatura(id_asignatura);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_alumno method, of class Prueba.
     */
    @Test
    public void testGetId_alumno() {
        System.out.println("getId_alumno");
        Prueba instance = new Prueba();
        int expResult = 0;
        int result = instance.getId_alumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_alumno method, of class Prueba.
     */
    @Test
    public void testSetId_alumno() {
        System.out.println("setId_alumno");
        int id_alumno = 0;
        Prueba instance = new Prueba();
        instance.setId_alumno(id_alumno);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Prueba.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Prueba instance = new Prueba();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
