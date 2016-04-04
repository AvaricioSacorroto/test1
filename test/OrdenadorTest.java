/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ape
 */
public class OrdenadorTest {
    
    public OrdenadorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encenderOrdenador method, of class Ordenador.
     */
    @Test
    public void testEncenderOrdenador() {
        System.out.println("encenderOrdenador");
        Ordenador instance = new Ordenador();
        instance.encenderOrdenador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEstado method, of class Ordenador.
     */
    @Test
    public void testMostrarEstado() {
        System.out.println("mostrarEstado");
        Ordenador instance = new Ordenador();
        instance.mostrarEstado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagarOrdenador method, of class Ordenador.
     */
    @Test
    public void testApagarOrdenador() {
        System.out.println("apagarOrdenador");
        Ordenador instance = new Ordenador();
        instance.apagarOrdenador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarPantalla method, of class Ordenador.
     */
    @Test
    public void testAsignarPantalla() {
        System.out.println("asignarPantalla");
        String pantalla = "";
        Ordenador instance = new Ordenador();
        instance.asignarPantalla(pantalla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarGarantia method, of class Ordenador.
     */
//    @Test
//    public void testMostrarGarantia() {
//        System.out.println("mostrarGarantia");
//        Ordenador.mostrarGarantia();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
