package impresorasAlumnos;
import java.io.IOException;
public class PruebaCentroDeCalculo {


	public static void main(String[] args) throws IOException {
        CentroDeCalculo cdc = new CentroDeCalculo();
     
        System.out.println("Prueba con fichero eventos1.txt:");
        cdc.simularEventos("src/filesAlumnos/impresoras/eventos1.txt");
        
        System.out.println("\nPrueba con fichero eventos2.txt:");
        cdc.simularEventos("src/filesAlumnos/impresoras/eventos2.txt");
	}

}
