package modele;

public class Utilisateur {

    private int idUtilisateur;
    private String prenom;
    private String nom;

    public Utilisateur(int idUtilisateur, String prenom, String nom) {
        this.idUtilisateur = idUtilisateur;
        this.prenom = prenom;
        this.nom = nom;
    }

    public Utilisateur() {
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString(){
        return "Utilisateur numéro : " + idUtilisateur + " - " + nom + " " + prenom;
    }
}
