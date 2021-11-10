import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Date;

/**
 * @author Diego De Florán
 * @author Elena Rodríguez
 *
 */
public class Vista {
	private Scanner scan = new Scanner(System.in);
	private int opcion;
	private boolean continua;
	private String encabezado = " _______  __       _______   ______ .___________..______      .__   __.  __    ______      ___          __           ___      .___________. __  .__   __.   ______        ___      .___  ___.  _______ .______       __    ______      ___      .__   __.      ___      \r\n"
			+ "|   ____||  |     |   ____| /      ||           ||   _  \\     |  \\ |  | |  |  /      |    /   \\        |  |         /   \\     |           ||  | |  \\ |  |  /  __  \\      /   \\     |   \\/   | |   ____||   _  \\     |  |  /      |    /   \\     |  \\ |  |     /   \\     \r\n"
			+ "|  |__   |  |     |  |__   |  ,----'`---|  |----`|  |_)  |    |   \\|  | |  | |  ,----'   /  ^  \\       |  |        /  ^  \\    `---|  |----`|  | |   \\|  | |  |  |  |    /  ^  \\    |  \\  /  | |  |__   |  |_)  |    |  | |  ,----'   /  ^  \\    |   \\|  |    /  ^  \\    \r\n"
			+ "|   __|  |  |     |   __|  |  |         |  |     |      /     |  . `  | |  | |  |       /  /_\\  \\      |  |       /  /_\\  \\       |  |     |  | |  . `  | |  |  |  |   /  /_\\  \\   |  |\\/|  | |   __|  |      /     |  | |  |       /  /_\\  \\   |  . `  |   /  /_\\  \\   \r\n"
			+ "|  |____ |  `----.|  |____ |  `----.    |  |     |  |\\  \\----.|  |\\   | |  | |  `----. /  _____  \\     |  `----. /  _____  \\      |  |     |  | |  |\\   | |  `--'  |  /  _____  \\  |  |  |  | |  |____ |  |\\  \\----.|  | |  `----. /  _____  \\  |  |\\   |  /  _____  \\  \r\n"
			+ "|_______||_______||_______| \\______|    |__|     | _| `._____||__| \\__| |__|  \\______|/__/     \\__\\    |_______|/__/     \\__\\     |__|     |__| |__| \\__|  \\______/  /__/     \\__\\ |__|  |__| |_______|| _| `._____||__|  \\______|/__/     \\__\\ |__| \\__| /__/     \\__\\";
	
	public void bienvenida() {
		System.out.println(encabezado);
	}

	
	public int menu(){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("Bienvenido a Electronica Latinoamericana!\n Que desea realizar?\n" + "1. Ver productos\n"+"2. Ver carrito\n"+"3. Salir\n"+"Ingrese su opcion: ");
				opcion = scan.nextInt();
<<<<<<< Updated upstream
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
=======
<<<<<<< HEAD
				
				if(opcion == 1) {
					
				}
				else if (opcion == 2) {
					Carrito car = new Carrito();
					car.Ingresar();
					car.Factura();
					
				}
				else if(opcion == 3) {
					System.out.println("Gracias por visitarnos! Vuelva pronto");
					System.exit(0);
				}
				else if(opcion > 3 || opcion <  0) {
					System.out.println("Ingrese una opcion valida. Intente de nuevo: ");
					continua = true;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Debe ingresar una opcion valida. Intente de nuevo: ");

			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
>>>>>>> 10eb89c3141d12bcaced7f90fe141633ececd8e1
>>>>>>> Stashed changes
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
		}
	
	
	public int menuAparatos(){
		/** 
		*Método menuAparatos int Muestra un listado con los Aparatos para que el usuario elija
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija el tipo de aparato que desea?\n" + "1. Smartphone\n" + "2. Celular\n"+"3.Fijos\n"+"4. Camaras\n"+"5. Desktop\n"+"6. Laptop\n"+"7. SmartTV\n"+"8. Tablet\n"+"9. Smartwatch\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5 || opcion==6 || opcion==7 || opcion==8 || opcion==9){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
		}
		
		
	public int ElegirAccion(String Acciones, int numAcciones){
		/** 
		*Método ElegirAccion int Le muestra al usuario las características que posee el objeto que seleccionó y le pregunta cual desea probar
		*@return opcion int con el numero de la opcion
		*@param Acciones String con las acciones de cada aparato
		*@param numAcciones int con el número de las acciones
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nElija lo que desea probar?\n" + Acciones);
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion<=0 || opcion>numAcciones){
				System.out.println("OPCION INCORRECTA");
			} else {
				flag=true;
			}
		}
		return opcion;
		}
	
	public int Elegir(){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\nDesea probar una funcionalidad del aparato?\n" + "1. SI\n"+"2. NO\n");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public String Agregarinfo(){
		System.out.println("Ingrese la informacion que desea probar");
		String info = scan.next();
		return info;
	}
	
	public void MostrarPrueba(String prueba){
		System.out.println("\n"+prueba+"\n");
	}
	
}

