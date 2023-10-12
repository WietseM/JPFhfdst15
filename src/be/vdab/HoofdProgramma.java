package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class HoofdProgramma {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp[6];
        voorwerpen[0] = new Boekenrek();
        voorwerpen[1] = new Boekenrek(2, 1, 84.99F);
        voorwerpen[2] = new Leesboek();
        voorwerpen[3] = new Leesboek("De wolven van Arazan", "John Flanagan", 16.99F, "Actie/Avontuur", "Fictie");
        voorwerpen[4] = new Woordenboek();
        voorwerpen[5] = new Woordenboek("Van Dale Groot woordenboek Nederlands", "A.H. van den Baar", 34.99F, "vertaal woordenboek", "Nederlands");

        var winst = 0.0;
        for (var voorwerp : voorwerpen){
            voorwerp.gegevensTonen();
            winst += voorwerp.winstBerekenen();
        }
        System.out.println("De totale winst bedraagt = " + winst);
    }
}
