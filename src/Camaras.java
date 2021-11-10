/**Camaras.java 
*@author Elena Rodríguez 21774 
*@version 9/11/2021
*Clase Camaras que hereda de Device e implementa interfaces Fotografías, Videos y Portátiles  
*/
import java.util.Date;

class Camaras extends Device implements Fotografias, Videos, Portatiles {
	
	//Constructor
	public Camaras(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
		this.deviceType = "Camara";
		this.serialNumber = "C48000";
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
			probando = TomarFotografias(info);
		} else if(numFuncionalidad==2){
			probando = ReproducirVideos(info);
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
	
	
	public String ReproducirVideos(String video){
		/** 
		*Método ReproducirVideos
		*@param video String 
		*@return ver String con las indicaciones
		*/
		String ver = "Viendo el video "+video+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return ver;
	}
	
	
	public String getCaracteristicas(){
		/** 
		*Método getCaracteristicas String
		*@return caracteristicas String con las funcionalidades que puede probar el usuario
		*/
		String caracteristicas = "\n1. Tomar fotografia\n"+"2. Ver video\n";
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
