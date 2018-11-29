package ch.team1;

import ch.team1.persistence.Presentation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Presentation presentation = new Presentation();

        String tmpFirstname;
        String tmpLastname;

        String input = null;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("please enter firstname" );

        // here is how you take the input from keyboard

        input = inputReader.nextLine();

        tmpFirstname = input;
        System.out.println("please enter lastname" );

        input = inputReader.nextLine();

        tmpLastname = input;

        System.out.println("customer " + tmpFirstname + " wurde erstellt \n\n");

        System.out.println("Zeige den Kunden an");


        // Ertsellen eines Dummy Kunden
        presentation.addCustomer(tmpFirstname, tmpLastname);

        presentation.displayCustomer();
    }
}
