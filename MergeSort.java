/**
 * 
 * @author geromeesperacion
 *
 */

/*
 * based on class notes and GeeksforGeeks
 * sorts an array using merge sort method
 */

public class MergeSort implements SortingAlgorithm {

	public void merge(int arr[], int topIndex, int midIndex, int botIndex) {
		
		//get the size that will be used for top and bottom arrays
		int topSize = midIndex - topIndex + 1;
		int botSize = botIndex - midIndex;
	 
		int top[] = new int [topSize];
		int bot[] = new int [botSize];
		
		//fill "split" arrays with their original contents
		for (int i = 0; i < topSize; ++i) {
			top[i] = arr[topIndex + i];
		}

		for (int j = 0; j < botSize; ++j) {
			bot[j] = arr[midIndex + 1 + j];
		}
		
		//these will be the index of the subarrays
		int i = 0; 
		int j = 0;
		
		int k = topIndex;
		
		while (i < topSize && j < botSize) {
			if (top[i] <= bot[j]) {
				arr[k] = top[i++];
			} else {
				arr[k] = bot[j++];
			}
	            k++;
		}
		
		//copies the remaining elements back into their respective subarrays
		while (i < topSize) {
			arr[k++] = top[i++];
		}
	 
		while (j < botSize) {
			arr[k++] = bot[j++];
		}
		
	}

	public void sort(int a[], int topIndex, int botIndex) {
        if (topIndex < botIndex) {
        		int midIndex = (topIndex+botIndex)/2;

        		sort(a, topIndex, midIndex);
        		sort(a, midIndex + 1, botIndex);
 
        		merge(a, topIndex, midIndex, botIndex);
        }
	}
	
	public void sort(int[] a) {
		sort(a, 0, a.length-1);
	}
	
}
