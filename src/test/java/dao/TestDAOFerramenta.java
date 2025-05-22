/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Ferramenta;
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
public class TestDAOFerramenta {
    
    public TestDAOFerramenta() {
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
     * Test of getListaFerramenta method, of class FerramentaDAO.
     */
    @Test
    public void testGetListaFerramenta() {
        System.out.println("getListaFerramenta");
        FerramentaDAO instance = new FerramentaDAO();
        ArrayList<Ferramenta> expResult = null;
        ArrayList<Ferramenta> result = instance.getListaFerramenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregaFerramentaPorId method, of class FerramentaDAO.
     */
    @Test
    public void testCarregaFerramentaPorId() {
        System.out.println("carregaFerramentaPorId");
        int id = 0;
        FerramentaDAO instance = new FerramentaDAO();
        Ferramenta expResult = null;
        Ferramenta result = instance.carregaFerramentaPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirFerramentaBD method, of class FerramentaDAO.
     */
    @Test
    public void testInserirFerramentaBD() {
        System.out.println("inserirFerramentaBD");
        Ferramenta objeto = null;
        FerramentaDAO instance = new FerramentaDAO();
        boolean expResult = false;
        boolean result = instance.inserirFerramentaBD(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maiorID method, of class FerramentaDAO.
     */
    @Test
    public void testMaiorID() {
        System.out.println("maiorID");
        FerramentaDAO instance = new FerramentaDAO();
        int expResult = 0;
        int result = instance.maiorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarFerramentaBD method, of class FerramentaDAO.
     */
    @Test
    public void testDeletarFerramentaBD() {
        System.out.println("deletarFerramentaBD");
        int id = 0;
        FerramentaDAO instance = new FerramentaDAO();
        boolean expResult = false;
        boolean result = instance.deletarFerramentaBD(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarFerramentaBD method, of class FerramentaDAO.
     */
    @Test
    public void testAtualizarFerramentaBD() {
        System.out.println("atualizarFerramentaBD");
        Ferramenta objeto = null;
        FerramentaDAO instance = new FerramentaDAO();
        boolean expResult = false;
        boolean result = instance.atualizarFerramentaBD(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaDisponibilidade method, of class FerramentaDAO.
     */
    @Test
    public void testVerificaDisponibilidade() {
        System.out.println("verificaDisponibilidade");
        int idFerramenta = 0;
        boolean expResult = false;
        boolean result = FerramentaDAO.verificaDisponibilidade(idFerramenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
