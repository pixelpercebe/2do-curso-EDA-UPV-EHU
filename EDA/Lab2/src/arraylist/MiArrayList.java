package arraylist;

public class MiArrayList<T> {
    // atributos
    private T[] elementos;
    private static final int CAPACIDAD_INICIAL = 10;
    private int tamanio; //nº de elementos válidos que contiene el arraylist

    //Constructs an empty list with an initial capacity of ten.
    public MiArrayList() {
        elementos = (T[]) (new Object[CAPACIDAD_INICIAL]);
        tamanio = 0;
    }



    /*
     * MÉTODOS YA IMPLEMENTADOS EN CLASE
     */


    //Returns the number of elements in this list.
    public int size() {
        return tamanio;
    }

    //Returns the element at the specified position in this list.
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= tamanio) {
            throw new IndexOutOfBoundsException();
        }
        return elementos[index];
    }

    //Appends the specified element to the end of this list. Returns true.
    public boolean add(T elem) {
        if (tamanio == elementos.length) {  //Aumentar capacidad en un 50%
            int nuevaCapacidad = (int) (elementos.length * 1.5);
            T[] nuevoArray = (T[]) (new Object[nuevaCapacidad]);
            for (int i = 0; i < tamanio; i++) {
                nuevoArray[i] = elementos[i];
            }
            elementos = nuevoArray;
        }
        elementos[tamanio] = elem;
        tamanio++;
        return true;
    }



    /*
     * MÉTODOS A IMPLEMENTAR EN EL LABORATORIO 2
     */


    //Returns true if this list contains no elements, false otherwise.
    public boolean isEmpty() {
        //TODO
        return (tamanio == 0);
    }

    //Returns the index of the first occurrence of the specified element in this
    // list, or -1 if this list does not contain the element.
    public int indexOf(Object o) {
        T elem = (T) o;
        int cont = 1;
        //TODO
        while (cont < tamanio && !elementos[cont].equals(elem)) {
            cont++;
        }
        if (cont == tamanio) {
            return -1;
        } else
            return cont;//CORREGIR SI ES NECESARIO
    }

    //Returns true if this list contains the specified element, false otherwise.
    public boolean contains(Object o) {
        //TODO
        int cont = 1;
        while (cont < tamanio && !elementos[cont].equals(o)) {
            return true;
        }
        return false; //CORREGIR SI ES NECESARIO
    }


    //Removes the element at the specified position in this list.
    //Returns the removed element.
    public T remove(int index) throws IndexOutOfBoundsException {
        int cont = 0;
        T persona = null;
        //TODO

        while (cont < tamanio && cont != index) {
            cont++;
        }
        if (cont == index) {
            persona = elementos[cont];
        }

        if (cont < tamanio) {
            for (int i = index; i < tamanio-1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanio --;
        }

        return persona;
    }


    //Returns a string representation of this collection. The string representation
    // consists of a list of the collection's elements in order, enclosed in square
    // brackets ("[]"). Adjacent elements are separated by the characters ", "
    // (comma and space).
    @Override
    public String toString() {
        //TODO
        StringBuilder lista = new StringBuilder();
        int cont = 0;
        while (cont < tamanio && elementos[cont] != null) {
            lista.append(elementos[cont] + " ");
            cont++;
        }
        return lista.toString();
    }




    /*
     * OTROS MÉTODOS (IMPLEMENTACIÓN OPCIONAL)
     */
  	
  	/*
      
      //Inserts the specified element at the specified position in this list. 
  	public void add(int index, T elem) throws IndexOutOfBoundsException {
  		//TODO
  	}	
  	
        //Removes the first occurrence of the specified element from this list, if it is 
        //present. Returns true if it has been removed, false otherwise.
  	public boolean remove(Object o){
  		//TODO
  		return false; //CORREGIR SI ES NECESARIO
  	}	
  	
  	      //Replaces the element at the specified position in this list with the specified
      //element. Returns the replaced element
	public T set(int index, T elem) throws IndexOutOfBoundsException {
		//TODO
		return null; //CORREGIR SI ES NECESARIO
	}
    */

}