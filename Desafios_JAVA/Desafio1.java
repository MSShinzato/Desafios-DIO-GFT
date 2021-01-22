import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    int valor, resto;

    Scanner scanner = new Scanner(System.in);
    valor = scanner.nextInt();

    for(int i=1;i<=valor;i++){
      resto = i%2;
      if(resto==0){
        System.out.println(i);
      }
    }
  }
}