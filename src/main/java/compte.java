public class compte {
    private int numero;
    private String description;

    public compte(int numero, String description) {
        this.numero = numero;
        this.description = description;
    }

    public compte(){

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
        return "numéro de compte : " + numero + " - " + description;
    }
}
