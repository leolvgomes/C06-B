import java.util.*;

public class Main {
    public static void main(String[] args) {
		
      NewClass1 zumbi = new NewClass1();
      zumbi.sabeSobreSi = "Nome";
      zumbi.sabeFazer = "Correr";
      
      NewClass1 zumbi2 = new NewClass1();
      zumbi2.sabeSobreSi = "Mae";
      zumbi2.sabeFazer = "Nadar";
      
      System.out.println("O zumbi 1 sabe sobre si: " + zumbi.sabeSobreSi);
      System.out.println("O zumbi 1 sabe: " + zumbi.sabeFazer);
      
      System.out.println("O zumbi 2 sabe sobre si: " + zumbi2.sabeSobreSi);
      System.out.println("O zumbi 2 sabe: " + zumbi2.sabeFazer);
    }
}