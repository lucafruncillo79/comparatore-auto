# Car Comparator (Java)

Un'applicazione sviluppata in **Java** orientata agli oggetti per il calcolo e il confronto delle spese di gestione annuali di diverse autovetture. Il programma legge i dati tecnici da un database esterno (`.csv`), acquisisce i parametri dinamici dell'utente (chilometri annui e prezzo del carburante) e restituisce una stima dettagliata dei costi per ciascun veicolo.

---

## Architettura del Progetto

Il progetto segue i principi dell'Ingegneria del Software e il *Single Responsibility Principle*, organizzando il codice in package dedicati all'interno della cartella `src`:

```text
comparatore-auto/
│
├── src/
│   ├── app/
│   │   └── Main.java             # Classe di avvio, gestione flusso e interazione utente (Scanner)
│   ├── modelli/
│   │   ├── Auto.java             # Modello dati dell'auto (Incapsulamento e composizione)
│   │   └── Motore.java           # Modello dati della motorizzazione
│   └── servizi/
│       └── CalcolatoreSpese.java # Classe di servizio (stateless) per il calcolo matematico
│
├── database_auto.csv             # Database sorgente con le specifiche tecniche dei veicoli
└── README.md                     # Documentazione del progetto
```

## Formato del Database (database_auto.csv)

Il file CSV contiene le informazioni strutturate dei veicoli suddivise nelle seguenti colonne:

Marca (marca)

Modello (modello)

Motorizzazione (motore)

Consumo medio (consumo_km_l espressi in km/l)

Costo base del tagliando (costo_tagliando in €)

Prezzo di listino (prezzo_base in €)