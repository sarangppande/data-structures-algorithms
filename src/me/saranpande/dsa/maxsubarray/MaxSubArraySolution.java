package me.saranpande.dsa.maxsubarray;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArraySolution {

	public static MaxSubArray findCrossoverMaxSubArray(ArrayList<Integer> array, int low, int mid, int high) {
		MaxSubArray max = new MaxSubArray();
		int leftMax = Integer.MIN_VALUE;
		int leftIndex = -1;
		int sum = 0;
		for (int i = mid; i >= low; i--) {
			sum += array.get(i);
			if (sum > leftMax) {
				leftMax = sum;
				leftIndex = i;
			}
		}
		int rightMax = Integer.MIN_VALUE;
		int rightIndex = -1;
		sum = 0;
		for (int i = mid + 1; i <= high; i++) {
			sum += array.get(i);
			if (sum > rightMax) {
				rightMax = sum;
				rightIndex = i;
			}
		}
		max.low = leftIndex;
		max.high = rightIndex;
		max.sum = leftMax + rightMax;
		return max;
	}

	public static MaxSubArray findMaxSubArray(ArrayList<Integer> array, int low, int high) {
		if (low == high) {
			MaxSubArray max = new MaxSubArray();
			max.sum = array.get(low);
			max.low = low;
			max.high = high;
			return max;
		} else {
			int mid = (low + high) / 2;

			MaxSubArray leftSubArray = findMaxSubArray(array, low, mid);
			MaxSubArray rightSubArray = findMaxSubArray(array, mid + 1, high);
			MaxSubArray midSubArray = findCrossoverMaxSubArray(array, low, mid, high);

			if (leftSubArray.sum > rightSubArray.sum && leftSubArray.sum > midSubArray.sum) {
				return leftSubArray;
			} else if (rightSubArray.sum > leftSubArray.sum && rightSubArray.sum > midSubArray.sum) {
				return rightSubArray;
			} else {
				return midSubArray;
			}
		}

	}

	public static void main(String args[]) {
		ArrayList<Integer> array = new ArrayList<Integer>(
				Arrays.asList(13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7));
		MaxSubArray max = findMaxSubArray(array, 0, array.size() - 1);
		System.out.println("Sum: " + max.sum);
		System.out.println("Low: " + max.low);
		System.out.println("High: " + max.high);
	}
}
