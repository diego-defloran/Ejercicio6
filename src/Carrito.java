import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.csvreader.CsvWriter;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Carrito {
	private String nombreCliente;
	private String NIT;
	private DateTimeFormatter dtf; // = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	// dtf.format(LocalDateTime.now());
	private double total;
	private String tipoFactura;
	private int numFactura;
	Random ran1;
	
	public void IntroducirProductos() {
		
		
	}
	
	public static void ExportarCSV(List<Device> devices) {
		String salidaArchivo = "Devices.csv";
		boolean existe = new File(salidaArchivo).exists();
		
		//si existe un archivo lo elimina
		if(existe) {
			File archivoDevices = new File(salidaArchivo);
			archivoDevices.delete();
		}
		
		try {
			//Crear el archivo
			CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
			
			//Datos para identificar columanas
			salidaCSV.write("Precio");
			salidaCSV.write("Marca");
			salidaCSV.write("Fecha");
			salidaCSV.write("Serie");
			salidaCSV.write("MarcadorAR");
			salidaCSV.write("Tipo");
			salidaCSV.write("Tienda");
			
			salidaCSV.endRecord();//Interumpe la escritura
			
			//Recorre la lista y lo inserta
			
			for (Device dev : devices) {
				Device device = null;
				salidaCSV.write(device.getPrice());
				
			}

		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
}
