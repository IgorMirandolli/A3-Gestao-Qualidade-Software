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
public class TestFrmCadastroEmprestimo {
    
    public TestFrmCadastroEmprestimo() {
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
     * Test of carregaCBAmigo method, of class FrmCadastroEmprestimo.
     */
    @Test
    public void testCarregaCBAmigo() {
        System.out.println("carregaCBAmigo");
        FrmCadastroEmprestimo instance = new FrmCadastroEmprestimo();
        instance.carregaCBAmigo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregaCBFerramenta method, of class FrmCadastroEmprestimo.
     */
    @Test
    public void testCarregaCBFerramenta() {
        System.out.println("carregaCBFerramenta");
        FrmCadastroEmprestimo instance = new FrmCadastroEmprestimo();
        instance.carregaCBFerramenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmCadastroEmprestimo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmCadastroEmprestimo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
