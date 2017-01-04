package me.saranpande.dsa.sorting;

import java.util.ArrayList;

public class InsertionSort {

	public static ArrayList<Integer> insertionSort(ArrayList<Integer> array) {
		int i, key;
		for (int j = 1; j < array.size(); j++) {
			key = (int) array.get(j);
			i = j - 1;
			while (i >= 0 && ((int) array.get(i)) > key) {
				array.set(i + 1, array.get(i));
				i--;
			}
			array.set(i + 1, key);
			for (int p = 0; p < array.size(); p++) {
				System.out.print(array.get(p) + " ");
			}
			System.out.println(" ");
		}
		return array;
	}

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(90);
		array.add(13);
		array.add(5);
		array.add(90);
		array.add(1);
		array.add(1);

		ArrayList<Integer> sortedArray = insertionSort(array);
		for (int i = 0; i < sortedArray.size(); i++) {
			System.out.println(sortedArray.get(i));
		}
	}
}