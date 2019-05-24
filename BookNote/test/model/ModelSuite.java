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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Berny
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({model.AlumnoApoderadoTest.class, model.PerfilTest.class, model.PersonaTest.class, model.AsignaturaTest.class, model.PruebaSelectTest.class, model.UsuarioTest.class, model.AsignaturaAlumnoTest.class, model.MensajeTest.class, model.PruebaTest.class, model.AsistenciaTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
