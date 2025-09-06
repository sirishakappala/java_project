package viva;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
	
		int[] array1= new int[3];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		int[] array2= new int[array1.length];
		for(int i=0,j=array2.length-1;i<array1.length;i++,j--) {
			    
			array2[j]=array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

}
