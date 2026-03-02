import java.util.*;

public class Main {
	public static void main(String[] args) {
	  /* Casting e Promocoes */
	  
		/*double pi = 3.1415;
		int inteiro = (int)pi;
		
	  System.out.println(pi);
	  System.out.println(inteiro);
		
		double numero = 2;
		int numero1 = (int)numero;
		
		System.out.println(numero);
		System.out.println(numero1);
		
		long x = 1000;
		int y = (int)x;
		
		System.out.println(x);
		System.out.println(y);
		
		int idade = 20;
		long idade1 = idade; //conversao por promocao
		int idade2 = (int) idade1; //conversao por casting
		
		float pi1 = 3.1415f;
		double pi2 = pi1; //conversao por promocao
		float pi3 = (float) pi2; //conversao por casting
		
		int ano = Integer.parseInt("2026"); //conversao por casting
		
		// char -> String
		char letra = 'F';
		String letra1 = String.valueOf(letra);
		String letra2 = Character.toString(letra);
		String letra3 = "" + letra;
		
		// String -> char
		String faculdade = "Inatel";
		char primeiraLetra = faculdade.charAt(0);
		
		System.out.print("Ola Mundo!");
		System.out.println("Ola mundo 2!");
		System.out.printf("hello world", 2);
		System.out.printf("Inatel", 3.1415);
		System.out.printf("Faculdade", "Inatel");*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idadeN = teclado.nextInt();
		
		System.out.println("Entre com sua altura: ");
		double alturaN = teclado.nextDouble();
		
		teclado.nextLine(); //limpa o buffer, captura o /n
		
		System.out.println("Entre com seu nome: ");
		String nomeN = teclado.nextLine();
		
    System.out.printf("%d, %2f, %s \n", idadeN, alturaN, nomeN);
	}
}