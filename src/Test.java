import java.util.*;
import tads.*;

//Clase Vacunodromo, Persona, Afiliada funciona genial

public class Test {
	public static void main (String[] args){
		// tener en cuentas las posibilidades de IPersona con Persona y Afiliada en todo GestorCitas
		
		// Niños --> Persona(Persona),(IPersona), Afiliada(Afiliada,Persona,IPersona)
		// No afiliados --> Persona(Persona),(IPersona) 
		
		GestorCitas gcitas = new GestorCitas();
		
		Date fecha0001 = new Date();
		fecha0001.setYear(115);
		Afiliada sujeto12 = new Afiliada("N1A", fecha0001, "Italia", 333, 56, true);
		
		Date fecha001 = new Date();
		fecha001.setYear(115);
		Persona sujeto13 = new Persona("N2P", fecha001, "Italia", 333);
		
		Date fecha01 = new Date();
		fecha01.setYear(115);
		IPersona sujeto14 = new Persona("N2IP", fecha01, "Italia", 333);
		
		Date fecha021 = new Date();
		fecha021.setYear(115);
		IPersona sujeto15 = new Afiliada("N1IP", fecha021, "Italia", 333, 57, true);
		
		Date fecha031 = new Date();
		fecha031.setYear(115);
		Persona sujeto16 = new Afiliada("N1P", fecha031, "Italia", 333, 58, true);
		
		// Para ver un anyo bonito poner en el setYear el anyo-1900, si practic0(vacunas) poner anyo tal cual
		Date fecha = new Date();
		fecha.setYear(80);
		Afiliada sujeto1 = new Afiliada("Maria", fecha, "Italia", 333, 23, false);
		
		Date fecha4 = new Date();
		fecha4.setYear(80);
		Afiliada sujeto4 = new Afiliada("Ivan", fecha4, "Italia", 333, 23, false);
		
		Date fecha5 = new Date();
		fecha5.setYear(80);
		Afiliada sujeto5 = new Afiliada("Sebas", fecha5, "Italia", 333, 23, true);
		sujeto5.anotarDosis();
		sujeto5.anotarDosis();
		
		Date fecha2 = new Date();
		fecha2.setYear(80);
		Afiliada sujeto2 = new Afiliada("Jhosua", fecha2, "Suiza", 334, 24, true);
		
		Date fecha3 = new Date();
		fecha3.setYear(80);
		Afiliada sujeto3 = new Afiliada("Marta", fecha3, "India", 335, 25, true);
		
		Date fecha66 = new Date();
		fecha66.setYear(80);
		Afiliada sujeto66 = new Afiliada("Oman", fecha66, "India", 335, 25, true);

		gcitas.add(sujeto1);
		gcitas.add(sujeto2);
		gcitas.add(sujeto3);
		gcitas.add(sujeto5);
		gcitas.add(sujeto4);
		gcitas.add(sujeto16);
		gcitas.add(sujeto14);
		gcitas.add(sujeto12);
		gcitas.add(sujeto13);
		gcitas.add(sujeto15);
		gcitas.add(sujeto66);
		System.out.println(gcitas.comprobarFilaGeneral());
		System.out.println("------------------");
		gcitas.asignarCitas();
		System.out.println(gcitas.comprobarCV());
		System.out.println("------------------");
		System.out.println(gcitas.comprobarInfantes());
		System.out.println("------------------");
		System.out.println(gcitas.comprobarRenuentes());
		System.out.println("------------------");
		gcitas.vacunar();
	
	}
}