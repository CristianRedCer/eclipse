import java.util.Scanner;
public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("holamundo");
		int a,b,c,d;
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Introduzca un valor para la suma y resta(Este tiene que ser mayor que el siguiente)");
		a = teclado.nextInt();
		System.out.println("Introduzca un valor para la suma y resta(Este tiene que ser mayor que el siguiente)");
		b = teclado.nextInt();
		c = a + b;
		d = a - b;
		System.out.println("La suma y la resta de " + a + " y " + b + " da como resultado: " + c + " y " + d );
		
	}

}
