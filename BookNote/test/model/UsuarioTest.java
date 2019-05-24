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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Usuario instance = new Usuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNickname method, of class Usuario.
     */
    @Test
    public void testGetNickname() {
        System.out.println("getNickname");
        Usuario instance = new Usuario();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNickname method, of class Usuario.
     */
    @Test
    public void testSetNickname() {
        System.out.println("setNickname");
        String nickname = "";
        Usuario instance = new Usuario();
        instance.setNickname(nickname);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPass method, of class Usuario.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Usuario instance = new Usuario();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPass method, of class Usuario.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        Usuario instance = new Usuario();
        instance.setPass(pass);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerfil method, of class Usuario.
     */
    @Test
    public void testGetPerfil() {
        System.out.println("getPerfil");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getPerfil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerfil method, of class Usuario.
     */
    @Test
    public void testSetPerfil() {
        System.out.println("setPerfil");
        int perfil = 0;
        Usuario instance = new Usuario();
        instance.setPerfil(perfil);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "wewe";
        String result = "wewe";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
