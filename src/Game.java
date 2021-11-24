import models.Charakter;
import models.Ruestung;
import models.Waffen;
import models.Getränke;

import java.util.Scanner;

public class Game {


    //Init Charaktere
    Charakter charakter1 = new Charakter("Jenkins", 50, 0.0, 100);
    Charakter charakter2 = new Charakter("Obdachloser", 5, 3.5, 5);
    //Init models.Waffen
    Waffen waffe1 = new Waffen("Pistole");

    //INIT Rüstung

    Ruestung ruestung1 = new Ruestung("Kugelsichere Weste", 50);

    // Scanner
    Scanner tastatur = new Scanner(System.in);


    public void start() throws InterruptedException {
        slowprint("""
                Es ist mitten in der Nacht in New York im 21ten Jahrunderts und du wachst in deinem unterkühlten Apartment in der 5th Avenue auf.
                 Neben deiner veranzten Matratze liegen 50 Dollar, ein Schlüssel zum Lagerplatz deines besten Freundes (zu dem du schon lange keinen Kontakt mehr hast)\s
                und ein halb stumpfes Butterfly Messer.\s
                Du beschließt dein Leben zu ändern und der Armut zu entkommen.\s
                Du beschließt eine Bank zu überfallen. Du ziehst dich an und  noch bevor die Uhr 2 schlägt verlässt du dein Apartment.\s
                Du stehst nun vor deiner Tür.""");

        // AKT 1
        slowprint("""
                Was möchtest du tun?
                1) Gehe in den Park neben deinem Apartment
                2) Gehe die 5th Avenue entlang
                3) Besuche die Bar auf der anderen Straßenseite""");


        //SCANNER1


        int auswahl = this.tastatur.nextInt();


        //Switch case
        switch (auswahl) {
            case 1:
                slowprint("Du bist nun im Park.");

                this.geheZumPark();
                break;
            case 2:
                slowprint("in der 5th Avenue siehst du zwei Dealer." +
                          "\nDu kannst vielleicht etwas von ihnen kaufen..?" +
                          "\nSie haben eine Schutzweste und eine Pistole im Angebot.");
                this.geheZurAvenue();
                break;
            case 3:
                slowprint("Du bist nun in der Bar");
                break;
            default:
                slowprint("Es gibt nur 1,2 oder 3. Wähl was vernünftiges");
                break;
        }


    }

    public void geheZumPark() throws InterruptedException {
        // EINFÜHRUNG PARK
        slowprint("Vor dir siehst du einen Obdachlosen und ein Pärchen.\n" +
                  "Du könntest sowohl den Obdi als auch das Pärchen überfallen.\n" +
                  "Natürlich könntest du auch etwas Vodka trinken.\n" +
                  "Was möchtest du tun?\n" +
                  "1) Den Obdachlosen überfallen\n" +
                  "2) Das Pärchen überfallen\n" +
                  "3)Vodka!");
        // NEUER SWITCH CASE IM PARK
        int auswahl = this.tastatur.nextInt();

        switch (auswahl) {
            case 1:
                slowprint("Na super du Häufchen Elend..hast einen Obdachlosen überfallen." +
                          "\ndu wirst dich nie ändern...");
                System.exit(1337);
                break;
            case 2:
                slowprint("NICE!" +
                          "\nDas Pärchen hatte 100$ dabei. Die gehören jetzt dir!");
                slowprint("Möchtest du in die 5th Avenue gehen?" +
                          "\n1)Ja" +
                          "\n2)Nein");
                slowprint("in der 5th Avenue siehst du zwei Dealer." +
                          "\nDu kannst vielleicht etwas von ihnen kaufen..?" +
                          "\nSie haben eine Schutzweste und eine Pistole im Angebot.");
                this.parkZuAvenue();
                break;
            case 3:
                slowprint("Einmal Spritti, immer Spritti. Adios!");
                break;
            default:
                slowprint("Es gibt nur 1,2 oder 3. Wähl etwas vernünftiges.");


        }


    }


    public void parkZuAvenue() throws InterruptedException {
        int auswahl = this.tastatur.nextInt();

        if (auswahl == 1) {
            slowprint("auf gehts");
            this.geheZurAvenue();
        } else {
            this.geheZurBank();

        }
    }

    // !!!!!!!!!!!!!

    /* ALLE OPTIONEN PARK ABGESCHLOSSEN */

    // !!!!!!!!!!!!


// 5TH AVENUE GEGANGEN

    public void geheZurAvenue() throws InterruptedException {

        slowprint("\n1)Schutzweste kaufen (50$)" +
                  "\n2)Pistole kaufen(100$)" +
                  "\n3)Nichts..?");

        int auswahl = this.tastatur.nextInt();

        switch (auswahl) {
            case 1:



        }

    }

    // ZUR BANK GEHEN


    public void geheZurBank() throws InterruptedException {

    }

    // SLOWPRINT VON STACKOVERFLOW

    public static void slowprint(String eingabe) throws InterruptedException {
        // Get message, convert to char array
        char[] chars = eingabe.toCharArray();

        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(1);
        }

    }
}



