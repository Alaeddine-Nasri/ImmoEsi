public class Proprietaire {
    private int num_tel;
    private String nom,prenom,mail,address;
    private Bien bien[];

    public Proprietaire(int num_tel, String nom, String prenom, String mail, String address, Bien[] bien) {
        this.num_tel = num_tel;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.address = address;
        this.bien = bien;
    }


    public void afficher_prop(){
        System.out.println("Mr" +nom + prenom+ "a ces bien :");
        for(int i = 0; i < bien.length; i ++){
            System.out.println(+i+ "/  " +bien[i]);
        }
    }
}
