package auxiliares;

import java.util.Arrays;
import java.util.Random;

public class ArrayCreator {

    static int MAX = 1000000;

    public static Integer[] createArray(int N, int range) {
    	Random randomGenerator = new Random();
    	
    	Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = randomGenerator.nextInt(range);
        }
        return a;
    }
    
    /**
     * Returns an array of the specified size, with random positive values between 0 and MAX. 
     * When passing only one param, the MAX value is used as a default. 
     *
     * @param  N  the size of the array
     * @return      the new array of size N
     */
    public static Integer[] createArray(int N) {
        return createArray(N, MAX);
    }
    
    
    
    
    public static int[] createArrayNoRepOrdered(int N) {
    	Random randomGenerator = new Random();
     	int[] a = new int[N];
    	    	
    	a[0] = -N;
    	int i = 1;
    	while(i<a.length) {
    		a[i] = a[i-1]+randomGenerator.nextInt(3)+1;
    		i++;
    	}
        Arrays.sort(a);
        return a;
    }

    


}
