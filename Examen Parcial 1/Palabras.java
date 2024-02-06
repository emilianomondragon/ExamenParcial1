public class Palabras {
    private String cadena;

    public Palabras(String cadena) {
        this.cadena = cadena;
    }

    public void primeraMayuscula() {
        char primeraLetra = Character.toUpperCase(cadena.charAt(0));
        System.out.println("Primera mayúscula: " + primeraLetra + cadena.substring(1));
    }

    public void invertirCadena() {
        StringBuilder sb = new StringBuilder(cadena);
        System.out.println("Cadena invertida: " + sb.reverse());
    }

    public void vocalesMayuscula() {
        String cadenaModificada = cadena.replaceAll("[aeiouAEIOU]", "AEIOU");
        System.out.println("Vocales en mayúscula: " + cadenaModificada);
    }

    public void palindromo() {
        String cadenaSinEspacios = cadena.replaceAll("\\s", "").toLowerCase();
        String cadenaInvertida = new StringBuilder(cadenaSinEspacios).reverse().toString();
        if (cadenaSinEspacios.equals(cadenaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
}