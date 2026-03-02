import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      // -> linha unica
      
      /* -> para mais
      de uma linha */
      
      int idade;
      int ano = 2026;
      
      String nome = "Leozao";
      
      System.out.println(nome);
      System.out.println(nome.length());
      System.out.println(nome.toUpperCase());
      System.out.println(nome.toLowerCase());
      System.out.println(nome.getBytes());
      System.out.println(nome.replace("Leozao", "Petrus"));
      
      /*   exercicio 1    */
      
      int horas = 3;
      int primeiraHora = 10;
      int segundaHora = 4;
      int terceiraHora = 2;
      
      int soma = primeiraHora + segundaHora + terceiraHora;
      double media = soma / horas;
      
      System.out.println("Total: " + soma);
      System.out.println("Media: " + media);
      
      /*   exercicio 2    */
      
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