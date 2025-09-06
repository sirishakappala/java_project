package viva;

import java.util.Scanner;

public class viva2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1= new int[3];
		int sum=0;
		int avg;
		for(int i=0;i<array1.length;i++) {
			array1[i]= sc.nextInt();
		 sum= array1[i]+sum;
		}
System.out.println(sum);
avg=sum/array1.length;
System.out.println(avg);
	}

}
