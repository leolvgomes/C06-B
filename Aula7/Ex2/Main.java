import java.util.*;

public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Zumbi 1";
        zumbi1.vida = 100;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Zumbi 2";
        zumbi2.vida = 50;

        System.out.println("Vida do " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida do " + zumbi2.nome + ": " + zumbi2.mostraVida());

        System.out.println("----- Transferindo vida -----");

        zumbi1.transfereVida(zumbi2, 20);

        System.out.println("Vida do " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida do " + zumbi2.nome + ": " + zumbi2.mostraVida());
    }
}