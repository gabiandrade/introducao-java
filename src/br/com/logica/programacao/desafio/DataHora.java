package br.com.logica.programacao.desafio;

import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DataHora {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        System.out.println("Para saber a data da sua consulta digite 'data'\n" +
                "Para saber o horario da sua consulta digite 'hora'");
        System.out.println("------------------------------------------------");

        if (args.length > 0) {
            switch (args[0].toLowerCase(Locale.ROOT)) {
                case "data":
                    System.out.println("A data da sua consulta é: " + DateFormat.getDateInstance().format(new Date()));
                    break;
                case "hora":
                    System.out.println("Sua consulta está marcada no horário:  " + DateFormat.getTimeInstance()
                            .format(new Date()));
                    Date date = new Date();
                    System.out.printf("Exemplo usando printf: %tT%n", date);
                    System.out.println("Exemplo usando LocalTime: " + LocalTime.now().format(DateTimeFormatter
                            .ofPattern("hh:mm:ss")));
                    break;
            }
        }
    }
}
