public abstract class NonHabitable extends Bien {
    private int nb_facades;
    private String etat_juidique;

    public NonHabitable(String adresse, float surface, float prix, boolean negociable, String description, String date, String photos, int nb_facades, String etat_juidique) {
        super(adresse, surface, prix, negociable, description, date, photos);
        this.nb_facades = nb_facades;
        this.etat_juidique = etat_juidique;
    }
    public abstract void affich();
}
