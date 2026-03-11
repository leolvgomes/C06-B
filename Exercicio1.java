import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtdInteira;
        int qtdMeia;

        String valorInteiraStr;
        String valorMeiaStr;

        double valorInteira;
        double valorMeia;

        System.out.println("Quantidade de ingressos inteiros:");
        qtdInteira = scanner.nextInt();

        System.out.println("Quantidade de ingressos meia:");
        qtdMeia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Valor do ingresso inteiro:");
        valorInteiraStr = scanner.nextLine().replace(",", ".");
        valorInteira = Double.parseDouble(valorInteiraStr);

        System.out.println("Valor do ingresso meia:");
        valorMeiaStr = scanner.nextLine().replace(",", ".");
        valorMeia = Double.parseDouble(valorMeiaStr);

        double totalInteira = qtdInteira * valorInteira;
        double totalMeia = qtdMeia * valorMeia;
        double totalArrecadado = totalInteira + totalMeia;

        int totalIngressos = qtdInteira + qtdMeia;
        double media = totalArrecadado / totalIngressos;

        System.out.println("Total arrecadado com inteiras: " + totalInteira);
        System.out.println("Total arrecadado com meia: " + totalMeia);
        System.out.println("Total arrecadado: " + totalArrecadado);
        System.out.println("Valor médio por ingresso: " + media);

        scanner.close();
    }
}
