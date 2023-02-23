

// --------------------------------------------------------------------------------------
//Skriv et program som leser inn et antall sekunder og beregner hvor mange timer, minutter og sekunde
//---------------------------------------------------------------------------------------------

import java.io.PrintStream;
import java.util.Scanner;
public class oppgave3 {
    public static void main(String [] args){
        final int SEKUNDE_PER_TIMER = 3600;
        final int SEKUNDE_PER_MINUTTE = 60;

        int sekunde, minutter, timer, totaltSekunder;

        Scanner scan = new Scanner(System.in);

        System.out.print("Skrive antall timer: "); // få noe tall fra brukeren
        timer = scan.nextInt(); // Lagre input fra brukeren her
        System.out.print("Skrive antall munitter");
        minutter = scan.nextInt();
        System.out.print("Skrive antall sekunde ");
        sekunde = scan.nextInt();

        // Totalt av sekunder
        totaltSekunder = timer * SEKUNDE_PER_MINUTTE + minutter * SEKUNDE_PER_MINUTTE + sekunde;
        //skrive ut et linje først

        System.out.println();
        // Skrive ut totalt sekunder
        System.out.println("Total av sekunder er : " + totaltSekunder);
    }

    //
}
