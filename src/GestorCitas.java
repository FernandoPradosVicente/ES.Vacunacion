/**
*	Implementacion del GestorCitas
*	@extends LinkedQueue<IPersona>
*	@since 3/5/2021 > 23/4/2022
*	@version 2.1
*	@author JMB (2.1 by stf)
*/
import tads .*;
import java.util.*;
public class GestorCitas extends LinkedQueue<IPersona> {
	// Atributo array de vacunodromos de la instancia
	private Vacunodromo[] arrayCV;
	// Atributo pila de renuentes de la instancia
	private LinkedStack<Afiliada> renuentes;			
	// Atributo lista de infantes de la instancia
	private BoundedList<IPersona> infantes;
	
	/**
	* Es el constructor de la clase GestorCitas
	*/
	public GestorCitas() {
	super();
	arrayCV = new Vacunodromo[5];
		arrayCV[0] = new Vacunodromo("12 de Octubre", "Sputnik", 4);
		arrayCV[1] = new Vacunodromo("Wanda", "AstraZeneka", 3);
		arrayCV[2] = new Vacunodromo("Wizink", "Janssen", 5);
		arrayCV[3] = new Vacunodromo("Zendal", "Pfizer", 4);
		arrayCV[4] = new Vacunodromo("La Paz", "Moderna", 2);
	renuentes = new LinkedStack<Afiliada>();
	infantes = new BoundedList<IPersona>();
	}
	
	/**
	* Devuelve un informe de todas las instancias dentro de la fila general de la instancia
	* @return Un String, que es un informe de todas las instancias dentro de la fila general de la instancia
	*/
	public String comprobarFilaGeneral() {
		return toString();
	}
	
	/**
	* Devuelve un informe de todas las instancias dentro de renuentes de la instancia
	* @return Un String, que es un informe de todas las instancias dentro de la renuentes de la instancia
	*/
	public String comprobarRenuentes() {
		return renuentes.toString(); 
	}
	
	/**
	* Devuelve un informe de todas las instancias dentro de infantes de la instancia
	* @return Un String, que es un informe de todas las instancias dentro de la infantes de la instancia
	*/
	public String comprobarInfantes() {
		return infantes.toString(); 
	}

	/**
	* Devuelve un informe de todas las instancias dentro de todos los vacunodromos de arrayCV de la instancia
	* @return Un String, que es un informe de todas las instancias dentro de todos los vacunodromos de arrayCV de la instancia
	*/
	public String comprobarCV() {
		return Arrays.toString(arrayCV);
	}
	
	/**
	* Se encarga de vaciar las listas de los vacunodromos, vacunar a los pacientes y
	* si es necesario introducirlos en la lista general
	*/
	public void vacunar() {
		for (int i = 0; i < arrayCV.length; i++) {
			while(!arrayCV[i].isEmpty()) {
				Afiliada paciente = arrayCV[i].peek();
				arrayCV[i].poll();
				paciente.setVacuna(arrayCV[i].getVacuna());
				paciente.anotarDosis();
				if(paciente.getDosis() == 1)
					add(paciente);			
			}
		}
	}
	
	/**
	*	Se encarga de recorrer toda la ListaGeneral y filtrar personas segun sus atributos para 
	*	enviarlas a otras listas, asignarles un vacunodromo o volver a meter en la ListaGeneral
	*/
	public void asignarCitas() {
		IPersona firstReingresoLista = null;
		if (!isEmpty()) {
			IPersona citada = peek();
			while (!(isEmpty()) && !(citada.equals(firstReingresoLista))) {
				poll();
				Persona personaCitada = (Persona)citada;
				int edad = personaCitada.ownYears();
				if (edad < 10) {
					if(infantes.size() == 0) {
						infantes.add(0,null);
						infantes.add(1,personaCitada);
						infantes.remove(0);
					}
					else
						infantes.add(infantes.size(),personaCitada);
				}
				// Evalua personas citadas que estan afiliadas y no son niños
				else if (personaCitada instanceof Afiliada) {
					Afiliada afiliadaCitada = (Afiliada) citada;
					if (afiliadaCitada.getDosis() == 2) {
					}
					else if (!(afiliadaCitada.getAceptacion())) {
						renuentes.push(afiliadaCitada);
					}
					else {
						int i = getCVPosicion(edad);
						if (!arrayCV[i].isFull()) {
							arrayCV[i].add(afiliadaCitada);
						}
						else {
							add(afiliadaCitada);
							if (firstReingresoLista == null)
								firstReingresoLista = afiliadaCitada;
						}
					}
				}
			if (!isEmpty())
				citada = peek();
			}
		}
	}
	
	/**
	* Es un metodo auxiliar que devuelve la posicion de un vacunodromo en funcion de la edad introducida
	*	@param edad - edad de una persona a la que se quiere asociar con un vacunodromo
	*	@return valor entero entre -1 y 4, representando una posicion de arrayCV
	*/
	public static int getCVPosicion(int edad) {
		if (edad >= 80) {
			return 0;
		}
		else if (edad >= 70) {
			return 1;
		}	
		else if (edad >= 60) {
			return 2;
		}
		else if (edad >= 50) {
			return 3;
		}
		else if (edad >= 11) {
			return 4;
		}
		else
			return -1;
	}



	
}