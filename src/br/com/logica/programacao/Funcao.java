package br.com.logica.programacao;

public class Funcao {

    public static void main(String[] args) {
        //numImpar();
        //System.out.println(numPar(5));
    }

    public static String numImpar() {
        int num = 2;
        if (num % 2 == 0) {
            System.out.println("impar");
            return "impar";
        }
        return "par";
    }

}
