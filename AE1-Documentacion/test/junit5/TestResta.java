package junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import programa.Resta;

/**
 * @author Jorge Garc�a Regueiro
 * @version 1.0
 * Clase que realiza las pruebas de los m�todos de la clase Resta.
 */
class TestResta {

	@BeforeAll
	public static void empezarPruebas() {
		System.out.println("Empiezan las pruebas de los m�todos de la clase Resta");
		System.out.println("");
		System.out.println("---Si no se verifica un m�todo es que ha saltado una excepci�n en ese m�todo---");
		System.out.println("");
	}
	
	/**
	 * M�todo para probar que la resta de dos n�meros reales se hace correctamente.
	 */
	@Test
	public void pruebaResta2Reales(){
		double num1=4.5;
		double num2=2.5;
		double valorEsperado=2;
		double valorObtenido=Resta.Resta2Reales(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo Resta2Reales");
	}
	
	/**
	 * M�todo para probar que la resta de dos n�meros enteros se hace correctamente.
	 */
	@Test
	public void pruebaResta2Enteros(){
		int num1=3;
		int num2=2;
		int valorEsperado=1;
		int valorObtenido=Resta.Resta2Enteros(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo Resta2Enteros");
	}
	
	/**
	 * M�todo para probar que la resta de tres n�meros reales se hace correctamente.
	 */
	@Test
	public void pruebaResta3Reales(){
		double num1=4.5;
		double num2=3.5;
		double num3=0.5;
		double valorEsperado=0.5;
		double valorObtenido=Resta.Resta3Reales(num1,num2,num3);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo Resta3Reales");
	}
	
	/**
	 * M�todo para probar que los valores enviados se acumulan correctamente.
	 */
	@Test
	public void pruebaAcumulado(){
		double num=2.0;
		double valorEsperado=-6.0;
		Resta.RestaAcumulada(num);
		Resta.RestaAcumulada(num);
		Resta.RestaAcumulada(num);
		assertEquals(Resta.valorAcumuladoResta,valorEsperado,0);
		System.out.println("Pruebas finalizadas del m�todo RestaAcumulada");
	}
	
	/**
	 * M�todo que imprime por pantalla que las pruebas se han finalizado.
	 */
	@AfterAll
	public static void pruebasFinalizadas(){
		System.out.println("Pruebas Finalizadas");
		
	}
	

}
