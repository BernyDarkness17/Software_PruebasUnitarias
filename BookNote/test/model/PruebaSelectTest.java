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
public class PruebaSelectTest {

    public PruebaSelectTest() {
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
     * Test of getId method, of class PruebaSelect.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PruebaSelect instance = new PruebaSelect();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PruebaSelect.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        PruebaSelect instance = new PruebaSelect();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class PruebaSelect.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        PruebaSelect instance = new PruebaSelect();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class PruebaSelect.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        PruebaSelect instance = new PruebaSelect();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNota method, of class PruebaSelect.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        PruebaSelect instance = new PruebaSelect();
        float expResult = 0.0F;
        float result = instance.getNota();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota method, of class PruebaSelect.
     */
    @Test
    public void testSetNota() {
        System.out.println("setNota");
        float nota = 0.0F;
        PruebaSelect instance = new PruebaSelect();
        instance.setNota(nota);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentaje method, of class PruebaSelect.
     */
    @Test
    public void testGetPorcentaje() {
        System.out.println("getPorcentaje");
        PruebaSelect instance = new PruebaSelect();
        float expResult = 0.0F;
        float result = instance.getPorcentaje();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPorcentaje method, of class PruebaSelect.
     */
    @Test
    public void testSetPorcentaje() {
        System.out.println("setPorcentaje");
        float porcentaje = 0.0F;
        PruebaSelect instance = new PruebaSelect();
        instance.setPorcentaje(porcentaje);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_asignatura method, of class PruebaSelect.
     */
    @Test
    public void testGetId_asignatura() {
        System.out.println("getId_asignatura");
        PruebaSelect instance = new PruebaSelect();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_asignatura method, of class PruebaSelect.
     */
    @Test
    public void testSetId_asignatura() {
        System.out.println("setId_asignatura");
        String id_asignatura = "";
        PruebaSelect instance = new PruebaSelect();
        instance.setId_asignatura(id_asignatura);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_alumno method, of class PruebaSelect.
     */
    @Test
    public void testGetId_alumno() {
        System.out.println("getId_alumno");
        PruebaSelect instance = new PruebaSelect();
        int expResult = 0;
        int result = instance.getId_alumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_alumno method, of class PruebaSelect.
     */
    @Test
    public void testSetId_alumno() {
        System.out.println("setId_alumno");
        int id_alumno = 0;
        PruebaSelect instance = new PruebaSelect();
        instance.setId_alumno(id_alumno);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
