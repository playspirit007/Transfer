package Übungsaufgaben;

import java.util.Random;

public class InsertionSort {
	private static int counter;
	private static int[] data;
	
	public static void main(String[] agrs) {
	data = new int[1000];
	for (int i = 0; i < 1000; i++) {
		Random myRandom = new Random();
		int x = myRandom.nextInt(1, 100);
		data[i] = x;
		}
		sort();	
	}
	
	private static void sort() {
		int tmp = 0;
		int i = 1;
		
		while (i < data.length) {
			counter++;
			int zählB = i;
			tmp = data[zählB];
			
			while (zählB > 0 && data[(zählB-1)] > tmp) {
				data[zählB] = data[zählB-1];
				zählB--;
			}
			data[zählB] = tmp;
			print();
			i++;
		}	
	}
	
	private static void print() {
		System.out.println("Durchlauf " + counter);
		int i = 0;
		while (i < data.length) {
			System.out.println(data[i]);
			i++;
		   	}
		}
}
