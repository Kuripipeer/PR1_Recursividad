import java.util.Scanner;

public class RecursionNumeros {

    public RecursionNumeros () {

    }

    // Suma de los primeros n números naturales
    public int sumaNaturales(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }

    public int buscarElemento(int[] arreglo, int n, int i) {
        if (i == arreglo.length) {
            return -1;
        } else if (arreglo[i] == n) {
            return i;
        } else {
            return buscarElemento(arreglo, n, i + 1);
        }
    }
}

class Pruebas{
    static Scanner teclado = new Scanner(System.in);
    static RecursionNumeros rn = new RecursionNumeros();
    public static void main(String[] args) {
        System.out.println("Ingrese el número n para calcular la suma de los primeros n números naturales: ");
        String numero = teclado.next();
        while (!isInteger(numero)) {
            System.out.print(
                    "El valor ingresado no es un entero o un número positivo\n\nIntente nuevamente: ");
            numero = teclado.next();
        }
        int n = Integer.parseInt(numero);
        System.out.println("La suma de los primeros n números naturales es: " + rn.sumaNaturales(n));

        int arreglo[] = { 1, 2, 3, 4, 5 };
        System.out.println("Ingrese el número a buscar en el arreglo: ");
        numero = teclado.next();
        while (!isInteger(numero)) {
            System.out.print(
                    "El valor ingresado no es un entero o un número positivo\n\nIntente nuevamente: ");
            numero = teclado.next();
        }
        int num = Integer.parseInt(numero);
        System.out.println("El numero " + num + (rn.buscarElemento(arreglo, num, 0) == -1 ? " no se encuentra en el arreglo"
                        :  (" se encuentra en la posición: " + rn.buscarElemento(arreglo, num, 0))));
        teclado.close();
    }

    public static boolean isInteger(String text) {
        int v;
        try {
            // Convierte la cadena de texto en un valor entero
            v = Integer.parseInt(text);
            if (v < 0) {
                return false;
            }
            return true;
            // Si el usuario ingreso un caracter devuelve un false
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
