import java.util.Scanner;

public class zad4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Pierwszy bok trójkąta: ");
	int a = scanner.nextInt();
	System.out.println("Drugi bok trójkąta: ");
	int b = scanner.nextInt();
	System.out.println("Trzeci bok trójkąta: ");
	int c = scanner.nextInt();
	if(a+b<c||a+c<b||b+c<a){
		System.out.println("nie");
	}else{
		System.out.println("tak");
	}
  }
}
