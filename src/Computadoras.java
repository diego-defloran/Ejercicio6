/**Computadoras.java 
*@author Elena Rodríguez 21774 
*@version 9/11/2021
*Clase abstracta Computadoras que hereda de Device e implementa interfaces Internet, Videos y Videojuegos 
*/
import java.util.Date;

abstract class Computadoras extends Device implements Internet, Videos, Videojuegos {
	//Constructor
	public Computadoras(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String NavegarInternet(String url){
		/** 
		*Método NavegarInternet
		*@param url String
		*@return navegar String con las indicaciones
		*/
		String navegar = "Navegando en internet viendo la pagina "+url+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return navegar;
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
	
	public String EjecutarVideojuegos(String juego){
		/** 
		*Método EjecutarVideojuegos
		*@param juego String 
		*@return ej String con las indicaciones
		*/
		String ej = "Ejecutando el videojuego "+juego+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return ej;
	}

	
}
