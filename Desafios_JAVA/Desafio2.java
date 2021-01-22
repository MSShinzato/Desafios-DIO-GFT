import java.io.IOException;
import java.util.Scanner;

public class Desafio{
	
    public static void main(String[] args) throws IOException {
      int idade, anos, meses, dias, diasRestantes;

      Scanner scanner = new Scanner(System.in);
      idade = scanner.nextInt();

      anos = idade/365;
      diasRestantes = idade-(anos*365);
      meses = diasRestantes/30;
      dias = diasRestantes-(meses*30);

      System.out.println(anos + " ano(s)");
      System.out.println(meses + " mes(es)");
      System.out.println(dias + " dia(s)");
    }
}