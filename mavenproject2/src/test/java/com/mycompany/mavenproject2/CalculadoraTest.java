package com.mycompany.mavenproject2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Grupo#2
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
        System.out.println("TCR01");
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
        System.out.println("TCR02");
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
        System.out.println("TCR03");
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
        System.out.println("TCR04");
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
    }
    
    @Test
    public void testMultiplicacion1() {
        System.out.println("TCM01");
        double a = 4.2;
        double b = 2.7;
        Calculadora instance = new Calculadora();
        double expResult = 11.34;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0.0000000000002);
    }

    @Test
    public void testMultiplicacion2() {
        System.out.println("TCM02");
        double a = -4.0;
        double b = -2.0 ;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicacion3() {
        System.out.println("TCM03");
        double a = 4.0;
        double b = -2.0 ;
        Calculadora instance = new Calculadora();
        double expResult = -8.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testMultiplicacion4() {
        System.out.println("TCM04");
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
    }

    @Test
    public void testDivision1() {
        System.out.println("TCD01");
        double a = 4.0;
        double b = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision2() {
        System.out.println("TCD02");
        double a = -6.0;
        double b = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = -2.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivision3() {
        System.out.println("TCD03");
        double a = -9.0;
        double b = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDivision4() {
        System.out.println("TCD04");
        double a = 2.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        
        /*
        assertThrows(ArithmeticException.class, () -> {
            instance.division(a, b);
        });
        */
        
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDivision5() {
        System.out.println("TCD05");
        double a = 7.0;
        double b = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.5;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    
    @Test
    public void testDivision6() {
        System.out.println("TCD06");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        
        
        /*
        assertThrows(ArithmeticException.class, () -> {
            instance.division(a, b);
        });
        */
        
        
        
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDivision7() {
        System.out.println("TCD07");
        double a = 7.0;
        double b = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.5;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testExponenciacion1() {
        System.out.println("TCE01");
        double base = 2.0;
        double exponente = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }


    @Test
    public void testExponenciacion2() {
        System.out.println("TCE02");
        double base = 2.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }


    @Test
    public void testExponenciacion3() {
        System.out.println("TCE03");
        double base = 2.0;
        double exponente = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.125;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }


    @Test
    public void testExponenciacion4() {
        System.out.println("TCE04");
        double base = -2.0;
        double exponente = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 4.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testExponenciacion5() {
        System.out.println("TCE05");
        double base = 0.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.0; // WhiteBox
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        
        
        
        
        /*
        //BlackBox
        assertThrows(ArithmeticException.class, () -> {
            instance.exponenciacion(base, exponente);
        });
        */
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
        //fail("The test case is a prototype.");
    }

        @Test
    public void testRadicacion1() {
        System.out.println("TCR01");
        double numero = 9.0;
        double indice = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRadicacion2() {
        System.out.println("TCR02");
        double numero = 27.0;
        double indice = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRadicacion3() {
        System.out.println("TCR03");
        double numero = -8.0;
        double indice = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0; //WhiteBox
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRadicacion4() {
        System.out.println("TCR04");
        double numero = -8.0;
        double indice = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0; //Esto daría en BlackBox
        double result = instance.radicacion(numero, indice);
        
        
        //Esto daría en WhiteBox ->
        /*
        assertThrows(ArithmeticException.class, () -> {
            instance.radicacion(numero, indice);
        });
        */
        

        //fail("The test case is a prototype.");
    }

    @Test
    public void testRadicacion5() {
        System.out.println("TCR05");
        double numero = 13.0;
        double indice = 0.0;
        Calculadora instance = new Calculadora();
        Double expResult = Double.POSITIVE_INFINITY;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result); //Esto en BlackBox
        
        
        //Esto daría en WhiteBox ->
        /*
        assertThrows(ArithmeticException.class, () -> {
            instance.radicacion(numero, indice);
        });
        */
        //fail("The test case is a prototype.");
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
    }

    @Test
    public void testSonAmigos1() {
        System.out.println("sonAmigos");
        int a = 220;
        int b = 284;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSonAmigos2() {
        System.out.println("sonAmigos");
        int a = 1184;
        int b = 1210;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSonAmigos3() {
        System.out.println("sonAmigos");
        int a = 10;
        int b = 20;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSonAmigos4() {
        System.out.println("sonAmigos");
        int a = 0;
        int b = 1;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumaDivisores() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testSumaDivisores1() {
        System.out.println("sumaDivisores");
        int x = 6;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testSumaDivisores2() {
        System.out.println("sumaDivisores");
        int x = 28;
        Calculadora instance = new Calculadora();
        int expResult = 28;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testSumaDivisores3() {
        System.out.println("sumaDivisores");
        int x = 12;
        Calculadora instance = new Calculadora();
        int expResult = 16;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testSumaDivisores4() {
        System.out.println("sumaDivisores");
        int x = 1;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);   }
    
       @Test
    public void testSumaDivisores5() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 1; //BlackBox
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        
        
        //int expResult =0 //WhiteBox
    }
    
    @Test
    public void testSumaDivisores6() {
        System.out.println("sumaDivisores");
        int x = -1;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
    }

  
}
