package br.com.logica.programacao.array;

import java.util.Scanner;

public class ExemploArray {

    public static void main(String[] args) {
        /**Primeiro Exemplo:*/
        String[] frutas = new String[3];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª fruta: ");
            frutas[i] = sc.nextLine();
        }
        for (int i = 2; i >= 0; i--) {
            System.out.println((i + 1) + " ª fruta: " + frutas[i]);
        }

        System.out.println();


        /**Segundo Exemplo*/
        System.out.print("Digite o número de frutas que deseja adicionar a lista: ");
        int tamanho = sc.nextInt();
        if (tamanho > 0) {
            String[] carrinhoFrutas = new String[tamanho];
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite a " + (i + 1) + " ª fruta:");
                carrinhoFrutas[i] = sc.next();
            }

            sc.close();

            for (String fruta : carrinhoFrutas) {
                System.out.println(fruta);
            }
        }
    }

}
