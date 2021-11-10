/**Smartwatch.java 
*@author Elena Rodríguez 21774 
*@version 9/11/2021
*Clase Smartwatch que hereda de Telefonos e implementa interfaces Fotografías y Portátiles  
*/

import java.util.Date;

class Smartwatch extends Telefonos implements Fotografias, Portatiles {
	//Constructor
	public Smartwatch(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
		this.deviceType = "Smartwatch";
		this.serialNumber = "A47000";
	}
	
	public String Probar(int numFuncionalidad, String info){
		/** 
		*Método Probar String Selecciona el String con las indicaciones según la opción del usuario
		*@param numFuncionalidad int numero de la funcionalidad que desea probar el usuario
		*@para info String con información extra para probar la característica
		*@return probando String con las instrucciones
		*/
		String probando ="";
		if(numFuncionalidad==1){
			probando = Llamar(info);
		} else if(numFuncionalidad==2){
			probando = TomarFotografias(info);
		} 
		return probando;
	}
	
	public String TomarFotografias(String foto){
		/** 
		*Método TomarFotografias 
		*@param foto String 
		*@return Tomarfoto String con las indicaciones
		*/
		String Tomarfoto = "Tomando la fotografia "+foto+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return Tomarfoto;
	}
	
	
	
	public String getCaracteristicas(){
		/** 
		*Método getCaracteristicas String
		*@return caracteristicas String con las funcionalidades que puede probar el usuario
		*/
		String caracteristicas = "\n1. Hacer llamadas\n"+"2. Tomar fotografia\n";
		return caracteristicas;
	}
	
	public int getnumCaracteristicas(){
		/** 
		*Método getnumCaracteristicas int
		*@return num int con el numero de funcionalidades que puede probar el usuario
		*/
		int num = 2;
		return num;
	}
	
}
