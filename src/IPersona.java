/* *
* Especificacion del TAD Persona
* @since 2/5/2021
* @version 1.1
* @author JMB , (1.1 by stf )
*/
import java . util .*;
public interface IPersona {
	
	/* *
	* POST : resultado es el nombre del objeto .
	*/
	public String getNombre();
	
	/* *
	* POST : resultado es la fecha de nacimiento del objeto .
	*/
	public Date getFechaNacimiento();
	
	/* *
	* POST : resultado es el pais del objeto .
	*/
	public String getPais();
	
	/* *
	* POST : resultado es el numero de identificacion del objeto .
	*/
	public int getDNI();
	
}