package programa;
/**
 * Aquí se implementará el main de nuestra calculadora
 * @author  Marta Aparicio && Daniel Jiménez && Jorge García
 *
 */

public class Calculadora {

	public static void main(String[] args) {
		
		//Variables necesarias para realizar las operaciones
		double num1=3.3;
		double num2=2.4;
		double num3=1.5;
		double base= 2.1;
		double exponente = 3.4;
		int num4=8;
		int num5=4;
		
		
		System.out.println("-------------------------------------CALCULADORA-------------------------------------");
		
		//Posible main para probar los métodos de suma
		
		System.out.println(Suma.Suma2Reales(num1,num2));
		Suma.acumulado(Suma.Suma2Reales(num1,num2));
		System.out.println(Suma.valorAcumuladoSuma);
		
		System.out.println(Suma.Suma2Enteros(num4,num5));
		Suma.acumulado(Suma.Suma2Enteros(num4,num5));
		System.out.println(Suma.valorAcumuladoSuma);
		
		System.out.println(Suma.Suma3Reales(num1,num2,num3));
		Suma.acumulado(Suma.Suma3Reales(num1,num2,num3));
		System.out.println(Suma.valorAcumuladoSuma);
		
		//Posible main para probar los métodos de resta 
		System.out.println(Resta.Resta2Reales(num1,num2));
		Resta.RestaAcumulada(Resta.Resta2Reales(num1,num2));
		System.out.println(Resta.valorAcumuladoResta);
		
		System.out.println(Resta.Resta2Enteros(num4,num5));
		Resta.RestaAcumulada(Resta.Resta2Enteros(num4,num5));
		System.out.println(Resta.valorAcumuladoResta);
		
		System.out.println(Resta.Resta3Reales(num1,num2,num3));
		Resta.RestaAcumulada(Resta.Resta3Reales(num1,num2,num3));
		System.out.println(Resta.valorAcumuladoResta);
		
		//Posible main para probar los métodos del producto
		System.out.println(Producto.producto2Reales(num1,num2));
		System.out.println(Producto.producto2Enteros(num4, num5));
		System.out.println(Producto.producto3Reales(num1, num2, num3));
		System.out.println(Producto.potencia(base,exponente));
		
		
		//Posible main para probar los métodos del cociente 
		System.out.println(Cociente.divisionDosReales(num1,num2));
		System.out.println(Cociente.divisionDosEnteros(num4,num5));
		System.out.println(Cociente.inverso(num5));
		System.out.println(Cociente.raiz(num5));
		
		System.out.println("FIN DE PROGRAMA");
		
		
	
	}

}
