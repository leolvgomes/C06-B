import java.util.*;

public class Main {
    public static void main(String[] args) {
      int inteira = 30;
      int meia = 15;
      int nI = 8;
      int nM = 5;
      
      int totalI = nI * inteira;
      int totalM = nM * meia;
      int total = totalI + totalM;
      double valorMedio = total / (nI + nM);
      
      System.out.println("Total de Inteiras: " + totalI);
      System.out.println("Total de Meias: " + totalM);
      System.out.println("Total arrecadado: " + total);
      System.out.println("Media dos valores: " + valorMedio);
    }
}