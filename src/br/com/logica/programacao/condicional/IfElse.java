package br.com.logica.programacao.condicional;

import java.util.Scanner;

public class IfElse {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a primeira nota: ");
        float nota = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota2 = sc.nextFloat();

        float media = (nota + nota1 + nota2) / 3;

        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 4) {
            System.out.println("EM RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
