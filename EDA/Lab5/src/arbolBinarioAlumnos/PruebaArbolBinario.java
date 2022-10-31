package arbolBinarioAlumnos;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class PruebaArbolBinario {
	
	
	
	//CÓDIGO PARA LA CARGA DE LOS EJEMPLOS DE PRUEBA, NO MODIFICAR
	
	public static ArbolBinario<Integer> cargar(String nomFich) throws Exception {
		ArbolBinario<Integer> result = new ArbolBinario<Integer>();
		Scanner source = new Scanner(new File(nomFich));
		String token = source.next();
		if (token.equals("*"))
			result.root = null;
		else if (token.equals("["))
			result.root = cargar(source);
		else
			throw new Exception(String.format("Unexpected token when reading " + "binary tree: %s", token));
		return result;
	}

	public static Nodo<Integer> cargar(Scanner source) throws Exception{
		Nodo<Integer> result = new Nodo<Integer>(source.nextInt());
		String token = source.next();
		if (token.equals("]")) {
			result.left = null;
			result.right = null;
		} else {
			if (token.equals("["))
				result.left = cargar(source);
			else if (token.equals("*"))
				result.left = null;
			else
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
			token = source.next();
			if (token.equals("["))
				result.right = cargar(source);
			else if (token.equals("*"))
				result.right = null;
			else
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
			token = source.next();
			if (!token.equals("]"))
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
		}
		return result;
	}
	
	//FIN DEL CÓDIGO PARA LA CARGA DE LOS EJEMPLOS DE PRUEBA

	public static void main(String[] args) throws Exception {
		
				
		ArbolBinario<Integer> ab;
		
		for(int i=0; i<=5; i++) {
			
			System.out.println("\n-------------\n ÁRBOL "+i+"\n-------------");
			ab = cargar("src/files/arbol"+i+".txt");
			
			System.out.println("\nPrueba ejercicio 1: ");
			LinkedList<Integer> lista = ab.elementosEnInOrden();
			System.out.print("[ ");
			for(Integer elem: lista) {
				System.out.print(elem+" ");
			}
			System.out.println("]");
			
			
			System.out.println("\nPrueba ejercicio 2: ");			
			for(int j=0; j<=10; j++) { //Comprueba si están los números del 0 al 10
				System.out.print("¿Contiene el "+j+"?: ");
				ResultadoContainsYNivel res = ab.containsYNivel(j);
				System.out.println("("+res.contains+", "+res.nivel+")");
			}
			
			
			System.out.println("\nPrueba ejercicio 3: ");
			System.out.println("La altura del árbol es "+ab.altura());
			
			
			System.out.println("\nPrueba ejercicio 4: ");
			LinkedList<Integer> lista2 = ab.obtenerCaminoHojaIzquierda();
			System.out.print("[ ");
			for(Integer elem: lista2) {
				System.out.print(elem+" ");
			}
			System.out.println("]");
			
			
			
			
		}	

	}

}
