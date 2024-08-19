/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CltControl
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSuma1(){
        System.out.println("TCS01");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSuma2(){
        System.out.println("TCS02");
        double a = 4.5;
        double b = 5.5;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSuma3(){
        System.out.println("TCS03");
        double a = -3.2;
        double b = -2.3;
        Calculadora instance = new Calculadora();
        double expResult = -5.5;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSuma4(){
        System.out.println("TCS04");
        double a = -3.0;
        double b = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = -1.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }


    @Test
    public void testSuma5(){
        System.out.println("TCS05");
        double a = 4.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 4.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
}

    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testResta1() {
        System.out.println("resta");
        double a = 5.8;
        double b = 3.2;
        Calculadora instance = new Calculadora();
        double expResult = 2.6;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.01);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testResta2() {
        System.out.println("resta");
        double a = -5.0;
        double b = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = -2.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testResta3() {
        System.out.println("resta");
        double a = 0.0;
        double b = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = -5.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
        
    @Test
    public void testResta4() {
        System.out.println("resta");
        double a = 5.0;
        double b = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
        //("The test case is a prototype.");
    }
    
    @Test
    public void testMultiplicacion1() {
        System.out.println("multiplicacion");
        double a = 4.2;
        double b = 2.7;
        Calculadora instance = new Calculadora();
        double expResult = 11.34;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0000000000002);
    }

    @Test
    public void testMultiplicacion2() {
        System.out.println("multiplicacion");
        double a = -4.0;
        double b = -2.0 ;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion3() {
        System.out.println("multiplicacion");
        double a = 4.0;
        double b = 2.0 ;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testMultiplicacion4() {
        System.out.println("multiplicacion");
        double a = 4.0;
        double b = 0.0 ;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion5() {
        System.out.println("multiplicacion");
        double a = 4.0;
        double b = 0.0 ;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExponenciacion1() {
        System.out.println("exponenciacion");
        double base = 2.0;
        double exponente = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        }


    @Test
        public void testExponenciacion2() {
        System.out.println("exponenciacion");
        double base = 2.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        }


    @Test
        public void testExponenciacion3() {
        System.out.println("exponenciacion");
        double base = 2.0;
        double exponente = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.125;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        }


@Test
public void testExponenciacion4() {
System.out.println("exponenciacion");
double base = -2.0;
double exponente = 2.0;
Calculadora instance = new Calculadora();
double expResult = 4.0;
double result = instance.exponenciacion(base, exponente);
assertEquals(expResult, result, 0);
}
    
    @Test
    public void testRadicacion() {
        System.out.println("radicacion");
        double numero = 0.0;
        double indice = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSonAmigos() {
        System.out.println("sonAmigos");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSumaDivisores() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
