public abstract class Bien implements Comparable {
    private String adresse;
    private float surface;
    private float prix;
    private boolean negociable;
    private String description,date,photos;


    public Bien(String adresse, float surface, float prix, boolean negociable, String description, String date, String photos) {
        this.adresse = adresse;
        this.surface = surface;
        this.prix = prix;
        this.negociable = negociable;
        this.description = description;
        this.date = date;
        this.photos = photos;
    }

    public float calcule_prix;

    @Override
    public int compareTo(Object o) {
        if (this.date> ((Bien)o).date ) {return 1;}
        else {return -1;}
    }

    public void afficher(){
        System.out.println("affiche les details d'un bien");
    }
    public void afficher_prix(){
        System.out.println("prix d'un bien");
    }
}
