import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("ESERCIZIO 1");

        Scanner scanner = new Scanner(System.in);

        //DEFINISCO QUANTE PAROLE INSERIRE
        System.out.println("Quante parole vuoi inserire?");
        int n = scanner.nextInt();

        Set<String> parole = new HashSet<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Definisci parola " + (i) + " :");
            String parola = scanner.next();
            parole.add(parola);
            if (){

            }
        }

        System.out.println(parole);

   //STAMPO PAROLE DUPLICATE

Set<String> paroleDupli = trovaParoleDupli(parole);

    }
}