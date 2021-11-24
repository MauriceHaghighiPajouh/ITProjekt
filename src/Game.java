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
    Waffen waffe1 = new Waffen("Messer", 45);
    Waffen waffe2 = new Waffen("9mm", 85);
    Waffen waffe3 = new Waffen("AK47", 100);
    Waffen waffe4 = new Waffen("baseballschläger", 20);
    Waffen waffe5 = new Waffen("Flasche", 10);
    Waffen waffe6 = new Waffen("Faust", 5);

    //INIT Rüstung

    Ruestung rüstung1 = new Ruestung("Jacke", 10);
    Ruestung rüstung2 = new Ruestung("Kugelsichere Weste", 50);
    Ruestung rüstung3 = new Ruestung("Stahlkappenschuhe", 20);

    Scanner tastatur = new Scanner(System.in);

    public void start() throws InterruptedException {
        slowprint("Es ist mitten in der Nacht in New York im 21ten Jahrunderts und du wachst in deinem unterkühlten Apartment in der 5th Avenue auf." +
                "\n Neben deiner veranzten Matratze liegen 50 Dollar, ein Schlüssel zum Lagerplatz deines besten Freundes (zu dem du schon lange keinen Kontakt mehr hast) " +
                "\nund ein halb stumpfes Butterfly Messer. " +
                "\nDu beschließt dein Leben zu ändern und der Armut zu entkommen. " +
                "\nDu beschließt eine Bank zu überfallen. Du ziehst dich an und  noch bevor die Uhr 2 schlägt verlässt du dein Apartment. " +
                "\nDu stehst nun vor deiner Tür.");

        // AKT 1
        slowprint("Was möchtest du tun?" +
                "\n1) Gehe in den Park neben deinem Apartment" +
                "\n2) Gehe die 5th Avenue entlang" +
                "\n3) Besuche die Bar auf der anderen Straßenseite");


        //SCANNER1


        int auswahl = this.tastatur.nextInt();


        //Switch case
        String auswahlakt1;
        switch (auswahl) {
            case 1:
                auswahlakt1 = "Du bist nun im Park.\nVor dir siehst du einen Obdachlosen und ein Pärchen." +
                        "\nDu könntest sowohl den Obdi als auch das Pärchen überfallen." +
                        "\nNatürlich könntest du auch etwas Vodka trinken." +
                        "\nWas möchtest du tun?" +
                        "\n1) Den Obdachlosen überfallen" +
                        "\n2) Das Pärchen überfallen" +
                        "\n3)Vodka!";
                this.geheZumPark();
                break;
            case 2:
                auswahlakt1 = "Du bist nun in der 5th Avenue(vielleicht siehst du Heidi klum?)";
                break;
            case 3:
                auswahlakt1 = "Du bist nun in der Bar";
                break;
            default:
                auswahlakt1 = "Es gibt nur 1,2 oder 3. Wähl was vernünftiges";
                break;

        }
        slowprint(auswahlakt1);
    }

    public void geheZumPark() {


        int auswahl = this.tastatur.nextInt();
        String auswahlPark;

        switch (auswahl){
            case 1:
                auswahlPark="Herzlichen Glückwunsch,du hast einen Obdachlosen überfallen. Schäm dich!"+System.err;
                break;
            case 2:
                auswahlPark="Nice!Das Ahnungslose Pärchen hatte 100$ dabei. Die gehören jetzt dir!";
                break;
            case 3:
                auswahlPark="Du kannst es einfach nicht sein lassen,oder?"+System.err;
                break;
            default:
                auswahlPark="Es gibt nur 1,2 oder 3.Wähl was vernünftiges";
                break;


        }
        System.out.println(auswahlPark);
    }


    public void geheZumMarkt() {
        int akt1 = this.tastatur.nextInt();
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



