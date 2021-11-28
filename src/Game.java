import models.Charakter;
import models.Ruestung;
import models.Waffen;

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
        slowprint("Was möchtest du tun?\n" +
                  "1) Gehe in den Park neben deinem Apartment\n" +
                  "   (Der Park sieht sehr besiedelt aus...Es wäre sicherlich ein guter Start)\n" +
                  "2) Gehe die 5th Avenue entlang\n" +
                  "  (Auf dem Weg liegt die Bank..und es ist alles sehr hell beleuchtet)\n" +
                  "3) Besuche die Bar auf der anderen Straßenseite\n" +
                  "(denk einfach dran,dass du n Alkoholiker bist..)");


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
                slowprint("\nDu befindest dich nun in deiner damaligen Stammkneipe..DER SALZIGE SPUCKNAPF.." +
                          "\nGute Erinnerungen....Naja zurück zum wesentlichen." +
                          "\nWährend du dort sitzt und der schönen Thekenfrau in die..Augen schaust.. siehst du wie sich ein Russe," +
                          "\nden sie Ivan nennen in ein Hinterzimmer zurückzieht.Gefolgt von 2 breiteren Russen,die auch Ivan heißen." +
                          "\nSie haben sicherlich etwas für dich was nützlich wäre,allerdings bezweifle ich sehr,dass sie dich nett" +
                          "\nhereinbitten werden..schließlich bist du ein halber obdachloser und du riechst nach Alkohol" +
                          "\nund mit deinem halbstumpfen Butterfly-messer machst du ihnen auch keine Angst." +
                          "\nVielleicht solltest du lieber Ein bis zwei Bier trinken bevor du Ivan,Ivan und Ivan folgst." +
                          "\nPass nur auf..Du weißt ja wie man sagt: Nach dem 3. Bier haben sich Sprittis nicht mehr unter Kontrolle");
                this.geheZurBar();
                break;
            default:
                slowprint("Es gibt nur 1,2 oder 3. Wähl was vernünftiges");
                break;
        }


    }

    public void geheZumPark() throws InterruptedException {
        // EINFÜHRUNG PARK
        slowprint("\nVor dir siehst du einen Obdachlosen und ein Pärchen." +
                  "\n" +
                  "\nTheorethisch..(und praktisch)..Könntest du beide überfallen" +
                  "\nNatürlich könntest du auch etwas Vodka trinken(Wie immer..)" +
                  "\nWas möchtest du tun?" +
                  "\n" +
                  "\n1) Den Obdachlosen überfallen" +
                  "\n2) Das Pärchen überfallen" +
                  "\n3)Vodka!");
        // NEUER SWITCH CASE IM PARK
        int auswahl = this.tastatur.nextInt();

        switch (auswahl) {
            case 1:
                slowprint("\nNa super du Häufchen Elend..hast einen Obdachlosen überfallen." +
                          "\ndu wirst dich nie ändern...");
                System.exit(1337);
                break;
            case 2:
                slowprint("\nGeil..Die Frau hatte ihr Portmonee dabei." +
                          "\nDie Kinderfotos wirfst du weg..und die Payback-Karte."+
                          "\nUnd TADA.. Es sind 100$ drin. Die gehören nun dir.");
                this.charakter1.setGeld(this.charakter1.getGeld() + 100);
                slowprint("\nJetzt wo du  "+this.charakter1.getGeld()+" $ in deiner Tasche hast,ist das Leben deutlich" +
                          "\nangenehmer." +
                          "\nWillst du in die 5th Avenue gehen, oder Lieber direkt zur Bank?"+
                          "\n1)5th Avenue" +
                          "\n2)Auf zur Bank ( Ohne jegliche Ausrüstung oder sonstiges?!) ");
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
            slowprint("\nDa dir dein Gestank und deine entstelle Visage unangenehm sind" +
                      "\nGehst du nicht direkt über die Avenue,sondern schlängelst dich durch die Nebengassen." +
                      "\nIn der einen Gasse siehst du zwei Dealer,du kennst sie beide." +
                      "\nPablo und Pablo..Pablo ist dafür bekannt Drogen zu verkaufen,die werden dir bei dem Überfall nicht helfen" +
                      "\nAber Pablo! Der hat immer Waffen und sonstiges im Angebot." +
                      "\nDu könntest Pablo mal fragen!" +
                      "\n..." +
                      "\n...." +
                      "\n....." +
                      "\nSie sprechen kaum Englisch, aber :" +
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
                  "\n" +
                  "\n2)Pistole kaufen(100$)" +
                  "\n" +
                  "\n3)Sparpreis-paket kaufen(Pistole+Schutzweste)...(Kostet trotzdem 150$... Wir sind hier bei Dealern und nicht bei Aldi)" +
                  "\n" +
                  "\n4)Nichts..?" +
                  "\n" +
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
                this.charakter1.setGesamtwert(charakter1.getGesamtwert() + waffe1.wert + ruestung1.wert);
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
        slowprint("\nWas möchtest du tun? " +
                  "\n1)Bier trinken" +
                  "\n2)Ivan,Ivan und Ivan verfolgen!!");
        int auswahl = this.tastatur.nextInt();

        switch (auswahl) {
            case 1:
                this.charakter1.setPegel(charakter1.getPegel() + 1);
                slowprint("\nDu hast bereits  " + charakter1.getPegel() + "  Bier getrunken");
                slowprint("\n" +
                          "\n" +
                          "\nSo... Nun wo das Bierchen leer ist die Frage nochmal von vorne:");
                this.geheZurBar();
                break;
            case 2:
                slowprint("du rennst dem Typen hinterher.. UND");
                if (this.charakter1.getPegel() > 2) {
                    slowprint("Hast irgendwie doch kein bock zu laufen.. bleibste halt einfach hier und säufst...einmal Spritti immer Spritti");
                } else if (this.charakter1.getPegel() == 2) {
                    slowprint("\nFolgst ihm in den Raum in den er ging.. Es ist jedoch niemand mehr hier und SIEHE DA" +
                              "\ndu findest eine Maschinenpistole und ne kubanische Zigarre." +
                              "\nDamit wird die Sache mit der Bank ein zuckerschlecken!!!" +
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
                  "\nDu siehst nun die Bank vor dir." +
                  "\nBist du dir sicher,dass du bereit bist?" +
                  "\n" +
                  "\n" +
                  "\nWenn du >Nein< wählst, wirst du dir einfach die Birne zulaufen lassen und morgen" +
                  "\nohne Erinnerungen aufwachen,als wäre nie etwas gewesen." +
                  "\nDu erhältst die Chance auf einen Neustart." +
                  "\n" +
                  "\n1) Ja" +
                  "\n2) Nein");

        int auswahl = this.tastatur.nextInt();
        switch (auswahl) {
            case 1:
                slowprint("\nOkay. Auf gehts.");
                break;
            case 2:
                this.charakter1.setGesamtwert(0);
                this.charakter1.setPegel(0);
                this.charakter1.setGeld(50);
                this.start();
                break;
            default:
                slowprint("Wähle bitte etwas vernünftiges...1 oder 2");
        }


        slowprint("\n" +
                  "\n" +
                  "\nDu trinkst einen letzten Schluck Bier..und STÜRMST (wie ein Trottel)" +
                  "\ndirekt in die Bank!");
        if (this.charakter1.getGesamtwert() < 10) {
            slowprint("\nWie hast du dir das eigentlich vorgestellt..?" +
                      "\nDu hast keine Waffe..nichts..NICHTMAL ne MASKE?!" +
                      "\nNaja..Wenigstens hatten die Wachmänner gut was zu lachen..und im Gefängnis" +
                      "\nist es sowieso nicht soooo schlecht.");
        } else if (this.charakter1.getGesamtwert() > 9.9 && this.charakter1.getGesamtwert() < 15) {
            slowprint("Du gehst nun in die Bank..Du hast dich noch nie so bereit gefühlt!");
            getRandomNumber();
            if (getRandomNumber() > 0.5) {
                slowprint("\nDu hast heute Glück! Der Wachmann hat Urlaub." +
                          "\nGott sei Dank.. mit deiner mickrigen Bewaffnung hätte es sonst nie funktioniert." +
                          "\nDu erbeutest : 200 000$ Cash !");
            } else {
                slowprint("\nNaja, vielleicht hättest du dich besser vorbereiten sollen..?!!" +
                          "\nMit der Ausrüstung eine Bank zu überfallen..Das klappt nichtmal in Hollywood!");
                System.exit(0);
            }
        } else if (this.charakter1.getGesamtwert() == 15) {
            slowprint("\nDu bist bewaffnet wie der Terminator..Beim Anblick deiner goldenen russischen" +
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

    public static double getRandomNumber() {
        double max = 1;
        double min = 0;
        double rng = (int) (Math.random() * ((max - min) + 1)) + min;
        return rng;

    }


}


