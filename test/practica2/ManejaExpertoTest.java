/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Modelo.Experto;
import org.hibernate.HibernateException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Horizon
 */
public class ManejaExpertoTest {
    
    public ManejaExpertoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of iniciaOperacion method, of class ManejaExperto.
     */
    /*@Test
    public void testIniciaOperacion() {
        System.out.println("iniciaOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.iniciaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of finalizaOperacion method, of class ManejaExperto.
     */
    /*@Test
    public void testFinalizaOperacion() {
        System.out.println("finalizaOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.finalizaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of manejaExcepcion method, of class ManejaExperto.
     */
    /*@Test
    public void testManejaExcepcion() {
        System.out.println("manejaExcepcion");
        HibernateException he = null;
        ManejaExperto instance = new ManejaExperto();
        instance.manejaExcepcion(he);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of guardaExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testGuardaExperto() {
        System.out.println("guardaExperto");
        Experto experto = new Experto("E011","Adelino Gutiérrez","España",'M',"Criminología");
        Experto experto1 = null;
        ManejaExperto instance = new ManejaExperto();
        instance.guardaExperto(experto);
        
        experto1 = instance.obtenExperto("E011");
        
        assertTrue(experto.getCodexperto().equals(experto1.getCodexperto()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of eliminaExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testEliminaExperto() {
        System.out.println("eliminaExperto");
        Experto experto = null;
        ManejaExperto instance = new ManejaExperto();
        instance.eliminaExperto(experto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizaExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testActualizaExperto() {
        System.out.println("actualizaExperto");
        Experto experto = null;
        ManejaExperto instance = new ManejaExperto();
        instance.actualizaExperto(experto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testObtenExperto() {
        System.out.println("obtenExperto");
        String idExperto = "";
        ManejaExperto instance = new ManejaExperto();
        Experto expResult = null;
        Experto result = instance.obtenExperto(idExperto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenNombresyEspecialidad method, of class ManejaExperto.
     */
    /*@Test
    public void testObtenNombresyEspecialidad() {
        System.out.println("obtenNombresyEspecialidad");
        ManejaExperto instance = new ManejaExperto();
        instance.obtenNombresyEspecialidad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaConParametro method, of class ManejaExperto.
     */
    /*@Test
    public void testListaConParametro() {
        System.out.println("listaConParametro");
        String keyword = "";
        ManejaExperto instance = new ManejaExperto();
        instance.listaConParametro(keyword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenCasos method, of class ManejaExperto.
     */
    /*@Test
    public void testObtenCasos() {
        System.out.println("obtenCasos");
        ManejaExperto instance = new ManejaExperto();
        instance.obtenCasos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
