/**Pinguino.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Pinguino que hereda de la clase combatiente  
*/
import java.util.Date;

class Smartwatch extends Telefonos implements Fotografias, Portatiles {
	//Constructor
	public Smartwatch(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String Probar(int numFuncionalidad, String info){
		String probando ="";
		if(numFuncionalidad==1){
			probando = Llamar(info);
		} else if(numFuncionalidad==2){
			probando = TomarFotografias(info);
		} 
		return probando;
	}
	public String TomarFotografias(String foto){
		String Tomarfoto = "Tomando la fotografia "+foto+" desde mi "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber;
		return Tomarfoto;
	}
	
	
	
	public String getCaracteristicas(){
		String caracteristicas = "\n1. Hacer llamadas\n"+"2. Tomar fotografia\n";
		return caracteristicas;
	}
	
	public int getnumCaracteristicas(){
		int num = 2;
		return num;
	}
	
}