import java.util.Scanner;

public class SesionPoo {
	
//	static void hello() {
//		
//		System.out.println("Hola");
//	}
	
//	static void nombre() {
//		
//		System.out.println("jorge");
//	}
	
//	public static int sum( int a , int b ) {
//		
//		return a + b;
//	}
	
//	static void hello2(String nombre) {
//		
//		System.out.println("hola "+ nombre);
//	}
//
//	// METODO Main
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
////		hello();
////		nombre();
//		
//		
//		hello2("adrian");
//		
//	}



// calculadora basica + - * /

public static int sum( int a , int b ) {
	
	return a + b;
}

public static int resta( int a , int b ) {
	
	return a - b;
}
public static int mul( int a , int b ) {
	
	return a * b;
}
public static int div( int a , int b ) {
	
	return a / b;
}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int a, b;
	System.out.println("Ingrese el primer dato : ");
	a = scan.nextInt();
	System.out.println("Ingrese el segundo dato : ");
	b = scan.nextInt();
	
	int s = sum(a, b);
	int r = resta(a, b);
	int m = mul(a, b);
	double d = div(a, b);
	System.out.println("La suma es : "+s);
	System.out.println("La resta es : "+r);
	System.out.println("La multiplicacion es : "+m);
	System.out.println("La division es : "+d);
	
}
}







