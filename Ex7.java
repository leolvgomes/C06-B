import java.util.*;

public class Main {
    public static void main(String[] args) {
		Random rand = new Random();
      
      int x = rand.nextInt(10) + 1;
      
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Qual o numero sorteado? ");
      int num = teclado.nextInt();
      
      while (num != x) {
        if (num > x) {
          System.out.println("Seu numero e maior que o numero sorteado, tente novamente: ");
          num = teclado.nextInt();
        }
        else {
          System.out.println("Seu numero e menor que o numero sorteado, tente novamente: ");
          num = teclado.nextInt();
        }
      }
      System.out.println("Parabens! Voce acertou o numero sorteado!");
    } 
}