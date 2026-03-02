import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
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
		    System.out.println("Sua nota foi: " + NFA + " Voce foi aprovado pela P3!");
		  }
		  else {
		    System.out.println("Sua nota foi: " + NFA + " Voce foi reprovado pela NP3...");
		  }
		}
		else {
		  System.out.println("Voce foi reprovado...");
		}
	}
}