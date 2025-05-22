/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Amigo;
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
public class TestDAOAmigo {
    
    public TestDAOAmigo() {
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
     * Test of getListaAmigo method, of class AmigoDAO.
     */
    @Test
    public void testGetListaAmigo() {
        System.out.println("getListaAmigo");
        AmigoDAO instance = new AmigoDAO();
        ArrayList<Amigo> expResult = null;
        ArrayList<Amigo> result = instance.getListaAmigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregaAmigoPorId method, of class AmigoDAO.
     */
    @Test
    public void testCarregaAmigoPorId() {
        System.out.println("carregaAmigoPorId");
        int id = 0;
        AmigoDAO instance = new AmigoDAO();
        Amigo expResult = null;
        Amigo result = instance.carregaAmigoPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAmigoBD method, of class AmigoDAO.
     */
    @Test
    public void testInserirAmigoBD() {
        System.out.println("inserirAmigoBD");
        Amigo objeto = null;
        AmigoDAO instance = new AmigoDAO();
        boolean expResult = false;
        boolean result = instance.inserirAmigoBD(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maiorID method, of class AmigoDAO.
     */
    @Test
    public void testMaiorID() {
        System.out.println("maiorID");
        AmigoDAO instance = new AmigoDAO();
        int expResult = 0;
        int result = instance.maiorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarAmigoBD method, of class AmigoDAO.
     */
    @Test
    public void testDeletarAmigoBD() {
        System.out.println("deletarAmigoBD");
        int idAmigo = 0;
        AmigoDAO instance = new AmigoDAO();
        boolean expResult = false;
        boolean result = instance.deletarAmigoBD(idAmigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarAmigoBD method, of class AmigoDAO.
     */
    @Test
    public void testAtualizarAmigoBD() {
        System.out.println("atualizarAmigoBD");
        Amigo objeto = null;
        AmigoDAO instance = new AmigoDAO();
        boolean expResult = false;
        boolean result = instance.atualizarAmigoBD(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaEmprestimoPendente method, of class AmigoDAO.
     */
    @Test
    public void testVerificaEmprestimoPendente() {
        System.out.println("verificaEmprestimoPendente");
        int id = 0;
        boolean expResult = false;
        boolean result = AmigoDAO.verificaEmprestimoPendente(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
