/**
 * Aqu� se implementar� el main de nuestra calculadora
 * @author  Marta Aparicio && Daniel Jim�nez && Jorge Garc�a
 *
 */

public class Calculadora {

	public static void main(String[] args) {
		
		//Variables necesarias para realizar las operaciones
		double num1=3;
		double num2=2;
		double num3=1;
		int num4=4;
		int num5=8;
		
		//Posible main para probar los m�todos de resta 
		System.out.println(Resta.Resta2Reales(num1,num2));
		Resta.RestaAcumulada(Resta.Resta2Reales(num1,num2));
		System.out.println(Resta.valorAcumuladoResta);
		
		System.out.println(Resta.Resta2Enteros(num4,num5));
		Resta.RestaAcumulada(Resta.Resta2Enteros(num4,num5));
		System.out.println(Resta.valorAcumuladoResta);
		
		System.out.println(Resta.Resta3Reales(num1,num2,num3));
		Resta.RestaAcumulada(Resta.Resta3Reales(num1,num2,num3));
		System.out.println(Resta.valorAcumuladoResta);
	
	}

}
