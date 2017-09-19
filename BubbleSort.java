/**
 * 
 * @author geromeesperacion
 *
 */

/*
 * sorts an array using bubble sort method
 */

public class BubbleSort implements SortingAlgorithm {
	
	//swaps the second element of the array with the first
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public void sort(int[] a) {
		for(int j = 0; j < a.length; j++) {
			for(int i = 0; i < a.length-j-1; i++) {
				
				if(a[i] > a[i+1]) {
					swap(a, i, i+1);
				}
			}
		}
		
	}

}
