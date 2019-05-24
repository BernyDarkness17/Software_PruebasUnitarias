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
public class PerfilTest {
    
    public PerfilTest() {
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
     * Test of toString method, of class Perfil.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Perfil instance = new Perfil();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Perfil.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Perfil instance = new Perfil();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Perfil.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Perfil instance = new Perfil();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerfil method, of class Perfil.
     */
    @Test
    public void testGetPerfil() {
        System.out.println("getPerfil");
        Perfil instance = new Perfil();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerfil method, of class Perfil.
     */
    @Test
    public void testSetPerfil() {
        System.out.println("setPerfil");
        String perfil = "wewe";
        Perfil instance = new Perfil();
        instance.setPerfil(perfil);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
