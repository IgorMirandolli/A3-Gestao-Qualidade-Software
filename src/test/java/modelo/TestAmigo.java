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
public class TestAmigo {
    
    public TestAmigo() {
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
     * Test of getIdAmigo method, of class Amigo.
     */
    @Test
    public void testGetIdAmigo() {
        System.out.println("getIdAmigo");
        Amigo instance = new Amigo();
        int expResult = 0;
        int result = instance.getIdAmigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAmigo method, of class Amigo.
     */
    @Test
    public void testSetIdAmigo() {
        System.out.println("setIdAmigo");
        int idAmigo = 0;
        Amigo instance = new Amigo();
        instance.setIdAmigo(idAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeAmigo method, of class Amigo.
     */
    @Test
    public void testGetNomeAmigo() {
        System.out.println("getNomeAmigo");
        Amigo instance = new Amigo();
        String expResult = "";
        String result = instance.getNomeAmigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeAmigo method, of class Amigo.
     */
    @Test
    public void testSetNomeAmigo() {
        System.out.println("setNomeAmigo");
        String nomeAmigo = "";
        Amigo instance = new Amigo();
        instance.setNomeAmigo(nomeAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Amigo.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Amigo instance = new Amigo();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Amigo.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Amigo instance = new Amigo();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Amigo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Amigo instance = new Amigo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limparTelefone method, of class Amigo.
     */
    @Test
    public void testLimparTelefone() {
        System.out.println("limparTelefone");
        String telefone = "";
        Amigo instance = new Amigo();
        String expResult = "";
        String result = instance.limparTelefone(telefone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaAmigo method, of class Amigo.
     */
    @Test
    public void testGetListaAmigo() {
        System.out.println("getListaAmigo");
        Amigo instance = new Amigo();
        ArrayList<Amigo> expResult = null;
        ArrayList<Amigo> result = instance.getListaAmigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregaAmigoPorId method, of class Amigo.
     */
    @Test
    public void testCarregaAmigoPorId() {
        System.out.println("carregaAmigoPorId");
        int id = 0;
        Amigo instance = new Amigo();
        Amigo expResult = null;
        Amigo result = instance.carregaAmigoPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserirAmigoBD method, of class Amigo.
     */
    @Test
    public void testInserirAmigoBD() {
        System.out.println("inserirAmigoBD");
        int id = 0;
        String nome = "";
        String telefone = "";
        Amigo instance = new Amigo();
        boolean expResult = false;
        boolean result = instance.inserirAmigoBD(id, nome, telefone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maiorID method, of class Amigo.
     */
    @Test
    public void testMaiorID() {
        System.out.println("maiorID");
        Amigo instance = new Amigo();
        int expResult = 0;
        int result = instance.maiorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarAmigoBD method, of class Amigo.
     */
    @Test
    public void testDeletarAmigoBD() {
        System.out.println("deletarAmigoBD");
        int id = 0;
        Amigo instance = new Amigo();
        boolean expResult = false;
        boolean result = instance.deletarAmigoBD(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarAmigoBD method, of class Amigo.
     */
    @Test
    public void testAtualizarAmigoBD() {
        System.out.println("atualizarAmigoBD");
        int id = 0;
        String nome = "";
        String telefone = "";
        Amigo instance = new Amigo();
        boolean expResult = false;
        boolean result = instance.atualizarAmigoBD(id, nome, telefone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
