import java.util.Scanner;

public class zad5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Podaj liczbę od 1 do 7: ");
	int x = scanner.nextInt();
	switch(x){
		case 1:
			System.out.println("Poniedziałek");
			break;
		case 2:
			System.out.println("Wtorek");
			break;
		case 3:
			System.out.println("Środa");
			break;
		case 4:
			System.out.println("Czwartek");
			break;
		case 5:
			System.out.println("Piątek");
			break;
		case 6:
			System.out.println("Sobota");
			break;
		case 7:
			System.out.println("Niedziela");
			break;
	}
  }
}
