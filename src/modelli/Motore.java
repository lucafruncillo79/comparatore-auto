package src.modelli;
public class Motore {

    private final String sigla;

    public Motore(String sigla) {

    if (sigla == null || sigla.trim().isEmpty()) {
            throw new IllegalArgumentException("Sigla motore non valida.");
        }

        this.sigla = sigla;
        
    }

    public String getSigla() {
        return sigla;
    }
}