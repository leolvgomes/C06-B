import java.util.*;

public class Conta {
  // Atributos
  public double saldo;
  public int numero;
  public double limite;
  //public String nomeDono; // nao e mais necessario
  public Cliente titular
  
  // Metodos
  public void deposito(double quantia) {
    this.saldo += quantia;
  }
  
  public void saque(double quantia) {
    this.saldo -= quantia;
  }
  
  public void transferir(NewClass1 contaDestino, double quantia){
    this.saldo -= quantia;
    contaDestino.saldo += quantia;
  }
  
  public String sabeSobreSi;
  public String sabeFazer;
  
}