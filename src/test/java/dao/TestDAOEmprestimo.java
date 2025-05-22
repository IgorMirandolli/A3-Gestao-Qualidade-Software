/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Emprestimo;
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
public class TestDAOEmprestimo {
    
    public TestDAOEmprestimo() {
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
     * Test of getMinhaLista method, of class EmprestimoDAO.
     */
    @Test
    public void testGetMinhaLista() {
        System.out.println("getMinhaLista");
        EmprestimoDAO instance = new EmprestimoDAO();
        ArrayList<Emprestimo> expResult = null;
        ArrayList<Emprestimo> result = instance.getMinhaLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregaEmprestimoPorId method, of class EmprestimoDAO.
     */
    @Test
    public void testCarregaEmprestimoPorId() {
        System.out.println("carregaEmprestimoPorId");
        int id = 0;
        EmprestimoDAO instance = new EmprestimoDAO();
        Emprestimo expResult = null;
        Emprestimo result = instance.carregaEmprestimoPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirEmprestimoBD method, of class EmprestimoDAO.
     */
    @Test
    public void testInserirEmprestimoBD() {
        System.out.println("inserirEmprestimoBD");
        Emprestimo objeto = null;
        EmprestimoDAO instance = new EmprestimoDAO();
        boolean expResult = false;
        boolean result = instance.inserirEmprestimoBD(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maiorID method, of class EmprestimoDAO.
     */
    @Test
    public void testMaiorID() {
        System.out.println("maiorID");
        EmprestimoDAO instance = new EmprestimoDAO();
        int expResult = 0;
        int result = instance.maiorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarEmprestimoBD method, of class EmprestimoDAO.
     */
    @Test
    public void testDeletarEmprestimoBD() {
        System.out.println("deletarEmprestimoBD");
        int id = 0;
        EmprestimoDAO instance = new EmprestimoDAO();
        boolean expResult = false;
        boolean result = instance.deletarEmprestimoBD(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarEmprestimoBD method, of class EmprestimoDAO.
     */
    @Test
    public void testAtualizarEmprestimoBD() {
        System.out.println("atualizarEmprestimoBD");
        Emprestimo objeto = null;
        EmprestimoDAO instance = new EmprestimoDAO();
        boolean expResult = false;
        boolean result = instance.atualizarEmprestimoBD(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
