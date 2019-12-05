public class Terrain extends NonHabitable {


    @Override
    public void affich() {
        afficher();
        System.out.println("Nombre de façade est : "+ getNb_facades());
        System.out.println("Etat juridique: "+ getEtat_juidique());
    }
}
