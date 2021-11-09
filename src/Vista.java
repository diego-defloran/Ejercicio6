import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;

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
	
	public void menu() {
		System.out.println("Bienvenido a Electronica Latinoamericana!\n Que desea realizar?");
		System.out.println("1. Ver productos\n2. Ver carrito\n3. Salir\nIngrese su opcion: ");
		do {
			try {
				continua = false;
				opcion = scan.nextInt();
				
				if(opcion == 1) {
					
				}
				else if (opcion == 2) {
					Carrito car = new Carrito();
					
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
				scan.next();
				continua= true;
			}
		} while (continua);
	}
}



