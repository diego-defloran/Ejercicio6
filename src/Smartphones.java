/**Pinguino.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Pinguino que hereda de la clase combatiente  
*/
import java.util.Date;

class Smartphones extends Telefonos implements Fotografias, Internet, Videos, Portatiles {
	//Constructor
	public Smartphones(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String Probar(int numFuncionalidad, String info){
		String probando ="";
		if(numFuncionalidad==1){
			probando = Llamar(info);
		} else if(numFuncionalidad==2){
			probando = TomarFotografias(info);
		} else if(numFuncionalidad==3){
			probando = NavegarInternet(info);
		} else if(numFuncionalidad==4){
			probando = ReproducirVideos(info);
		} 
		return probando;
	}
	public String TomarFotografias(String foto){
		String Tomarfoto = "Tomando la fotografia "+foto+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return Tomarfoto;
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
		String caracteristicas = "\n1. Hacer llamadas\n"+"2. Tomar fotografia\n"+"3. Navegar por internet\n"+"4. Ver videos\n";
		return caracteristicas;
	}
	
	public int getnumCaracteristicas(){
		int num = 4;
		return num;
	}
	
}