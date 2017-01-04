package me.saranpande.dsa.searching;

public class BinarySearch {

	public static int binarySearch(int[] array, int n, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == n) {
				return mid;
			} else if (array[mid] > n) {
				return binarySearch(array, n, low, mid - 1);
			} else {
				return binarySearch(array, n, mid + 1, high);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[11];
		array[0] = 0;
		array[1] = 5;
		array[2] = 13;
		array[3] = 19;
		array[4] = 22;
		array[5] = 41;
		array[6] = 55;
		array[7] = 68;
		array[8] = 72;
		array[9] = 81;
		array[10] = 98;

		int index = binarySearch(array, -10, 0, 10);

		if (index != -1)
			System.out.println("Number found at index:" + index);
		else
			System.out.println("Number not found");
	}

}
