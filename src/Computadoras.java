/**Pinguino.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Pinguino que hereda de la clase combatiente  
*/
import java.util.Date;

abstract class Computadoras extends Device implements Internet, Videos, Videojuegos {
	//Constructor
	public Computadoras(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String NavegarInternet(String url){
		String navegar = "Navegando en internet viendo la pagina "+url+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return navegar;
	}

	public String ReproducirVideos(String video){
		String ver = "Viendo el video "+video+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return ver;
	}
	
	public String EjecutarVideojuegos(String juego){
		String ej = "Ejecutando el videojuego "+juego+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return ej;
	}

	
}