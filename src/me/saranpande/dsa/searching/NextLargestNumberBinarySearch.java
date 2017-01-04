package me.saranpande.dsa.searching;

public class NextLargestNumberBinarySearch {

	public static int nextLargestNumberBinarySearch(int[] array, int n, int len, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == n) {
				return nextLargestNumberBinarySearch(array, n+1, 11, low, high);
			} else if (array[mid] > n) {
				return nextLargestNumberBinarySearch(array, n, 11, low, mid - 1);
			} else {
				return nextLargestNumberBinarySearch(array, n, 11, mid + 1, high);
			}
		}
		if (high + 1 < len) {
			return high + 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[11];
		array[0] = 0;
		array[1] = 5;
		array[2] = 13;
		array[3] = 19;
		array[4] = 22;
		array[5] = 68;
		array[6] = 68;
		array[7] = 68;
		array[8] = 68;
		array[9] = 81;
		array[10] = 98;

		int index = nextLargestNumberBinarySearch(array, 68, 11, 0, 10);

		if (index != -1)
			System.out.println("Exact or Next largest number:" + array[index] + " at index:" + index);
		else
			System.out.println("Number not found");
	}

}
