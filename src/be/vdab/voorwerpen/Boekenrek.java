package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public class Boekenrek implements Voorwerp {
    private int hoogte;
    private int breedte;
    private float aankoopprijs;
    private final static float WINSTMARGE = 2.0F;

    public Boekenrek() {
        this(175, 100, 40.0F);
    }

    public Boekenrek(int hoogte, int breedte, float aankoopprijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopprijs(aankoopprijs);
    }

    public final void setHoogte(int hoogte) {
        if (hoogte > 0) {
            this.hoogte = hoogte;
        }
    }

    public final void setBreedte(int breedte) {
        if (breedte > 0) {
            this.breedte = breedte;
        }
    }

    public void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0.0) {
            this.aankoopprijs = aankoopprijs;
        }
    }

    @Override
    public void gegevensTonen() {
        System.out.println("\nBOEKENREK");
        System.out.println("eigenaar: " + EIGENAAR);
        System.out.println("hoogte: " + hoogte);
        System.out.println("breedte: " + breedte);
        System.out.println("aankoopprijs: " + aankoopprijs);
        System.out.println("Berekende winst: " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return aankoopprijs * WINSTMARGE;
    }

    @Override
    public String toString() {
        return  EIGENAAR + ";" + hoogte + ";" + breedte + ";" + aankoopprijs + " ; " + WINSTMARGE;
    }
}