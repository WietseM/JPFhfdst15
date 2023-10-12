package be.vdab.voorwerpen;

public class Woordenboek extends Boek{
    private String taal;
    private final static float WINSTMARGE = 1.75F;

    public Woordenboek() {
        this("Woordenboek Engels", "Van Dale", 30.10F, "vertaal woordenboek",
                "Engels-Nederlands");
    }

    public Woordenboek(String titel, String auteur, float aankoopprijs, String genre, String taal) {
        super(titel, auteur, aankoopprijs, genre);
        setTaal(taal);
    }

    public void setTaal(String taal) {
        if (taal != null){
            this.taal = taal;
        }
    }

    @Override
    public void gegevensTonen() {
        System.out.println("\nWOORDENBOEK");
        super.gegevensTonen();
        System.out.println("taal: " + taal);
        System.out.println("Berekende winst: " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return super.getAankoopprijs() * WINSTMARGE;
    }

    @Override
    public String toString() {
        return  super.toString() + " ; " + taal + " ; " + WINSTMARGE;
    }
}

