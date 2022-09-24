package br.com.logica.programacao.condicional;

import java.util.Scanner;

public class SwitchCase {

    /**
     * O usuário vai informar uma linguagem de programação e o
     * programa deve retornar se a linguagem é interpretada/compilada
     * <p>
     * Linguagem validas
     * JAVA - Compilada
     * KOTLIN - Compilada
     * PHP - Interpretada
     * JAVASCRIPT - Interpretada
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Informe uma linguagem");
        Scanner scanner = new Scanner(System.in);
        String entradaDeDados = scanner.next();
        scanner.close();

        /*
         * O método toUpperCase converte a entrada para maiúsculo.
         *
         */
        entradaDeDados = entradaDeDados.toUpperCase();
        Linguagem lg = Linguagem.valueOf(entradaDeDados);

        switch (lg) {
            case JAVA:
            case KOTLIN:
                System.out.println("A linguagem é compilada");
                break;
            case PHP:
            case JAVASCRIPT:
                System.out.println("A linguagem é interpretada");
                break;
        }
    }
}
