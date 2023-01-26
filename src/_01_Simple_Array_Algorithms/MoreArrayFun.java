package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		
	}

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	 public static void printArray(String[] array) {
	    	for(int i = 0; i< array.length; i++) {
	    		String word = array[i];
	    		System.out.println(word);
	    	}
	       
	    }


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	 public static void printReverseArray(String[] array) {
	    	for(int i = array.length; i>0; i--) {
	    		String word = array[i];
	    		System.out.println(word);
	    	}
	       
	    }


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	 public static void printEveryOtherArray(String[] array) {
	    	for(int i =0 ; i<array.length; i++) {
	    		String word = array[i];
	    		if(i %2 == 0) {
	    			System.out.println(word);
	    		}
	    		
	    	}
	       
	    }

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	 public static void printRandArray(String[] array) {
		 Random rand = new Random();
		 
	    	for(int i = array.length; i>0; i--) {
	    		int rando = rand.nextInt(array.length);
	    		String word = array[i];
	    		
	    	}
	       
	    }

}
