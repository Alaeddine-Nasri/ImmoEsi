public class ImmoEsi {
    public static int nb_bien; // nombre de bien proposé
    Bien tab_bien[] = new Bien[nb_bien];
    Bien tableau_arichive[] ;
    private int i;

    public ImmoEsi() {
        // constructeur
    }
    public void affi_biens(){
        i = 0;
        System.out.println("Le nombre de bien est : "+ nb_bien);
        for (i=0;i<nb_bien;i++) {
            System.out.println("Bien numero "+i+" : "+tab_bien[i]);
        }
    }
    public void rechreche(){
        i = 0;
        // tableau de criteres
        for (i=0;i<nb_bien;i++ ) {
            System.out.println("hna ndirou tableau jdid!");
        }
        //
    }
}
