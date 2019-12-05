public class Terrain extends NonHabitable {


    public Terrain(String adresse, float surface, float prix, boolean negociable, String description, String date, String photos, int nb_facades, String etat_juidique) {
        super(adresse, surface, prix, negociable, description, date, photos, nb_facades, etat_juidique);
    }

    @Override
    public void affich() {
        afficher();
        System.out.println("Nombre de façade est : "+ getNb_facades());
        System.out.println("Etat juridique: "+ getEtat_juidique());
    }
}
