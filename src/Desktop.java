/**Desktop.java 
*@author Elena Rodríguez 21774 
*@version 9/11/2021
*Clase CDesktop que hereda de Computadoras
*/
import java.util.Date;

class Desktop extends Computadoras {
	//Constructor
	public Desktop(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
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
			probando = NavegarInternet(info);
		} else if(numFuncionalidad==2){
			probando = ReproducirVideos(info);
		} else if(numFuncionalidad==3){
			probando = EjecutarVideojuegos(info);
		} 
		return probando;
	}

	
	public String getCaracteristicas(){
		/** 
		*Método getCaracteristicas String
		*@return caracteristicas String con las funcionalidades que puede probar el usuario
		*/
		String caracteristicas = "\n1. Tomar fotografia\n"+"2. Ver video\n"+"3. Ejecutar Videojuego\n";
		return caracteristicas;
	}
	
	public int getnumCaracteristicas(){
		/** 
		*Método getnumCaracteristicas int
		*@return num int con el numero de funcionalidades que puede probar el usuario
		*/
		int num = 3;
		return num;
	}
	
}
