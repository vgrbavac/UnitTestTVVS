/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvvs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hrvoje Dumančić
 */
public class CalculatorTest {
    
    Calculator instance;
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Calculator();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of addition method, of class Calculator.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double x = 15;
        double y = 7;
        double expResult = 22;
        double result = instance.addition(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substraction method, of class Calculator.
     */
    @Test
    public void testSubstraction() {
        System.out.println("substraction");
        double x = 15;
        double y = 7;
        double expResult = 8;
        double result = instance.substraction(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double x = 7;
        double y = 2;
        double expResult = 3.5;
        double result = instance.division(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplication method, of class Calculator.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        double x = 7;
        double y = 2;
        double expResult = 14;
        double result = instance.multiplication(x, y);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of multiplication method (wrong), of class Calculator.
     */
    @Test
    public void testMultiplicationWrong() {
        System.out.println("multiplication wrong");
        double x = 10;
        double y = 2;
        double expResult = 20;
        double result = instance.multiplication(x, y);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of oneNumberFactorial method, of class Calculator.
     */
    @Test
    public void testOneNumberFactorial() {
        System.out.println("oneNumberFactorial");
        int x = 5;
        int expResult = 120;
        int result = instance.oneNumberFactorial(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of twoNumberFactorial method, of class Calculator.
     */
    @Test
    public void testTwoNumberFactorial() {
        System.out.println("twoNumberFactorial");
        int x = 5;
        int y = 3;
        int expResult = 20;
        int result = instance.twoNumberFactorial(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of primeNumberCheck method, of class Calculator.
     */
    @Test
    public void testPrimeNumberCheck() {
        System.out.println("primeNumberCheck");
        int x = 5;
        boolean result = instance.primeNumberCheck(x);
        assertFalse(result);
    }
}
