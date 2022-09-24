package br.com.logica.programacao.io;

import java.util.Scanner;

public class Entrada {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade:");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite seu peso:");
        float peso = sc.nextFloat();

        /**
         * O método nextInt, nextFloat não possui o \n para pular linha,
         * então utilizamos o nextLine logo após a entrada para que a
         * próxima variável seja lida corretamente.
         * */
        sc.nextLine();

        System.out.print("Digite sua cidade:");
        String cidade = sc.nextLine();

        System.out.print("Digite seu estado:");
        String estado = sc.nextLine();

        System.out.printf("A idade da %s é %d anos e seu peso %.1f kg.%n " +
                "Ela(e) mora na cidade %s localizada no estado do(a) %s", nome, idade, peso, cidade, estado);
        sc.close();
    }

}
