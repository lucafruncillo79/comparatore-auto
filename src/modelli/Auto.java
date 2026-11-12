package src.modelli;
public class Auto {

    private final String marca;
    private final String modello;
    private final Motore motore;
    private final double consumoKmL;      
    private final double costoTagliando;
    private final double prezzoBase;

    public Auto (String marca, String modello, Motore motore, double consumoKmL, double costoTagliando, double prezzoBase){

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
