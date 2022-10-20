package puertoAlumnos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PruebaPuerto {


	public static void main(String[] args) throws FileNotFoundException {
		
		Puerto p = new Puerto();
		
		
		Movimiento mov;
		
		for(int i=1; i<=2; i++) {
			Queue<Movimiento> movimientos = new LinkedList<Movimiento>();
			Scanner sc = new Scanner(new File("src/filesAlumnos/puerto/movimientos"+i+".txt"));		
			String[] datos;
			
			while(sc.hasNextLine()) {
				datos = sc.nextLine().split("\\s+");
				mov = new Movimiento(datos[0].charAt(0), datos[1], Integer.parseInt(datos[2]));
				movimientos.add(mov);			
			}
			sc.close();
			
			System.out.println("\n\nPrueba con fichero movimientos"+i+".txt:");
			p.simularMovimientos(movimientos);
		}
		
		
		
		

	}

}
