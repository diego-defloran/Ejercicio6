/**Telefonos.java 
*@author Elena Rodríguez 21774 
*@version 9/11/2021
*Clase abstracta Telefonos que hereda de Device e implementa interfaz Llamadas
*/ 

import java.util.Date;

abstract class Telefonos extends Device implements Llamadas {
	//Constructor
	public Telefonos(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String Llamar(String num){
		/** 
		*Método Llamar
		*@param num String
		*@return llamada String con las indicaciones
		*/
		String llamada = "Llamando al numero "+num+" desde mi " +deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return llamada;
	
	}

	
}
