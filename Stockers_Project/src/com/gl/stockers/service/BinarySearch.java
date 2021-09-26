package com.gl.stockers.service;

public class BinarySearch {

	double binarySearch(double arr[], int l, int r, double x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

		if (arr[mid] == x)
				return x;
		if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

		return binarySearch(arr, mid + 1, r, x);
		}

		return 0;
	}
}

