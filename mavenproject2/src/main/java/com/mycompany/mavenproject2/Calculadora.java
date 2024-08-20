package com.mycompany.mavenproject2;



public class Calculadora {
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public double exponenciacion(double base, double exponente) {
        if (base == 0 && exponente == 0) {
            throw new ArithmeticException();
        }
        return Math.pow(base, exponente);
    }

    public double radicacion(double numero, double indice) {
        if (indice == 0) {
            throw new ArithmeticException("El índice de radical no puede ser cero, ya que es indefinido.");
        }
        System.out.println(numero);
        if (numero < 0 && indice % 2 == 0) {
            throw new ArithmeticException("No se puede calcular la raíz par de un número negativo.");
        }

        return Math.pow(numero, 1.0 / indice);
    }

    public boolean sonAmigos(int a, int b)
    {
        return (sumaDivisores(a) == b &&
                sumaDivisores(b) == a);
    }

    public int sumaDivisores(int x)
    {
        if (x == 0) {
            return 0;
        }
        int sum = 1;

        for (int i = 2; i <= Math.sqrt(x); i++)
        {
            if (x % i == 0)
            {
                sum += i;
                // Para manejar cuadrados perfectos
                if (x / i != i)
                    sum += x / i;
            }
        }
        return sum;
    }
}
