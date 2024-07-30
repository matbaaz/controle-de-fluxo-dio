import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    int valor1, valor2;
    System.out.println("Digite o primeiro parametro:");
    valor1 = terminal.nextInt();
    System.out.println("Digite o segundo parametro:");
    valor2 = terminal.nextInt();
    try {
      contar(valor1,valor2);
    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
    if (parametroUm >= parametroDois){
      throw new ParametrosInvalidosException("Parametro 2 deve ser maior que o Parametro 1...");
    }
    int quantidade = parametroDois - parametroUm;
    for (int i=1; i <= quantidade; i++) System.out.println("Imprimindo o número "+ i);
  }
}
