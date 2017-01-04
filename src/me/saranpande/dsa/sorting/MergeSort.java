package me.saranpande.dsa.sorting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	public static ArrayList<Integer> merge(ArrayList<Integer> first, ArrayList<Integer> second) {
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		int firstIndex = 0, secondIndex = 0;
		while (firstIndex < first.size() && secondIndex < second.size()) {
			if (first.get(firstIndex) < second.get(secondIndex)) {
				mergedList.add(first.get(firstIndex));
				firstIndex++;
			} else {
				mergedList.add(second.get(secondIndex));
				secondIndex++;
			}
		}
		if (firstIndex >= first.size()) {
			for (int i = secondIndex; i < second.size(); i++) {
				mergedList.add(second.get(i));
			}
		} else {
			for (int i = firstIndex; i < first.size(); i++) {
				mergedList.add(first.get(i));
			}
		}
		return mergedList;
	}

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> array, int start, int end) {
		if (start == end) {
			return new ArrayList<Integer>(Arrays.asList(array.get(end)));
		}
		int mid = (start + end) / 2;
		ArrayList<Integer> firsthalf = mergeSort(array, start, mid);
		ArrayList<Integer> secondhalf = mergeSort(array, mid + 1, end);
		ArrayList<Integer> sortedArray = merge(firsthalf, secondhalf);
		return sortedArray;
	}

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(90);
		array.add(13);
		array.add(5);
		array.add(90);
		array.add(1);
		array.add(1);

		ArrayList<Integer> sortedArray = mergeSort(array, 0, array.size() - 1);
		for (int i = 0; i < sortedArray.size(); i++) {
			System.out.println(sortedArray.get(i));
		}
	}
}
