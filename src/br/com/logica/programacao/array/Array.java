package br.com.logica.programacao.array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        /**
         * Ao criar um array precisamos declarar seu tamanho:
         * new tipoDoArray[tamanho].
         * Esse tamanho faz com que seja reservado a memória requerida
         * para armazenar os elementos do array.
         *
         * Algumas formas de declarar array:
         * */
        int[] arrayInteiros = new int[5]; // mais utilizada
        double arrayDouble[] = new double[3];

        /** utilizamos o length para saber o tamanho do array*/
        int tamanhoArrayInteiros = arrayInteiros.length;
        System.out.println("tamanho do array: " + tamanhoArrayInteiros);

        /**
         * Quando inicializamos um array, ele é criado com
         * valores default de acordo com seu tipo.
         * Por exemplo, um array de inteiros é criado com valores 0,
         * um array de String é criado com null.
         *
         * Para imprimir o array, utilizamos uma classe do pacote
         * java.util e o método toString.
         * */
        System.out.println("Array de inteiros: " +
                Arrays.toString(arrayInteiros));

        /**
         * Podemos iniciar o array já populado
         * ou ir populando depois.
         * */
        String[] arrayNomes = {"Fernanda", "Mayla", "Karina"};
        arrayInteiros[0] = 5;
        arrayInteiros[1] = 4;
        arrayInteiros[2] = 3;
        arrayInteiros[3] = 2;
        arrayInteiros[4] = 1;

        System.out.printf("Array de nomes: %s%nArray de Inteiros populado: %s%n",
                Arrays.toString(arrayNomes), Arrays.toString(arrayInteiros));


        /**Os índices para as posições do array devem estar contidos no intervalo 0
         * (posição inicial do array) e length-1 (tamanho menos 1).
         * O uso de posições fora desse intervalo provoca o lançamento
         * da exceção java.lang.ArrayIndexOutOfBoundsException.
         *
         * Observe a exceção no print abaixo.
         */
        System.out.println(arrayNomes[4]);
    }


}
