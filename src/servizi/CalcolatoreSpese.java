package src.servizi;

import src.modelli.Auto;

public class CalcolatoreSpese {

    public double calcolaSpesaAnnua(Auto auto, double chilometri, double prezzoCarburante) {

        double SpesaTot = (chilometri/auto.getConsumoKmL()) * prezzoCarburante + auto.getCostoTagliando();

        return SpesaTot;
    
        
    }
}