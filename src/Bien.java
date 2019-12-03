public class Bien extends ImmoEsi {
    private String adresse;
    private float surface;
    private float prix;
    private boolean negociable;
    private String description,date,photos;

    public void afficher(){
        System.out.println("affiche les details d'un bien");
    }
    public void afficher_prix(){
        System.out.println("prix d'un bien");
    }
}
