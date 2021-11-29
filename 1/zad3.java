import java.util.Scanner;

public class zad3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Ilość stopni Celcjusza: ");
	int c = scanner.nextInt();
	System.out.println("Ilość stopni Fahrenheita: "+ (9/5)*c+32);
  }
}
