import java.util.*;

public class Main {
	public static void main(String[] args){
		
		/*Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com um numero: ");
		int qtd = teclado.nextInt();
		
		if (qtd >= 5) {
		  System.out.println("Qtd e maior do que 5");
		}
		else if (qtd > 3 & qtd < 5) {
		  System.out.println("Qtd e maior ou igual a 3 e menor do que 5");
		}
		else {
		  System.out.println("Qtd e menor do que 3");
		} */
		
		/* Exercicio 4 */
		
		/*Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com sua NPA: ");
		int NPA = teclado.nextInt();
		
		if (NPA >= 60) {
		  System.out.println("Voce foi aprovado!");
		}
		else if (NPA >= 30 & NPA < 60) {
		  System.out.println("Voce devera fazer a NP3. Qual a sua nota da NP3? ");
		  int NP3 = teclado.nextInt();
		  
		  double NFA = (NPA + NP3) / 2;
		  
		  if (NFA >= 50) {
		    System.out.println("Sua nota foi: " + NFA + " Voce foi aprovado pela NP3!");
		  }
		  else {
		    System.out.println("Sua nota foi: " + NFA + " Voce foi reprovado pela NP3...");
		  }
		}
		else {
		  System.out.println("Voce foi reprovado...");
		}*/
		
	  /* Switch Cases */
	  
	  /*Scanner inatel = new Scanner(System.in);
	  
	  int qtd = inatel.nextInt();
	  
	  switch (qtd) {
	    case 1:
	      System.out.println("Quantidade = 1");
	    case 2:
	      System.out.println("Quantidade = 2");
	      break;
	    case 3:
	      System.out.println("Quantidade = 2");
	      break;
	    case 5:
	      System.out.println("Quantidade = 5");
	      System.out.println("Inatel");
	      break;
	    default:
	      System.out.println("Condicao Padrao");
	  }*/
	  
	  /* Exercicio 5 */
	  
	  Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos alunos estao matriculados em C06: ");
		int alunos = teclado.nextInt();
		
		switch (alunos) {
	    case 10:
	      System.out.println("A sala utiliada sera a l-6.");
	      break;
	    case 20:
	      System.out.println("A sala utiliada sera a l-6.");
	      break;
	    case 30:
	      System.out.println("A sala utiliada sera a l-5.");
	      break;
	    default:
	      System.out.println("Condicao Padrao");
		}
	}
}