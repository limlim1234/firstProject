package com.yedam.exam;

public class ArrayExcercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				
		};

		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			for(int a=0; a<array[i].length; a++) {
				sum += array[i][a];
				count++;
			}
			
		}
		
		
		avg = (double) sum / count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
