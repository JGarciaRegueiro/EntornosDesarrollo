package junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import programa.Resta;

/**
 * @author Jorge García Regueiro
 * @version 1.0
 * Clase que realiza las pruebas de los métodos de la clase Resta.
 */
class TestResta {

	@BeforeAll
	public static void empezarPruebas() {
		System.out.println("Empiezan las pruebas de los métodos de la clase Resta");
		System.out.println("");
		System.out.println("---Si no se verifica un método es que ha saltado una excepción en ese método---");
		System.out.println("");
	}
	
	/**
	 * Método para probar que la resta de dos números reales se hace correctamente.
	 */
	@Test
	public void pruebaResta2Reales(){
		double num1=4.5;
		double num2=2.5;
		double valorEsperado=2;
		double valorObtenido=Resta.Resta2Reales(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del método Resta2Reales");
	}
	
	/**
	 * Método para probar que la resta de dos números enteros se hace correctamente.
	 */
	@Test
	public void pruebaResta2Enteros(){
		int num1=3;
		int num2=2;
		int valorEsperado=1;
		int valorObtenido=Resta.Resta2Enteros(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del método Resta2Enteros");
	}
	
	/**
	 * Método para probar que la resta de tres números reales se hace correctamente.
	 */
	@Test
	public void pruebaResta3Reales(){
		double num1=4.5;
		double num2=3.5;
		double num3=0.5;
		double valorEsperado=0.5;
		double valorObtenido=Resta.Resta3Reales(num1,num2,num3);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del método Resta3Reales");
	}
	
	/**
	 * Método para probar que los valores enviados se acumulan correctamente.
	 */
	@Test
	public void pruebaAcumulado(){
		double num=2.0;
		double valorEsperado=-6.0;
		Resta.RestaAcumulada(num);
		Resta.RestaAcumulada(num);
		Resta.RestaAcumulada(num);
		assertEquals(Resta.valorAcumuladoResta,valorEsperado,0);
		System.out.println("Pruebas finalizadas del método RestaAcumulada");
	}
	
	/**
	 * Método que imprime por pantalla que las pruebas se han finalizado.
	 */
	@AfterAll
	public static void pruebasFinalizadas(){
		System.out.println("Pruebas Finalizadas");
		
	}
	

}
