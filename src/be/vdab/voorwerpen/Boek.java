package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopprijs;
    private String genre;

    public Boek(String titel, String auteur, float aankoopprijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
    }

    public final void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0.0){
            this.aankoopprijs = aankoopprijs;
        }
    }

    public final void setTitel(String titel) {
        if (titel != null){
            this.titel = titel;
        }
    }

    public final void setAuteur(String auteur) {
        if(auteur != null){
            this.auteur = auteur;
        }
    }

    public final void setGenre(String genre) {
        if (genre != null){
            this.genre = genre;
        }
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    @Override
    public void gegevensTonen() {
        System.out.println("titel: " + titel);
        System.out.println("auteur: " + auteur);
        System.out.println("eigenaar: " + EIGENAAR);
        System.out.println("aankoopprijs: " + aankoopprijs);
        System.out.println("genre: " + genre);
    }

    @Override
    public String toString() {
        return  titel + ";" + auteur + ";" + EIGENAAR + ";" + aankoopprijs + ";" + genre;
    }
}