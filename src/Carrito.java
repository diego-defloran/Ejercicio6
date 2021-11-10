import com.opencsv.*;
import java.io.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Carrito {
	FileReader archCSV = null;
    CSVReader csvReader = null;
    int opcion;
    boolean continua;
    String tipo;
    int precio;
    String marca;
    String nombre;
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    ArrayList<String> tipos = new ArrayList<> ();
    ArrayList<Integer> precios = new ArrayList<> ();
    ArrayList<String> marcas = new ArrayList<> ();
  public void Mostrar() {
    try {
      //Leo el archivo con el separador estándar ","
      // archCSV = new FileReader("data/ISO-Codes.csv");
      // csvReader = new CSVReader(archCSV);
      // String[] fila = null;
      // while((fila = csvReader.readNext()) != null) {
      //     System.out.println(fila[0]
      //               + " | " + fila[1]
      //               + " |  " + fila[2]);
      // }

      //Ahora leo el archivo con el separador ";"
      archCSV = new FileReader("data/Productos.csv");
      CSVParser conComa = new CSVParserBuilder().withSeparator(',').build();
      csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conComa).build();
      String[] fila = null;
      while((fila = csvReader.readNext()) != null) {
          System.out.println(fila[0]
                    + " | " + fila[1]
                    + " |  " + fila[2]
          			+ " |  " + fila[3]
					+ " |  " + fila[4]
					+ " |  " + fila[5]
					+ " |  " + fila[6]);
      }

    }
    catch(IOException e) {
      System.out.println(e);
    }
    catch(Exception e) {
      System.out.println(e);
    }
    finally {
      try { 
        archCSV.close();
        csvReader.close();
      }
      catch(IOException e) {
        System.out.println(e);
      }
    }
  }
  
  public void Ingresar() {
	  Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenido a Electronica Latinoamericana!\n Que desea ingresar a carrito?");
		System.out.println("1. SmartPhone\n2. Telefonos celulares\n3. Telefonos fijos\n4. Camaras fotograficas\n5. Desktop\n6. Laptop\n7. Smart TV\n8. Tablets\n9. Smartwatch\n10. Salir");
		do {
			try {
				continua = false;
				opcion = scan.nextInt();
				
				if(opcion == 1) {
					this.tipo = "Smartphone";
					this.marca = "Samsung";
					this.precio = 7000;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
					
				}
				else if (opcion == 2) {
					this.tipo = "Celular";
					this.marca = "Xiomi";
					this.precio = 5000;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);	
					Ingresar();
					
				}
				
				else if (opcion == 3) {
					this.tipo = "Celular fijo";
					this.marca = "AT&T";
					this.precio = 4000;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
				}
				
				else if(opcion == 4) {
					this.tipo = "Camara";
					this.marca = "Canon";
					this.precio = 9500;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
				}
				
				else if(opcion == 5) {
					this.tipo = "Desktop";
					this.marca = "DELL";
					this.precio = 8500;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
				}
				
				else if(opcion ==6) {
					this.tipo = "Laptop";
					this.marca = "HP";
					this.precio = 7000;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
				}
				
				else if(opcion ==7) {
					this.tipo = "Smart TV";
					this.marca = "Samsung";
					this.precio = 10000;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
				}
				
				else if(opcion ==8) {
					this.tipo = "Tablet";
					this.marca = "Samsung";
					this.precio = 7500;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
				}
				
				else if(opcion ==9) {
					this.tipo = "Smartwatch";
					this.marca = "Apple";
					this.precio = 11000;
					tipos.add(tipo);
					precios.add(precio);
					marcas.add(marca);
					Ingresar();
				}
				
				else if(opcion == 10) {
					Factura();
					System.exit(0);
				}
				
				
				else if(opcion > 10 || opcion <  0) {
					System.out.println("Ingrese una opcion valida. Intente de nuevo: ");
					continua = true;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Debe ingresar una opcion valida. Intente de nuevo: ");
				scan.next();
				continua= true;
			}
		} while (continua);
	}
  
  public void Factura() {
	  System.out.println("Ingrese el nombre para su factura : ");
	  this.nombre = scan.nextLine();
	  Tienda tienda = new Tienda();
	  String nombreTienda = tienda.getNombre();
	  String paisTienda = tienda.getPais();
	  String direccionTienda = tienda.getDireccion();
	  int total1 = granTotal();
	  int min_val = 0;
	  int max_val = 10000;
	  int NIT = ran.nextInt(max_val) + min_val;
	  System.out.println("----------FACTURA---------");
	  System.out.println("Cliente: " + nombre);
	  System.out.println("NIT: " + NIT + "\n------------------");
	  System.out.println(nombreTienda + "\n" + paisTienda + "\n" + direccionTienda);
	  for (int e = 0; e < tipos.size(); e++) {
		  System.out.print(tipos.get(e) + "\n");
	  }
	  
	  for (int a = 0; a < marcas.size(); a++) {
		  System.out.println(marcas.get(a) + "\n");
	  }
	  System.out.println("Su gran total es de Q: " + total1);
	  System.out.println("Gracias por su compra!");
	  
	  
  }
  
  public int granTotal() {
	  int total = 0;
	  for (int e = 0; e < precios.size(); e++){
		  total += precios.get(e);
	  }
	  return total;
  }
  

  }

  