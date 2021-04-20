public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int res = 0;
		String respuesta="";
		
		do {
			System.out.println("Elige una operacion para hacer:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			opcion = sc.nextInt();
			
			System.out.println("Introduce el primer numero con el que vas a operar:");
			int n1 = sc.nextInt();
			System.out.println("Introduce el segundo numero con el que vas a operar:");
			int n2 = sc.nextInt();
			
			switch(opcion) {
			case 1:
				res = suma(n1, n2);
				System.out.println("El resultado de la suma de " + n1 + "+" + n2 + " es: " + res);
				break;
				
			case 2:
				res = suma(n1, n2);
				System.out.println("El resultado de la resta de " + n1 + "-" + n2 + " es: " + res);
				break;
				
			case 3:
				res = suma(n1, n2);
				System.out.println("El resultado de la multiplicacion de " + n1 + "*" + n2 + " es: " + res);
				break;
				
			case 4:
				res = suma(n1, n2);
				System.out.println("El resultado de la division de " + n1 + "/" + n2 + " es: " + res);
				break;
			}
			
			System.out.println("¿Quieres volver a hacer otra operacion? S para si, N para no");
			sc.nextLine();
			respuesta = sc.nextLine();
			
			if(respuesta.equalsIgnoreCase("N")) {
				System.out.println("¡Adios!");
			}
		} while(respuesta.equalsIgnoreCase("S"));
	}
		
	public static int suma(int n1, int n2) {
		int res = n1 + n2;
		return res;
	}
		
	public static int resta(int n1, int n2) {
		int res = n1 - n2;
		return res;
	}
		
	public static int multiplicar(int n1, int n2) {
		int res = n1 * n2;
		return res;
	}
		
	public static int dividir(int n1, int n2) {
		int res = n1 / n2;
		return res;
	}
}