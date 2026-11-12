package src.modelli;
public class Auto {

    private final String marca;
    private final String modello;
    private final Motore motore;
    private final double consumoKmL;      
    private final double costoTagliando;
    private final double prezzoBase;

    public Auto (String marca, String modello, Motore motore, double consumoKmL, double costoTagliando, double prezzoBase){

        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca non valida.");
        }

        if (modello == null || modello.trim().isEmpty()) {
            throw new IllegalArgumentException("Modello non valido.");
        }

        if (motore == null) {
            throw new IllegalArgumentException("Motore non valido.");
        }

        if (consumoKmL <= 0 || !Double.isFinite(consumoKmL)) {
            throw new IllegalArgumentException("Consumo non valido.");
        }

        if (costoTagliando < 0 || !Double.isFinite(costoTagliando)) {
            throw new IllegalArgumentException("Costo tagliando non valido.");
        }

        if (prezzoBase <= 0 || !Double.isFinite(prezzoBase)) {
            throw new IllegalArgumentException("Prezzo base non valido.");
        }

        this.marca = marca;
        this.modello = modello;
        this.motore = motore;
        this.consumoKmL = consumoKmL;
        this.costoTagliando = costoTagliando;
        this.prezzoBase = prezzoBase;

    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public Motore getMotore() {
        return motore;
    }

    public double getConsumoKmL() {
        return consumoKmL;
    }

    public double getCostoTagliando() {
        return costoTagliando;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }



}
