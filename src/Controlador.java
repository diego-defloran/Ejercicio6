
/**
 * @author Diego De Florán
 * @author Elena Rodríguez
 *
 */
import java.util.Date;
public class Controlador {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vista vista = new Vista();
		Device aparato = null;
		vista.bienvenida();
		int opcion = 0;
		String precio = "";
		String marca = "";
		Date fecha = new Date();
		String serie = "";
		String marcador = "";
		String Tipo = "";
		
		while (opcion != 3){
			opcion = vista.menu();
			if (opcion == 1){
				//Ver productos
				int numAparato = vista.menuAparatos();
				if(numAparato==1){
					aparato = new Smartphones(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==2){
					aparato = new Celulares(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==3){
					aparato = new Fijos(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==4){
					aparato = new Camaras(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==5){
					aparato = new Desktop(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==6){
					aparato = new Laptop(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==7){
					aparato = new SmartTV(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==8){
					aparato = new Tablets(precio, marca, fecha, serie, marcador, Tipo);
				} else if(numAparato==9){
					aparato = new Smartwatch(precio, marca, fecha, serie, marcador, Tipo);
				}
				int eleccionProbar = vista.Elegir();
				if (eleccionProbar==1){
					String funcionalidades = aparato.getCaracteristicas();
					int numf = aparato.getnumCaracteristicas();
					int EF = vista.ElegirAccion(funcionalidades, numf);
					String info = vista.Agregarinfo();
					String probando = aparato.Probar(EF, info);
					vista.MostrarPrueba(probando);
				} 
			} else if (opcion==2){
				//Ver Carrito
				Carrito car = new Carrito();
			} else if (opcion==3){
				//Salir
				System.out.println("Gracias por visitarnos! Vuelva pronto");
				System.exit(0);
			}
		
	}

}
}
