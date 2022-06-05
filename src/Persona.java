/**
*	Implementacion de Persona
*	@implements IPersona
*	@version 1.1
*	@author JMB (1.1 by stf)
*/
import java . util .*;
public class Persona implements IPersona {
	// Atributo nombre de la instancia
	protected String nomb;
	// Atributo fecha de nacimiento de la instancia
	protected Date fechaN;
	// Atributo pais de nacimiento de la instancia
	protected String lugar;
	// Atributo numero de identidad de la instancia
	protected int nI;
	
	/**
	* Es el constructor de la clase Persona
	*	@param nomb - Nombre de la instancia a crear
	*	@param fechaN - Fecha de nacimiento de la instancia a crear
	*	@param lugar - Pais de nacimiento de la instancia a crear
	*	@param nI - Numero de identidad de la instancia a crear
	*/
	public Persona(String nomb , Date fechaN , String lugar , int nI) {
		this.nomb = nomb;
		this.fechaN = fechaN;
		this.lugar = lugar;
		this.nI = nI;
	}
	
	/**
	* Se encarga de describir todos los atributos de la instancia y devolverlo en un String
	*	@return Un String que describe todos los atributos de la instancia
	*/
	public String toString() {
		return "Nombre: " + nomb + ", fecha de nacimiento: " + fechaN + ", lugar de origen: " + lugar
		+ " y numero de Identidad: " + nI; 
	}
	
	/**
	* Devuelve el nombre de la instancia
	* @return Un String, que es el nombre de la instancia
	*/
	public String getNombre() {
		return nomb;
	}
	
	/**
	* Devuelve la fecha de nacimiento de la instancia
	* @return Un Date, que es la fecha de nacimiento de la instancia
	*/
	public Date getFechaNacimiento() {
		return fechaN;
	}
	
	/**
	* Devuelve el pais de nacimiento de la instancia
	* @return Un String, que es el pais de nacimiento de la instancia
	*/
	public String getPais() {
		return lugar;
	}
	
	/**
	* Devuelve el numero de identidad de la instancia
	* @return Un int, que es el numero de identidad de la instancia
	*/
	public int getDNI() {
		return nI;
	}
	
	/**
	* Calcula la edad en years de la instancia y la devuelve
	*	@return la edad en years de la instancia
	*/
	public int ownYears() {
		Date actualTime = new Date();
		int actualYear = actualTime.getYear();
		int fechaNYear = fechaN.getYear();
		return actualYear - fechaNYear;
	}
	
}