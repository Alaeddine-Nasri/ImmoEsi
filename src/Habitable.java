public abstract class  Habitable extends Bien {
    private int nb_pieces;
    private boolean meublee;

    public Habitable(String adresse, float surface, float prix, boolean negociable, String description, String date, String photos, int nb_pieces, boolean meublee) {
        super(adresse, surface, prix, negociable, description, date, photos);
        this.nb_pieces = nb_pieces;
        this.meublee = meublee;
    }

    public int getNb_pieces() {
        return nb_pieces;
    }

    public boolean getMeublee() {
        return meublee;
    }

    public abstract void affich();
}
