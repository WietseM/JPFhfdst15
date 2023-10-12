package be.vdab.voorwerpen;

public class Leesboek extends Boek {
    private String onderwerp;
    private final static float WINSTMARGE = 1.5F;

    public Leesboek() {
        this("Java for beginners ", "O Reilly", 10.5F, "studie", "Informatica" );
    }

    public Leesboek(String titel, String auteur, float aankoopprijs, String genre, String onderwerp) {
        super(titel, auteur, aankoopprijs, genre);
        setOnderwerp(onderwerp);
    }

    public final void setOnderwerp(String onderwerp) {
        if(onderwerp != null){
            this.onderwerp = onderwerp;
        }
    }

    @Override
    public void gegevensTonen() {
        System.out.println("\nLEESBOEK");
        super.gegevensTonen();
        System.out.println("onderwerp: " + onderwerp);
        System.out.println("Berekende winst: " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return super.getAankoopprijs() * WINSTMARGE;
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + onderwerp + " ; " + WINSTMARGE;
    }
}
