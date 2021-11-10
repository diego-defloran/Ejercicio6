/**Device.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Device funciona como clase madre   
*/
import java.util.Date;
//Clase madre
abstract class Device{
	//Variables de instancia
	protected String price, manufacturer, serialNumber, markerAR, deviceType;
	protected Date productionDate;

	//Constructor
	public Device(String precio, String marca,Date fecha, String serie, String marcAR, String tipo){
		price = precio;
		manufacturer = marca;
		productionDate = fecha;
		serialNumber = serie;
		markerAR = marcAR;
		deviceType = tipo;
	}
	
	public String getPrice() {
		//Getter para el precio 
		return price;
	}
	
	public void setPrice(String price) {
		//Setter para el preco
		this.price = price;
	}
	
	public Date getProductionDate() {
		//Getter fecha
		return productionDate;
	}
	
	public void setProductionDate(Date productionDate) {
		//Setter fecha
		this.productionDate = productionDate;
	}
	
	public String getMarkerAR() {
		//Getter Marcador AR
		return markerAR;
	}
	
	public void setMarkerAR(String markerAR) {
		//setter Marcador AR
		this.markerAR = markerAR;
	}
	
	
	public String getDeviceType() {
		//getter tipo de aparato
		return deviceType;
	}
	
	public void setDeviceType(String deviceType) {
		//setter tipo de aparato
		this.deviceType = deviceType;
	}
	public void setSerialNumber(String serialNumber) {
		//setter numero de serie
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		//getter del numero de serie
		return this.serialNumber;
	}
	
	public void setManufacturer(String manufacturer) {
		//setter marca
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		//getter marca
		return this.manufacturer;
	}
	
	//Método abstracto getCaracteristicas, retorna un String con las funcionalidades
	public abstract String getCaracteristicas();
	
	//Método abstracto getnumCaracterísticas, retorna un int con el número de funcionalidades
	public abstract int getnumCaracteristicas();
	
	//Método abstracto Probar, retorna un String con las instrucciones según la funcionalidad elegida por el usuario
	public abstract String Probar(int num, String info);
	
	public String toString(){
		//Método toString que retorna un String con toda la información del aparato
		String info = "\nEste es un "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber+" la fecha de fabricacion es "+productionDate+" y tiene un precio de "+price+".\n";
		return info;
	}
}
	
