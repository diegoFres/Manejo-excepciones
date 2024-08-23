package org.example;
public class caracter {
    // devolver caracter
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("la posicion esta fuera del limite.");
        }
    }

    // Excepción de números negativos
    public static class NumeroNegativoExcepcion extends Exception {
        public NumeroNegativoExcepcion() {
            super("Número negativo invalido");
            }

        public NumeroNegativoExcepcion(String mensaje) {
            super(mensaje);
        }}
}