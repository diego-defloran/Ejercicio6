/**Pinguino.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Pinguino que hereda de la clase combatiente  
*/
import java.util.Date;

class Desktop extends Computadoras {
	//Constructor
	public Desktop(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String Probar(int numFuncionalidad, String info){
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
		String caracteristicas = "\n1. Tomar fotografia\n"+"2. Ver video\n"+"3. Ejecutar Videojuego\n";
		return caracteristicas;
	}
	
	public int getnumCaracteristicas(){
		int num = 3;
		return num;
	}
	
}