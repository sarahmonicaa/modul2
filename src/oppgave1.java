
//Skriv et program som regner om fra fahrenheit til centigrader

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgave1 {
    public static void main(String[] args) {
        //antall fahrenheit leses inn fra brukeren
        Scanner input = new Scanner(System.in);
        System.out.print("Gi et tall i Fahrenheit:");
        double fahrenheit = input.nextDouble();

        double celsius = ((5*(fahrenheit - 32)) /9.0);

        System.out.println(fahrenheit  +  "grad i Fahrenheit er lik " +  celsius+  "i Celsius");


    }
}
