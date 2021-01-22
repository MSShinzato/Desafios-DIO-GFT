import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    int nota;

    Scanner scanner = new Scanner(System.in);
    nota = scanner.nextInt();

    if(nota<0||nota>100){
      System.out.println("Nota invalida.");
    }
    if(nota==0){
      System.out.println("E");
    }
    if(nota>=1&&nota<=35){
      System.out.println("D");
    }
    if(nota>=36&&nota<=60){
      System.out.println("C");
    }
    if(nota>=61&&nota<=85){
      System.out.println("B");
    }
    if(nota>=86&&nota<=100){
      System.out.println("A");
    }
    
  }
}