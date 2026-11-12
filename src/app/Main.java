
package src.app;

import src.modelli.Auto;
import src.modelli.Motore;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Prepariamo una scatola che conterrà tutte le nostre auto
        List<Auto> listaAuto = new ArrayList<>();
        String percorsoFile = "database_auto.csv"; 
        String riga;

        try (BufferedReader br = new BufferedReader(new FileReader(percorsoFile))) {
            
            // Saltiamo la prima riga del CSV (le intestazioni)
            br.readLine(); 

            // Leggiamo il file riga per riga
            while ((riga = br.readLine()) != null) {
                
                // 1. Dividiamo la riga di testo in pezzi separati dalla virgola.
                // Es: "Volkswagen,Polo,1.0 TSI 95CV,17.0,250,22000" diventa un array di 6 stringhe.
                String[] dati = riga.split(",");
                
                // 2. Raccogliamo i primi tre dati che sono già delle stringhe (testo)
                String marca = dati[0];
                String modello = dati[1];
                String siglaMotore = dati[2];
                
                // 3. I successivi tre dati sono numeri, ma .split() ce li restituisce come string.
                // Usiamo Double.parseDouble() per forzare Java a leggerli come numeri decimali.
                double consumo = Double.parseDouble(dati[3]);
                double costoTagliando = Double.parseDouble(dati[4]);
                double prezzoBase = Double.parseDouble(dati[5]);
                
                // 4. Creiamo l'oggetto Motore usando la stringa appena estratta
                Motore motore = new Motore(siglaMotore);
                
                // 5. Ora abbiamo tutti gli "ingredienti" pronti. Costruiamo l'oggetto Auto!
                Auto auto = new Auto(marca, modello, motore, consumo, costoTagliando, prezzoBase);
                
                // 6. Salviamo l'auto finita nella nostra lista (la cassettiera principale)
                listaAuto.add(auto);
            }
            
            System.out.println("Database caricato con successo! Auto trovate: " + listaAuto.size());

        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
}