/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
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
public class TestEmprestimo {
    
    public TestEmprestimo() {
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
     * Test of getIdEmprestimo method, of class Emprestimo.
     */
    @Test
    public void testGetIdEmprestimo() {
        System.out.println("getIdEmprestimo");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.getIdEmprestimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEmprestimo method, of class Emprestimo.
     */
    @Test
    public void testSetIdEmprestimo() {
        System.out.println("setIdEmprestimo");
        int idEmprestimo = 0;
        Emprestimo instance = new Emprestimo();
        instance.setIdEmprestimo(idEmprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdAmigo method, of class Emprestimo.
     */
    @Test
    public void testGetIdAmigo() {
        System.out.println("getIdAmigo");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.getIdAmigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAmigo method, of class Emprestimo.
     */
    @Test
    public void testSetIdAmigo() {
        System.out.println("setIdAmigo");
        int idAmigo = 0;
        Emprestimo instance = new Emprestimo();
        instance.setIdAmigo(idAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdFerramenta method, of class Emprestimo.
     */
    @Test
    public void testGetIdFerramenta() {
        System.out.println("getIdFerramenta");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.getIdFerramenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFerramenta method, of class Emprestimo.
     */
    @Test
    public void testSetIdFerramenta() {
        System.out.println("setIdFerramenta");
        int idFerramenta = 0;
        Emprestimo instance = new Emprestimo();
        instance.setIdFerramenta(idFerramenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEmprestimo method, of class Emprestimo.
     */
    @Test
    public void testGetDataEmprestimo() {
        System.out.println("getDataEmprestimo");
        Emprestimo instance = new Emprestimo();
        Date expResult = null;
        Date result = instance.getDataEmprestimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataEmprestimo method, of class Emprestimo.
     */
    @Test
    public void testSetDataEmprestimo() {
        System.out.println("setDataEmprestimo");
        java.sql.Date dataEmprestimo = null;
        Emprestimo instance = new Emprestimo();
        instance.setDataEmprestimo(dataEmprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDevolucao method, of class Emprestimo.
     */
    @Test
    public void testGetDataDevolucao() {
        System.out.println("getDataDevolucao");
        Emprestimo instance = new Emprestimo();
        Date expResult = null;
        Date result = instance.getDataDevolucao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDevolucao method, of class Emprestimo.
     */
    @Test
    public void testSetDataDevolucao() {
        System.out.println("setDataDevolucao");
        java.sql.Date dataDevolucao = null;
        Emprestimo instance = new Emprestimo();
        instance.setDataDevolucao(dataDevolucao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPendente method, of class Emprestimo.
     */
    @Test
    public void testGetPendente() {
        System.out.println("getPendente");
        Emprestimo instance = new Emprestimo();
        boolean expResult = false;
        boolean result = instance.getPendente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPendente method, of class Emprestimo.
     */
    @Test
    public void testSetPendente() {
        System.out.println("setPendente");
        boolean pendente = false;
        Emprestimo instance = new Emprestimo();
        instance.setPendente(pendente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFerramenta method, of class Emprestimo.
     */
    @Test
    public void testGetFerramenta() {
        System.out.println("getFerramenta");
        Emprestimo instance = new Emprestimo();
        Ferramenta expResult = null;
        Ferramenta result = instance.getFerramenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFerramenta method, of class Emprestimo.
     */
    @Test
    public void testSetFerramenta() {
        System.out.println("setFerramenta");
        Ferramenta ferramenta = null;
        Emprestimo instance = new Emprestimo();
        instance.setFerramenta(ferramenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmigo method, of class Emprestimo.
     */
    @Test
    public void testGetAmigo() {
        System.out.println("getAmigo");
        Emprestimo instance = new Emprestimo();
        Amigo expResult = null;
        Amigo result = instance.getAmigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmigo method, of class Emprestimo.
     */
    @Test
    public void testSetAmigo() {
        System.out.println("setAmigo");
        Amigo amigo = null;
        Emprestimo instance = new Emprestimo();
        instance.setAmigo(amigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Emprestimo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Emprestimo instance = new Emprestimo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinhaLista method, of class Emprestimo.
     */
    @Test
    public void testGetMinhaLista() {
        System.out.println("getMinhaLista");
        Emprestimo instance = new Emprestimo();
        ArrayList<Emprestimo> expResult = null;
        ArrayList<Emprestimo> result = instance.getMinhaLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregaEmprestimoPorId method, of class Emprestimo.
     */
    @Test
    public void testCarregaEmprestimoPorId() {
        System.out.println("carregaEmprestimoPorId");
        int id = 0;
        Emprestimo instance = new Emprestimo();
        Emprestimo expResult = null;
        Emprestimo result = instance.carregaEmprestimoPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maiorID method, of class Emprestimo.
     */
    @Test
    public void testMaiorID() {
        System.out.println("maiorID");
        Emprestimo instance = new Emprestimo();
        int expResult = 0;
        int result = instance.maiorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirEmprestimoBD method, of class Emprestimo.
     */
    @Test
    public void testInserirEmprestimoBD() {
        System.out.println("inserirEmprestimoBD");
        int id = 0;
        int idAmigo = 0;
        int idFerramenta = 0;
        java.sql.Date dataEmprestimo = null;
        boolean pendente = false;
        Ferramenta ferramenta = null;
        Amigo amigo = null;
        Emprestimo instance = new Emprestimo();
        boolean expResult = false;
        boolean result = instance.inserirEmprestimoBD(id, idAmigo, idFerramenta, dataEmprestimo, pendente, ferramenta, amigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarEmprestimoBD method, of class Emprestimo.
     */
    @Test
    public void testDeletarEmprestimoBD() {
        System.out.println("deletarEmprestimoBD");
        int id = 0;
        Emprestimo instance = new Emprestimo();
        boolean expResult = false;
        boolean result = instance.deletarEmprestimoBD(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarEmprestimoBD method, of class Emprestimo.
     */
    @Test
    public void testAtualizarEmprestimoBD() {
        System.out.println("atualizarEmprestimoBD");
        int id = 0;
        int idAmigo = 0;
        int idFerramenta = 0;
        java.sql.Date dataEmprestimo = null;
        java.sql.Date dataDevolucao = null;
        boolean pendente = false;
        Emprestimo instance = new Emprestimo();
        boolean expResult = false;
        boolean result = instance.atualizarEmprestimoBD(id, idAmigo, idFerramenta, dataEmprestimo, dataDevolucao, pendente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
