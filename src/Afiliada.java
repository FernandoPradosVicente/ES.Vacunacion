/**
*	Implementacion de Afiliada
*	@extends Persosa
*	@since 2/5/2021 > 24/4/2022
*	@version 1.1
*	@author JMB (1.1 by stf)
*/
import java . util .*;
public class Afiliada extends Persona {
	// Atributo numero de la SS de la instancia
	private int numSS;
	// Atributo acepta vacunarse la instancia
	private boolean acepta;
	// Atributo nombre de la ultima vacuna inyectada de la instancia
	private String vacuna;
	// Atributo cantidad de dosis inyectadas de la instancia
	private int dosis;
	
	/**
	* Es el constructor de la clase Afiliada
	*	@param nomb - Nombre de la instancia a crear
	*	@param fechaN - Fecha de nacimiento de la instancia a crear
	*	@param lugar - Pais de nacimiento de la instancia a crear
	*	@param nI - Numero de identidad de la instancia a crear
	*	@param numSS - Numero de la SS de la instancia a crear
	*	@param acepta - Si acepta vacunarse la instancia a crear
	*/
	public Afiliada(String nomb , Date fechaN , String lugar , int nI , int numSS , boolean acepta) {
		super(nomb, fechaN, lugar, nI);
		this.numSS = numSS;
		this.acepta = acepta;
		this.vacuna = new String();
		this.dosis = 0;
	}
	
	/**
	* Se encarga de describir todos los atributos de la instancia y devolverlo en un String
	*	@return Un String que describe todos los atributos de la instancia
	*/
	public String toString() {
		return "Nombre: " + nomb + ", fecha de nacimiento: " + fechaN + ", lugar de origen: "
		+ lugar + ", numero de Identidad: " + nI + ", numero de SS: " + numSS + ", acepta vacuna: " + acepta
		+ ", ultima vacuna: " + vacuna + " y numero de dosis: " + dosis;
	}
	
	/**
	* Devuelve el numero de la SS de la instancia
	*	@return Un int, que es el numero de la SS de la instancia
	*/
	public int getNSS() {
		return numSS;
	}
	
	/**
	* Devuelve si la instancia acepta vacunarse
	*	@return Un boolean, true si la instancia decide vacunarse
	*/
	public boolean getAceptacion() {
		return acepta;
	}
	
	/**
	* Devuelve el nombre la ultima vacuna de la instancia
	*	@return Un String, que es el nombre de la ultima vacuna de la instancia
	*/
	public String getUltimaVacuna() {
		return vacuna;
	}
	
	/**
	* Cambia o añade el nombre al nuevo nombre de la vacuna inyectada
	*	@param nueva - Nombre de la nueva vacuna
	*/
	public void setVacuna(String nueva) {
		vacuna = nueva;
	}
	
	/**
	* Devuelve la cantidad de dosis inyectadas a la instancia
	*	@return Un int, que es la cantidad de dosis inyectadas a la instancia
	*/
	public int getDosis() {
		return dosis;
	}
	
	/**
	* Suma una dosis mas a la cantidad de dosis que ya tenia la instancia
	*/
	public void anotarDosis() {
		dosis++;
	}
}