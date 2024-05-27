public class Cadena {
    private String texto;

    // Constructor que inicializa el atributo texto
    public Cadena(String texto) {
        this.texto = texto;
    }

    // Método público que llama al método recursivo invertirAux
    public String invertir() {
        return invertirAux(this.texto);
    }

    // Método privado que invierte una cadena de texto de manera recursiva
    private String invertirAux(String texto) {
        if (texto.length() <= 1) {
            return texto;
        } else {
            return invertirAux(texto.substring(1)) + texto.charAt(0);
        }
    }

    // Método público que llama al método recursivo contarCaracteresAux
    public int contarCaracteres() {
        return contarCaracteresAux(this.texto);
    }

    // Método privado que cuenta los caracteres de una cadena de manera recursiva
    private int contarCaracteresAux(String texto) {
        if (texto.length() == 0) {
            return 0;
        } else {
            return 1 + contarCaracteresAux(texto.trim().substring(1));
        }
    }

    // Método público que llama al método recursivo esPalindromoAux
    public boolean esPalindromo() {
        return esPalindromoAux(this.texto.replace(" ", "").toLowerCase());
    }

    // Método privado que verifica si una cadena es un palíndromo de manera recursiva
    private boolean esPalindromoAux(String texto) {
        if (texto.length() <= 1) {
            return true;
        } else {
            if (texto.charAt(0) != texto.charAt(texto.length() - 1)) {
                return false;
            } else {
                return esPalindromoAux(texto.substring(1, texto.length() - 1));
            }
        }
    }
}

class Prueba {
    public static void main(String[] args) {
        Cadena cadena = new Cadena("Anita lava la tina");
        System.out.println(cadena.invertir());
        System.out.println(cadena.contarCaracteres());
        System.out.println(cadena.esPalindromo());
    }
}