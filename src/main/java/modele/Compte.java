package modele;

public class Compte {
    private int numero;
    private String description;

    public Compte(int numero, String description) {
        this.numero = numero;
        this.description = description;
    }

    public Compte(){

    }

    public int getNumero() {
        return numero;
    }

    public String getDescription() {
        return description;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "numéro de modele compte : " + numero + " - " + description;
    }
}
