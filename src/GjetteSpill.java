



import java.util.Scanner;

public class GjetteSpill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sett det bestemte heltallet som skal gjettes
        int hemmeligTall = 5;

        // Be brukeren om å gjette på et heltall

        System.out.print("Gjett på et heltall: ");
        int gjettetTall = input.nextInt();

        // Sammenlign det gjettete tallet med det bestemte tallet
        if (gjettetTall == hemmeligTall) {
            System.out.println("Du gjettet riktig på tallet!");
        } else {
            System.out.println("Du gjettet feil på tallet. Det riktige tallet var " + hemmeligTall + ".");
        }

        // Be brukeren om å gjette på et tegn
        System.out.print("Gjett på et tegn: ");
        char gjettetTegn = input.next().charAt(0);

        // Sammenlign det gjettete tegnet med et bestemt tegn
        char hemmeligTegn = 'A';
        if (gjettetTegn == hemmeligTegn) {
            System.out.println("Du gjettet riktig på tegnet!");
        } else {
            System.out.println("Du gjettet feil på tegnet. Det riktige tegnet var " + hemmeligTegn + ".");
        }

        // Be brukeren om å gjette på en tekst
        System.out.print("Gjett på en tekst: ");
        String gjettetTekst = input.next();

        // Sammenlign den gjettete teksten med en bestemt tekst
        String hemmeligTekst = "hello";
        if (gjettetTekst.equals(hemmeligTekst)) {
            System.out.println("Du gjettet riktig på teksten!");
        } else {
            System.out.println("Du gjettet feil på teksten. Den riktige teksten var \"" + hemmeligTekst + "\".");
        }
    }
}
