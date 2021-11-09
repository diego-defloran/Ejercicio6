/**Pinguino.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Pinguino que hereda de la clase combatiente  
*/
import java.util.Date;

class SmartTV extends Device implements Internet, Videos {
	//Constructor
	public SmartTV(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String Probar(int numFuncionalidad, String info){
		String probando ="";
		if(numFuncionalidad==1){
			probando = NavegarInternet(info);
		} else if(numFuncionalidad==2){
			probando = ReproducirVideos(info);
		} 
		return probando;
	}
	
	public String NavegarInternet(String url){
		String navegar = "Navegando en internet viendo la pagina "+url+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return navegar;
	}
	
	public String ReproducirVideos(String video){
		String ver = "Viendo el video "+video+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return ver;
	}
	
	
	public String getCaracteristicas(){
		String caracteristicas = "\n1. Navegar en internet\n"+"2. Ver video\n";
		return caracteristicas;
	}
	
	public int getnumCaracteristicas(){
		int num = 2;
		return num;
	}
	
}