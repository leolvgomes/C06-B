import java.util.*;

public class Main {
	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Quantos lanches foram consumidos na primeira hora? ");
		int hora1 = teclado.nextInt();
		
		System.out.println("Quantos lanches foram consumidos na segunda hora? ");
		int hora2 = teclado.nextInt();
    
    System.out.println("Quantos lanches foram consumidos na terceira hora: ");
		int hora3 = teclado.nextInt();
		
		int soma = hora1 + hora2 + hora3;
		double media = (hora1 + hora2 + hora3) / 3;
		
		System.out.println("Foram consumidos " + soma + " lanches.");
		System.out.println("A media de lanches consumidos em cada hora foi de " + media + " lanches.");
	}
}