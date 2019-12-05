import javax.crypto.spec.PSource;

public class Maison extends Habitable{
    private int nb_etage;
    private boolean garage,jardin,piscine;
    private float surface_habitable;

    public Maison(String adresse, float surface, float prix, boolean negociable, String description, String date, String photos, int nb_pieces, boolean meublee, int nb_etage, boolean garage, boolean jardin, boolean piscine, float surface_habitable) {
        super(adresse, surface, prix, negociable, description, date, photos, nb_pieces, meublee);
        this.nb_etage = nb_etage;
        this.garage = garage;
        this.jardin = jardin;
        this.piscine = piscine;
        this.surface_habitable = surface_habitable;
    }

    public void affich(){
        afficher();
        System.out.println("La maison est de "+getNb_pieces());
        System.out.println("Surface habitable est : "+ surface_habitable);
        System.out.println("Avec "+nb_etage+" etages");
        if (garage) {
            System.out.println("avec un Garage");
        }
        if (jardin) {
            System.out.println("Avec Jardin");
        }
        if (piscine){
            System.out.println("Avec Piscine");
        }
        if (getMeublee()){
            System.out.println("Et Meublée!");
        }

    }

}