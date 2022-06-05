/**
*	Implementacion del Vacunodromo
*	@extends BondedQueue<Afiliada>
*	@since 3/5/2021 > 23/4/2022
*	@version 1.2
*	@author JMB (1.2 by stf)
*/
import tads .*;
public class Vacunodromo extends BoundedQueue<Afiliada> {
	// Atributo nombre de la instancia
	private String nombre;
	// Atributo nombre de vacuna de la instancia
	private String laVacuna;
	
	/**
	* Es el constructor de la clase Vacunodromo
	*	@param nombre - Nombre de la instancia a crear
	*	@param laVacuna - Nombre de vacuna de la instancia a crear
	*	@param nI - Numero de plazas de la instancia a crear
	*/
	public Vacunodromo(String nombre , String laVacuna , int plazas) {
		super(plazas);
		this.nombre = nombre;
		this.laVacuna = laVacuna;
	}
	
	/**
	* Se encarga de describir todos los atributos de la instancia y devolverlo en un String
	*	@return Un String que describe todos los atributos de la instancia
	*/
	public String toString() {
		return " Este CV es " + nombre + " y su vacuna es " + laVacuna + ". Su lista de pacientes es: " + super.toString();
	}
	
	/**
	* Devuelve el nombre de la instancia
	* @return Un String, que es el nombre de la instancia
	*/
	public String getNombre() {
		return nombre;
	}
	
	/**
	* Devuelve el nombre la vacuna de la instancia
	* @return Un String, que es el nombre de la vacuna de la instancia
	*/
	public String getVacuna() {
		return laVacuna;
	}
	
}