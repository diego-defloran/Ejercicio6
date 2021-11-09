/**Pinguino.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Pinguino que hereda de la clase combatiente  
*/
import java.util.Date;

class Fijos extends Telefonos {
	//Constructor
	public Fijos(String precio, String marca, Date fecha, String serie, String marcAR, String tipo){
		super(precio, marca, fecha, serie, marcAR, tipo);
	}
	
	public String Probar(int numFuncionalidad, String info){
		String probando ="";
		if(numFuncionalidad==1){
			probando = Llamar(info);
		} 
		return probando;
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