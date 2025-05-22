/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author igor
 */
public class TestFerramenta {
    
    public TestFerramenta() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getIdFerramenta method, of class Ferramenta.
     */
    @Test
    public void testGetIdFerramenta() {
        System.out.println("getIdFerramenta");
        Ferramenta instance = new Ferramenta();
        int expResult = 0;
        int result = instance.getIdFerramenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFerramenta method, of class Ferramenta.
     */
    @Test
    public void testSetIdFerramenta() {
        System.out.println("setIdFerramenta");
        int idFerramenta = 0;
        Ferramenta instance = new Ferramenta();
        instance.setIdFerramenta(idFerramenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeFerramenta method, of class Ferramenta.
     */
    @Test
    public void testGetNomeFerramenta() {
        System.out.println("getNomeFerramenta");
        Ferramenta instance = new Ferramenta();
        String expResult = "";
        String result = instance.getNomeFerramenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeFerramenta method, of class Ferramenta.
     */
    @Test
    public void testSetNomeFerramenta() {
        System.out.println("setNomeFerramenta");
        String nomeFerramenta = "";
        Ferramenta instance = new Ferramenta();
        instance.setNomeFerramenta(nomeFerramenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Ferramenta.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Ferramenta instance = new Ferramenta();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Ferramenta.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Ferramenta instance = new Ferramenta();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCusto method, of class Ferramenta.
     */
    @Test
    public void testGetCusto() {
        System.out.println("getCusto");
        Ferramenta instance = new Ferramenta();
        double expResult = 0.0;
        double result = instance.getCusto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCusto method, of class Ferramenta.
     */
    @Test
    public void testSetCusto() {
        System.out.println("setCusto");
        double custo = 0.0;
        Ferramenta instance = new Ferramenta();
        instance.setCusto(custo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of corrigirVirgula method, of class Ferramenta.
     */
    @Test
    public void testCorrigirVirgula() {
        System.out.println("corrigirVirgula");
        String valor = "";
        Ferramenta instance = new Ferramenta();
        String expResult = "";
        String result = instance.corrigirVirgula(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ferramenta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ferramenta instance = new Ferramenta();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaFerramenta method, of class Ferramenta.
     */
    @Test
    public void testGetListaFerramenta() {
        System.out.println("getListaFerramenta");
        Ferramenta instance = new Ferramenta();
        ArrayList<Ferramenta> expResult = null;
        ArrayList<Ferramenta> result = instance.getListaFerramenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregaFerramentaPorId method, of class Ferramenta.
     */
    @Test
    public void testCarregaFerramentaPorId() {
        System.out.println("carregaFerramentaPorId");
        int id = 0;
        Ferramenta instance = new Ferramenta();
        Ferramenta expResult = null;
        Ferramenta result = instance.carregaFerramentaPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirFerramentaBD method, of class Ferramenta.
     */
    @Test
    public void testInserirFerramentaBD() {
        System.out.println("inserirFerramentaBD");
        int id = 0;
        String nome = "";
        String marca = "";
        double custo = 0.0;
        Ferramenta instance = new Ferramenta();
        boolean expResult = false;
        boolean result = instance.inserirFerramentaBD(id, nome, marca, custo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarFerramentaBD method, of class Ferramenta.
     */
    @Test
    public void testDeletarFerramentaBD() {
        System.out.println("deletarFerramentaBD");
        int id = 0;
        Ferramenta instance = new Ferramenta();
        boolean expResult = false;
        boolean result = instance.deletarFerramentaBD(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarFerramentaBD method, of class Ferramenta.
     */
    @Test
    public void testAtualizarFerramentaBD() {
        System.out.println("atualizarFerramentaBD");
        int id = 0;
        String nome = "";
        String marca = "";
        double custo = 0.0;
        Ferramenta instance = new Ferramenta();
        boolean expResult = false;
        boolean result = instance.atualizarFerramentaBD(id, nome, marca, custo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maiorID method, of class Ferramenta.
     */
    @Test
    public void testMaiorID() {
        System.out.println("maiorID");
        Ferramenta instance = new Ferramenta();
        int expResult = 0;
        int result = instance.maiorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
