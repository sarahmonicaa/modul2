import java.util.Scanner;

//* Skriv et program som leser inn tre varibaler fra bruker (timer, minutter
// og sekunder) og regner om dette til totalt antall sekunde /*
public class oppgave2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        // spørre bruker å skrive et tall
        System.out.print("Skrive inn timer:");
        double timer = scan.nextDouble();
        System.out.print("Skrive inn minutter: ");
        double minuttter = scan.nextDouble();
        System.out.print("Skrive inn sekunder : ");
        double sekunder = scan.nextDouble();
        scan.close();
        System.out.println(timer *3600 + minuttter *60 + sekunder);

    }
}
