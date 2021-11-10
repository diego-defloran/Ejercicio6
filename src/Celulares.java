/**Celulares.java 
*@author Elena Rodríguez 21774 
*@version 9/11/2021
*Clase Celulares que hereda de Telefonos e implementa interfaz Portátiles  
*/
import java.util.Date;

class Celulares extends Telefonos implements Portatiles {
	//Constructor
	public Celulares(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
		this.deviceType = "Celular";
		this.serialNumber = "M46000";
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
		} 
		return probando;
	}
	
	public String getCaracteristicas(){
		/** 
		*Método getCaracteristicas String
		*@return caracteristicas String con las funcionalidades que puede probar el usuario
		*/
		String caracteristicas = "\n1. Hacer llamadas\n";
		return caracteristicas;
	}
	
	public int getnumCaracteristicas(){
		/** 
		*Método getnumCaracteristicas int
		*@return num int con el numero de funcionalidades que puede probar el usuario
		*/
		int num = 1;
		return num;
	}
	
}
