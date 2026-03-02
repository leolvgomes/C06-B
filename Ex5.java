import java.util.*;

public class Main {
	public static void main(String[] args){
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