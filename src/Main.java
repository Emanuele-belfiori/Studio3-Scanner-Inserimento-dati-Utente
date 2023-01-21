import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Scanner");

        /*
         * User input ---> inserimento dati dall'utente:
         *
         * - Importare java.util.Scanner (classe Scanner da inserire come prima cosa all'inizio del
         * programma, prima di [public class Main] alcuni IDE come intellij lo inseriscono in automatico
         * quando richiamiamo la classe [Scanner scanner = new Scanner(System.in)] altri necessitano
         * come detto dell'inserimento manuale.
         *
         * - Creare oggetto scanner
         *
         * - Creare domande per utente: nnome, cognome, età, città
         */

        Scanner scanner = new Scanner(System.in); // richiamare classe scanner

        System.out.println("Qual'è il tuo nome? "); // Chiediamo all'utente l'inserimento del nome

        String name = scanner.nextLine(); // Comando che abilita l'utente all'inserimento di un dato

        System.out.println("Qual'è il tuo cognome? ");
        String surname = scanner.nextLine();

        System.out.println("Qual'è la tua età? ");
        int age = scanner.nextInt(); /* Mettiamo int sia nella variabile che nella stampa perchè il dato
                                        che vogliamo che inserisca è 1 numero intero */
        scanner.nextLine(); /* Dobbiamo creare questo scanner riga perchè dopo l'inserimento del numero
        //                     intero l'inserimento dati non va a capo quindi esce dal programma. */


        System.out.println("In quale città vivi? ");
        String city = scanner.nextLine();

        System.out.println("Sei singol? ");
        boolean single= scanner.nextBoolean(); /* Perchè il programma non vada in errore l'utente
                                                  dovrà inserire valore true o false */
        scanner.nextLine();


        System.out.println("Ciao " + name + " " + surname);
        /* Concatenazione= con il comando String name e surname inserirà il suo nome e il cognome,
           facendo una stampa con il saluto ("Ciao " + nome + cognome) ritroveremo a stampa ciao con il nome
           e cognome a seguire inserito dall'utente. */

        System.out.println("Hai " + age + " anni"); // Stampa dell'età

        System.out.println("E vivi a " + city);

        System.out.println("Sei single? " + single); // a stampa darà il valore booleano true o false


    }
}

