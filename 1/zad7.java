import java.util.Scanner;

public class zad7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Podaj x pierwszego punktu: ");
	int x1 = scanner.nextInt();
	System.out.println("Podaj y pierwszego punktu: ");
	int y1 = scanner.nextInt();
	System.out.println("Podaj x drugiego punktu: ");
	int x2 = scanner.nextInt();
	System.out.println("Podaj y drugiego punktu: ");
	int y2 = scanner.nextInt();
	int x;
	int y;
	double z;
	if(x1>x2){
		x = x1-x2;
	}else{
		x = x2-x1;
	}
	if(y1>y2){
		y = y1-y2;
	}else{
		y = y2-y1;
	}
	z = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	System.out.println("Odległość między punktami wynosi "+z);
  }
}