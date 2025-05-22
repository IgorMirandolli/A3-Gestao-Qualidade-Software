/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package visao;

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
public class TestFmrGerenciarEmprestimo {
    
    public TestFmrGerenciarEmprestimo() {
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
     * Test of carregaTabela method, of class FrmGerenciarEmprestimo.
     */
    @Test
    public void testCarregaTabela() {
        System.out.println("carregaTabela");
        FrmGerenciarEmprestimo instance = new FrmGerenciarEmprestimo();
        instance.carregaTabela();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmGerenciarEmprestimo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmGerenciarEmprestimo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
