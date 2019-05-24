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
public class AlumnoApoderadoTest {
    
    public AlumnoApoderadoTest() {
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
     * Test of getId method, of class AlumnoApoderado.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AlumnoApoderado instance = new AlumnoApoderado();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class AlumnoApoderado.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        AlumnoApoderado instance = new AlumnoApoderado();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdAlumno method, of class AlumnoApoderado.
     */
    @Test
    public void testGetIdAlumno() {
        System.out.println("getIdAlumno");
        AlumnoApoderado instance = new AlumnoApoderado();
        int expResult = 0;
        int result = instance.getIdAlumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAlumno method, of class AlumnoApoderado.
     */
    @Test
    public void testSetIdAlumno() {
        System.out.println("setIdAlumno");
        int idAlumno = 0;
        AlumnoApoderado instance = new AlumnoApoderado();
        instance.setIdAlumno(idAlumno);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdApoderado method, of class AlumnoApoderado.
     */
    @Test
    public void testGetIdApoderado() {
        System.out.println("getIdApoderado");
        AlumnoApoderado instance = new AlumnoApoderado();
        int expResult = 0;
        int result = instance.getIdApoderado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdApoderado method, of class AlumnoApoderado.
     */
    @Test
    public void testSetIdApoderado() {
        System.out.println("setIdApoderado");
        int idApoderado = 0;
        AlumnoApoderado instance = new AlumnoApoderado();
        instance.setIdApoderado(idApoderado);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
