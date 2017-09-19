/**
 * 
 * @author geromeesperacion
 *
 */

/*
 * based on shared notes posted on Canvas
 * sorts array using quick sort method
 */
public class QuickSort implements SortingAlgorithm {
	
	//swaps the second element of the array with the first
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public int sort(int[] a, int top, int bot) {

		int i = top; 
		int j = bot;
		int pivot = (top + bot) / 2;
		
		while (i <= j) {
			while (a[i] < a[pivot]) {
				i++;
			}
			
			while (a[j] > a[pivot]) {
				j--;
			}
			
			if (i <= j) {
				// ... but first: make sure to keep track of the pivot even if it moves.
				if (i == pivot) {
					pivot = j;
				}
				else if (j == pivot) {
					pivot = i;
				}
				swap(a, i++, j--);
			}
		}
		
		return i;
	}
	
	// Quick sort: a recursive algorithm for sorting.
	public void qs(int[] a, int top, int bot) {
		int pivot = sort(a, top, bot);

		if (top < pivot-1) {
			qs(a, top, pivot-1);
		}
		
		if (pivot < bot) {
			qs(a, pivot, bot);
		}
	}

	public void sort(int[] a) {
		
		int top = 0;
		int bot = a.length-1;
		
		qs(a, top, bot);
		
	}
	
}
