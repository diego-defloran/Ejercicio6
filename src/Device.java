/**Combatiente.java 
*@author Elena Rodríguez 21774 
*@version 18/10/2021
*Clase Combatiente funciona como clase madre   
*/
import java.util.Date;
import java.util.ArrayList;
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
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Date getProductionDate() {
		return productionDate;
	}
	
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	
	public String getMarkerAR() {
		return markerAR;
	}
	
	public void setMarkerAR(String markerAR) {
		this.markerAR = markerAR;
	}
	
	
	public String getDeviceType() {
		return deviceType;
	}
	
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	
	public abstract String getCaracteristicas();
	public abstract int getnumCaracteristicas();
	
	public String toString(){
		String info = "\nEste es un "+deviceType+" "+manufacturer+" con numero de serie "+serialNumber+" la fecha de fabricacion es "+productionDate+" y tiene un precio de "+price+".\n";
		return info;
	}
}
	