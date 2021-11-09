/**Pinguino.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Pinguino que hereda de la clase combatiente  
*/
import java.util.Date;

abstract class Telefonos extends Device implements Llamadas {
	//Constructor
	public Telefonos(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String Llamar(String num){
		String llamada = "Llamando al numero "+num+" desde mi " +deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return llamada;
	
	}

	
}