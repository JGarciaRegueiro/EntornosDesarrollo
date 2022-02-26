package junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import programa.Suma;

/**
 * @author Jorge Garc�a Regueiro
 * @version 1.0
 * Clase que realiza las pruebas de los m�todos de la clase Suma.
 */
class TestSuma {

	@BeforeAll
	public static void empezarPruebas() {
		System.out.println("Empiezan las pruebas de los m�todos de la clase Suma");
		System.out.println("");
		System.out.println("---Si no se verifica un m�todo es que ha saltado una excepci�n en ese m�todo---");
		System.out.println("");
	}
	
	/**
	 * M�todo para probar que la suma de dos n�meros reales se hace correctamente.
	 */
	@Test
	public void pruebaSuma2Reales(){
		double num1=2.5;
		double num2=3.5;
		double valorEsperado=6.0;
		double valorObtenido=Suma.Suma2Reales(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo Suma2Reales");
	}
	
	/**
	 * M�todo para probar que la suma de dos n�meros enteros se hace correctamente.
	 */
	@Test
	public void pruebaSuma2Enteros(){
		int num1=2;
		int num2=3;
		int valorEsperado=5;
		int valorObtenido=Suma.Suma2Enteros(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo Suma2Enteros");
	}
	
	/**
	 * M�todo para probar que la suma de tres n�meros reales se hace correctamente.
	 */
	@Test
	public void pruebaSuma3Reales(){
		double num1=2.5;
		double num2=3.5;
		double num3=4.5;
		double valorEsperado=10.5;
		double valorObtenido=Suma.Suma3Reales(num1,num2,num3);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo Suma3Reales");
	}
	
	/**
	 * M�todo para probar que los valores enviados se acumulan correctamente.
	 */
	@Test
	public void pruebaAcumulado(){
		double num=2.0;
		double valorEsperado=6.0;
		Suma.acumulado(num);
		Suma.acumulado(num);
		Suma.acumulado(num);
		assertEquals(Suma.valorAcumuladoSuma,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo Acumulado");
	}
	
	/**
	 * M�todo que imprime por pantalla que las pruebas se han finalizado.
	 */
	@AfterAll
	public static void pruebasFinalizadas(){
		System.out.println("Pruebas Finalizadas");
		
	}

}
