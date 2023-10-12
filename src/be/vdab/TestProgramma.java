package be.vdab;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import be.vdab.util.Vervuiler;
import be.vdab.verwarming.Stookketel;
import be.vdab.voertuigen.Personenwagen;
import be.vdab.voertuigen.Vrachtwagen;

public class TestProgramma {
    public static void main(String[] args) {
        var p1 = new Personenwagen("Simon de Pauw", 15000F, 95, 5.06F, "IK-BEN-GAY", 4, 4);
        var v1 = new Vrachtwagen("Glen Meel", 10000F, 460, 30.5F, "IK-BEN-GAYER", 15000F);
        var p2 = new Personenwagen("Wietse Mees", 250000F, 1109, 20.0F, "IK-BEN-COOL", 2, 3);
        var s1 = new Stookketel(7.5F);


        var vervuilers = new Vervuiler[4];
        vervuilers[0] = p1;
        vervuilers[1] = v1;
        vervuilers[2] = p2;
        vervuilers[3] = s1;

        for (var vervuiler : vervuilers){
            System.out.println("Vervuiling: " + Math.round(vervuiler.berekenVervuiling()*100.0)/100.0);
        }

        System.out.println("\n*** Array van private geg van voertuigen ***");
        var privaat = new Privaat[3];
        privaat[0] = p1;
        privaat[1] = v1;
        privaat[2] = p2;
        for (var voertuig : privaat){
            voertuig.geefPrivateData();
        }

        System.out.println("\n*** Array van milieu geg van voertuigen ***");
        var milieu = new Milieu[3];
        milieu[0] = p1;
        milieu[1] = v1;
        milieu[2] = p2;
        for (var voertuig : milieu){
            voertuig.geefMilieuData();
        }

    }
}
