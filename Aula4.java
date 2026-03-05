import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      /* teclado = new Scanner(System.in);
      
      System.out.println("Informe a Quantidade: ");
      int qtd = teclado.nextInt(); */
      
      /* while(qtd > 0) {
        qtd--; // qtd = qtd - 1;
      } */
      
      /* do {
        System.out.println(qtd);
        qtd = qtd - 1;
      } while (qtd > 0); */
      
      /* for (int i = 0; i <= 10; i++) {
        System.out.println(i);
      } */
      
      /* int[] vetor = {1, 3, 6, 2};
      
      for (int numero: vetor) {
        System.out.println(numero);
      }
      
      System.out.println("-----------");
      
      for (int i = 0; i < vetor.length; i++) {
        System.out.println(vetor[i]);
      }
      
      int x = 3;
      int y1 = 2;
      
      if (x == 2) {
        int y = 2;
        y1 = 0;
      }
      
      int y = 3; */
    
      /* while (qtd > 0) {
        System.out.println(qtd);
        qtd--;
        
        if (qtd == 5)
          break;
      } */
      
      /* Exercicio 6
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
      } */
      
      /* Exercicio 7
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
      System.out.println("Parabens! Voce acertou o numero sorteado!"); */
    } 
}