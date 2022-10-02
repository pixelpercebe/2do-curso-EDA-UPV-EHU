package esSeparable;

public class Separable{ 

    public Separable() { } 

    public boolean esSeparable1(Integer[] tabla) { 
    	//Pre: 'tabla' no está vacío
    	
    	int izq, der; 
    	 
        for (int i = 0; i < tabla.length; i++){ 
        	
        	izq = 0; 
        	for (int k = 0; k < i; k++) {
        		izq = izq + tabla[k]; 
        	}
        	
        	der = 0; 
        	for (int k = i; k < tabla.length; k++) {
        		der = der + tabla[k]; 
        	}
        	 
        	if (izq == der) return true; 
        } 
        return false; 
    } 
   
    public boolean esSeparable2(Integer[] tabla) {
    	//Pre: 'tabla' no está vacío
    	int izq = 0;
		int der = 0;
    	 
    	//TODO
		for (Integer integer : tabla)
		{
			der += integer;
		}

		 for (Integer integer : tabla)
		 {
			izq += tabla[integer];
			der -= tabla[integer];

		 }
    
    	return false; 		
    	

    } 
}
