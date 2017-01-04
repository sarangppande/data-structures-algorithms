package me.saranpande.dsa.sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SelectionSort {

	public static ArrayList<Integer> selectionSort(ArrayList<Integer> array) {
		int temp, index;
		for (int i = 0; i < array.size() - 1; i++) {
			index = i;
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(j) < array.get(index)) {
					index = j;
				}
			}
			temp = array.get(i);
			array.set(i, array.get(index));
			array.set(index, temp);
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

		ArrayList<Integer> sortedArray = selectionSort(array);
		for (int i = 0; i < sortedArray.size(); i++) {
			System.out.println(sortedArray.get(i));
		}
	}
}
