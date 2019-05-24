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
public class AsignaturaAlumnoTest {
    
    public AsignaturaAlumnoTest() {
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
     * Test of getId method, of class AsignaturaAlumno.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AsignaturaAlumno instance = new AsignaturaAlumno();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class AsignaturaAlumno.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        AsignaturaAlumno instance = new AsignaturaAlumno();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_asignatura method, of class AsignaturaAlumno.
     */
    @Test
    public void testGetId_asignatura() {
        System.out.println("getId_asignatura");
        AsignaturaAlumno instance = new AsignaturaAlumno();
        int expResult = 0;
        int result = instance.getId_asignatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_asignatura method, of class AsignaturaAlumno.
     */
    @Test
    public void testSetId_asignatura() {
        System.out.println("setId_asignatura");
        int id_asignatura = 0;
        AsignaturaAlumno instance = new AsignaturaAlumno();
        instance.setId_asignatura(id_asignatura);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_alumno method, of class AsignaturaAlumno.
     */
    @Test
    public void testGetId_alumno() {
        System.out.println("getId_alumno");
        AsignaturaAlumno instance = new AsignaturaAlumno();
        int expResult = 0;
        int result = instance.getId_alumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_alumno method, of class AsignaturaAlumno.
     */
    @Test
    public void testSetId_alumno() {
        System.out.println("setId_alumno");
        int id_alumno = 0;
        AsignaturaAlumno instance = new AsignaturaAlumno();
        instance.setId_alumno(id_alumno);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AsignaturaAlumno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AsignaturaAlumno instance = new AsignaturaAlumno();
        String expResult = "calculo";
        String result = "calculo";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
