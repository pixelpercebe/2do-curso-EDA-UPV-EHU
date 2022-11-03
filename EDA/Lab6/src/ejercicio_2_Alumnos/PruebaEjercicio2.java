package ejercicio_2_Alumnos;

import java.io.File;
import java.util.Scanner;



public class PruebaEjercicio2 {

	//CÓDIGO PARA LA CARGA DE LOS EJEMPLOS DE PRUEBA, NO MODIFICAR
	
		public static ArbolBinarioEnteros cargar(String nomFich) throws Exception {
			ArbolBinarioEnteros result = new ArbolBinarioEnteros();
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

		public static NodoEnteros cargar(Scanner source) throws Exception{
			NodoEnteros result = new NodoEnteros(source.nextInt());
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

	public static void main(String[] args) throws Exception {
		
        ArbolBinarioEnteros ab;
		
		for(int i=0; i<=6; i++) {
			
			System.out.println("\n-------------\n ÁRBOL "+i+"\n-------------");
			ab = cargar("src/filesNoABB/arbol"+i+".txt");
			
			ab.etiquetar();
			ab.imprimirEtiquetas();
			
		}

	}

}
