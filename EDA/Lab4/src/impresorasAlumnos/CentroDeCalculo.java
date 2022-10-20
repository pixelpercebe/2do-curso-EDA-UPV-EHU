package impresorasAlumnos;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CentroDeCalculo {
	//TODO: escoger la estructura para representar las impresoras y descomentar
	private Queue<String>[] impresoras; //Creación de un Array de colas.  Estas colas contendrán Strings con el nombre de los ficheros a imprimir.
	private int[] numeros;
	private boolean problema;
	public CentroDeCalculo() {
		//TODO: creación de las impresoras

		//Son 5 colas, una por impresora. Primero se hace un casting para asignar que las colas son de Strings, después se reserva el espacio de memoria para el array
		impresoras = (LinkedList<String>[])(new LinkedList[5]) ;

		problema = false; //Al comienzo no existe ningún problema.

		//Ahora generamos las colas en cada posición del array
		for (int i = 0; i < impresoras.length; i++) {
			impresoras[i] = new LinkedList<>();
		}
	}
	
	
	//TODO: completar simularEventos: simula los eventos del fichero y al finalizar imprime los nombres de los archivos que quedan en cada impresora
	public void simularEventos(String nomFich) throws IOException {

		Scanner sc = new Scanner(new File(nomFich));
		String[] datos;
		problema = false;

		int num_impresora = 0;

		while(sc.hasNextLine()) {
			datos = sc.nextLine().split("\\s+");
			//System.out.println(Arrays.toString(datos));

			switch(datos[0]) {
				case "S":
					//TODO

					if (!problema){
						num_impresora = Integer.parseInt(datos[1]);
					}
					impresoras[num_impresora].add(datos[2]);
					break;


				case "I":

					if (!problema){
						num_impresora = Integer.parseInt(datos[1]);
					}
					if (impresoras[num_impresora].peek() != null){
						impresoras[num_impresora].remove();}
					//TODO
					break;

				case "P":
					//TODO
					problema = false;
					break;

				case "F":
					//TODO
					problema = true;
					num_impresora = 4;

					for (int i = 0; i < impresoras.length-1; i++) {	//manda todos los archivos guardados en las impresoras a la impresora 4
						while (impresoras[i].peek() != null)
						{
							impresoras[num_impresora].add(impresoras[i].remove());
						}
					}

					break;
				default: break;
			}

		}
		sc.close();

		//TODO

		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			s.append("Impresora ").append(i).append(" < ");
			while (impresoras[i].peek() != null){
				s.append(impresoras[i].remove()).append(" ");
			}
			s.append(">\n");
		}

		System.out.println(s);
		//imprimimos los archivos pendientes de cada hora.

	}


}
