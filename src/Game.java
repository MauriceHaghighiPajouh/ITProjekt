import models.Charakter;
import models.Ruestung;
import models.Waffen;
import models.Getränke;

import java.util.Scanner;

public class Game {


    //Init Charaktere
    Charakter charakter1 = new Charakter("Jenkins", 50, 0.0, 0);

    //Init models.Waffen
    Waffen waffe1 = new Waffen("Pistole", 10);
    Waffen waffe2 = new Waffen("Maschinenpistole", 15);


    //INIT Rüstung

    Ruestung ruestung1 = new Ruestung("Kugelsichere Weste", 5);

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
                this.geheZurBar();
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
                this.charakter1.setGeld(this.charakter1.getGeld() + 100);
                slowprint("\nMöchtest du in die 5th Avenue gehen?" +
                          "\n1)Ja" +
                          "\n2)Nein");
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
            slowprint("\nin der 5th Avenue siehst du zwei Dealer." +
                      "\nDu kannst vielleicht etwas von ihnen kaufen..?" +
                      "\nSie haben eine Schutzweste und eine Pistole im Angebot.");
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
                  "\n3)Sparpreis-paket kaufen(Pistole+Schutzweste)...(Kostet trotzdem 150$... Wir sind hier bei Dealern und nicht bei Aldi)" +
                  "\n4)Nichts..?" +
                  "\n(Freundlicher Tipp Kollege, die Dealer werden ganzschön sauer wenn du was kaufen willst" +
                  "\nund nicht genug Kohle dabei hast. Aktuell hast du:");
        System.out.println(this.charakter1.getGeld() + "$ dabei");

        int auswahl = this.tastatur.nextInt();

        switch (auswahl) {
            case 1:
                charakter1.setGeld(charakter1.getGeld() - 50);
                this.charakter1.setGesamtwert(charakter1.getGesamtwert() + ruestung1.wert);
                break;
            case 2:
                charakter1.setGeld(charakter1.getGeld() - 100);
                this.charakter1.setGesamtwert(charakter1.getGesamtwert() + waffe1.wert);
                break;
            case 3:
                charakter1.setGeld(charakter1.getGeld() - 150);
                this.charakter1.setGesamtwert(charakter1.getGesamtwert()+ waffe1.wert+ ruestung1.wert);
            case 4:
                slowprint("Auf zur bank!");
                break;
            default:
                slowprint("komm schon, wähl was vernünftiges.. du willst doch die Dealer nicht verärgern?");


        }
        if (charakter1.getGeld() < 0) {

            slowprint("Ich hab dich gewarnt Kollege... ICH .. der ERZÄHLER.. der ERSCHAFFER DEINER GESCHICHTE" +
                      "\nund DU..DU willst ja nicht hören. Naja wie auch immer.." +
                      "\nEiner der Dealer hat dich abgestochen. R.I.P");
            System.exit(0);
        }
        this.geheZurBank();
    }

    public void geheZurBar() throws InterruptedException {
        slowprint("Bla bla bla du Bar");
        slowprint("was willst du machen bla bla " +
                  "\n1)Bier trinken" +
                  "\n2)Den Typen verfolgen");
        int auswahl = this.tastatur.nextInt();

        switch (auswahl) {
            case 1:
                slowprint("Ah .. das hat super geschmeckt..hat dich aber nicht weiter gebracht.." +
                          "\nalso nochmal von vorne..");
                this.charakter1.setPegel(charakter1.getPegel() + 1);
                this.geheZurBar();
                break;
            case 2:
                slowprint("du rennst dem Typen hinterher.. UND");
                if (this.charakter1.getPegel() > 2) {
                    slowprint("Hast irgendwie doch kein bock zu laufen.. bleibste halt einfach hier und säufst...einmal Spritti immer Spritti");
                } else if (this.charakter1.getPegel() == 2) {
                    slowprint("\nFolgst ihm in den Raum in den er ging.. Es ist jedoch niemand mehr hier und SIEHE DA" +
                              "\ndu findest eine Maschinenpistole und ne kubanische Zigarre.Damit wird die Sache mit der Bank ein zuckerschlecken!!!" +
                              "\nSie macht sowieso gleich zu. Deswegen machst du dich auf den Weg!");
                    this.charakter1.setGesamtwert(this.charakter1.getGesamtwert() + waffe2.wert);
                    this.geheZurBank();
                } else {
                    slowprint("\nStehst plötzlich in dem Raum..wo dich 3 bewaffnete Russen anschauen." +
                              "\ndas nächste was du siehst ist eine Faust die dir ins Gesicht fliegt..");
                    System.exit(0);

                }
                break;

        }
    }


    // ZUR BANK GEHEN


    public void geheZurBank() throws InterruptedException {

        slowprint("\n" +
                  "\n" +
                  "\nDa stehst du nun..direkt vor der Bank" +
                  "\nIch hoffe du bist bereit, weil jetzt gibt es kein Zurück mehr!");
        if (this.charakter1.getGesamtwert() < 10) {
            slowprint("\nWie hast du dir das eigentlich vorgestellt..?" +
                      "\nDu hast keine Waffe..nichts..NICHTMAL ne MASKE?!" +
                      "\nNaja..Wenigstens hatten die Wachmänner gut was zu lachen..und im Gefängnis" +
                      "\nist es sowieso nicht soooo schlecht.");
        } else if (this.charakter1.getGesamtwert() > 10) {
            slowprint("Du gehst nun in die Bank..Du hast dich noch nie so bereit gefühlt!");
        }
        else if (this.charakter1.getGesamtwert()==15){
            slowprint("Du bist bewaffnet wie der Terminator..Beim Anblick deiner goldenen russischen" +
                      "\nMaschinenpistole schrecken die Sicherheitsleute direkt zurück." +
                      "\nDu gehst an den Schalter und holst dir endlich das was dir zusteht...." +
                      "\n300 000$ Cash!");
        }

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



