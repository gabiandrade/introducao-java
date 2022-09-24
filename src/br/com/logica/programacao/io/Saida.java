package br.com.logica.programacao.io;


/**
 * System.out.printf(format, arguments);
 *
 * s – formats strings
 * d – formats decimal integers
 * f – formats the floating-point numbers
 * t – formats date/time values
 *
 * */
public class Saida {

    public static void main(String[] args) {
        float num = 25.4255f;
        double d = 25.4255d;
        System.out.printf("float: %.2f%n", num);
        System.out.printf("double: %.0f", d);

    }
}
