import java.util.*;

public class Zumbi { 
    public double vida;
    public String nome;

    public double mostraVida() {
        return this.vida;
    }

    public void transfereVida(Zumbi zumbiAlvo, double quantia) {
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}