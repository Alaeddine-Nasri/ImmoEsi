public class Appart extends Habitable {
    private int etage;
    private boolean duplexe;

    public Appart(String adresse, float surface, float prix, boolean negociable, String description, String date, String photos, int nb_pieces, boolean meublee, int etage, boolean duplexe) {
        super(adresse, surface, prix, negociable, description, date, photos, nb_pieces, meublee);
        this.etage = etage;
        this.duplexe = duplexe;
    }

    public void affich(){
        afficher();
        System.out.println("Nombre de pièces : "+getNb_pieces());
        System.out.println("nombre d'etage  :"+ etage);
        if (duplexe){
            System.out.println("duplexé");
        }
        if (getMeublee()){
            System.out.println("Et Meublée!");
        }
    }
}
