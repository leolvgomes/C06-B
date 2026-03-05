import java.util.*;

public class Main {
    public static void main(String[] args) {
      Random rand = new Random();
      
      int x = rand.nextInt(10) + 1;
      
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Qual o numero sorteado? ");
      int num = teclado.nextInt();
      
      while (num != x) {
        System.out.println("O numero esta incorreto, tente novamente: ");
        num = teclado.nextInt();
        
        if (num == x) {
          System.out.println("Parabens! Voce acertou o numero sorteado!");
          break;
        }
      }
    } 
}