
package src.servizi;

import src.modelli.Auto;

public class CalcolatoreSpese {

    // Calcola esclusivamente il costo del carburante
    public double calcolaCostoCarburante(Auto auto, double chilometri, double prezzoCarburante) {

        if (auto == null) {
            throw new IllegalArgumentException("Automobile non valida.");
        }

        if (chilometri < 0 || !Double.isFinite(chilometri)) {
            throw new IllegalArgumentException("Chilometri non validi.");
        }

        if (prezzoCarburante < 0 || !Double.isFinite(prezzoCarburante)) {
            throw new IllegalArgumentException("Prezzo carburante non valido.");
        }

        return (chilometri / auto.getConsumoKmL()) * prezzoCarburante;
    }

    // Calcola il costo totale annuale
    public double calcolaSpesaAnnua(Auto auto, double chilometri, double prezzoCarburante) {

        double costoCarburante = calcolaCostoCarburante(auto, chilometri, prezzoCarburante);

        return costoCarburante + auto.getCostoTagliando();
    }
}
