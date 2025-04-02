package calculadora;

import java.util.Scanner;

public class Calculadora {

    // Método para la suma
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para la resta
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para la multiplicación
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para la división
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Retorna NaN (Not a Number) en caso de error
        }
        return a / b;
    }

    // Método para la potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método para la raíz cuadrada
    public static double raizCuadrada(double a) {
        if (a < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN; // Retorna NaN en caso de error
        }
        return Math.sqrt(a);
    }

    // Método para imprimir la tabla de multiplicar
    public static void tablaMultiplicar(int num) {
        System.out.println("\nTabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Método principal para interactuar con el usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2;

        do {
            System.out.println("\n---- Calculadora Básica ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Tabla de Multiplicar");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    double resultadoDiv = dividir(num1, num2);
                    if (!Double.isNaN(resultadoDiv)) {
                        System.out.println("Resultado: " + resultadoDiv);
                    }
                    break;
                case 5:
                    System.out.print("Ingrese la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + potencia(num1, num2));
                    break;
                case 6:
                    System.out.print("Ingrese un número: ");
                    num1 = scanner.nextDouble();
                    double resultadoRaiz = raizCuadrada(num1);
                    if (!Double.isNaN(resultadoRaiz)) {
                        System.out.println("Resultado: " + resultadoRaiz);
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el número para la tabla de multiplicar: ");
                    int numTabla = scanner.nextInt();
                    tablaMultiplicar(numTabla);
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
