package entities;

public class Ordenacao {

	private Integer min;
	private Integer max;

	public Ordenacao() {	
	}

	public void bobbleSort(int arr[]) {
		long startTime = System.nanoTime();
		int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
		long endTime = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("BobbleSort: "+ totalTime/1000000000);
	}
	
	public void insertSort(int[] arr) {
		long startTime = System.nanoTime();
		int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }

		long endTime = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("insertSort: "+ totalTime/1000000000);
    }
	
	public void selectSort(int[] arr) {
		long startTime = System.nanoTime();
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        int min_idx = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[min_idx]) {
	                min_idx = j;
	            }
	        }
	        int temp = arr[min_idx];
	        arr[min_idx] = arr[i];
	        arr[i] = temp;
	    }

		long endTime = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("selectSort: "+ totalTime/1000000000);
	}
	
	public void quickSortChamada(int[] arr, int low, int high) {
		long startTime = System.nanoTime();
		quickSort(arr, low, high);
		long endTime = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("quickSort: "+ totalTime/1000000000);
	}

	private void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partitionQS(arr, low, high);
		    quickSort(arr, low, pi - 1);
		    quickSort(arr, pi + 1, high);
		}
	}

	private static int partitionQS(int[] arr, int low, int high) {
	    int pivot = arr[high];
	    int i = (low - 1);
	    for (int j = low; j < high; j++) {
	        if (arr[j] < pivot) {
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    return i + 1;
	}
	
	public void shellSort(int[] arr) {
		long startTime = System.nanoTime();
	    int n = arr.length;
	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i += 1) {
	            int temp = arr[i];
	            int j;
	            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
	                arr[j] = arr[j - gap];
	            }
	            arr[j] = temp;
	        }
	    }

		long endTime = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("shellSort: "+ totalTime/1000000000);
	}

	public void mergeSortChamada(int[] arr, int l, int r) {
		long startTime = System.nanoTime();
		mergeSort(arr, l, r);
		long endTime = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("mergeSort: "+ totalTime/1000000000);
	}
	
	private void mergeSort(int[] arr, int l, int r) {
	    if (l < r) {
	        int m = (l + r) / 2;
	        mergeSort(arr, l, m);
	        mergeSort(arr, m + 1, r);
	        merge(arr, l, m, r);
	    }
	}
	
	private static void merge(int[] arr, int l, int m, int r) {
	    int n1 = m - l + 1;
	    int n2 = r - m;
	    int[] L = new int[n1];
	    int[] R = new int[n2];
	    for (int i = 0; i < n1; ++i) {
	        L[i] = arr[l + i];
	    }
	    for (int j = 0; j < n2; ++j) {
	        R[j] = arr[m + 1 + j];
	    }
	    int i = 0, j = 0;
	    int k = l;
	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) {
	            arr[k] = L[i];
	            i++;
	        } else {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	    while (i < n1) {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	    while (j < n2) {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
	
	public void heapSort(int[] arr) {
		long startTime = System.nanoTime();
	    int n = arr.length;
	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(arr, n, i);
	    }
	    for (int i = n - 1; i >= 0; i--) {
	        int temp = arr[0];
	        arr[0] = arr[i];
	        arr[i] = temp;
	        heapify(arr, i, 0);
	    }

		long endTime = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println("heapSort: "+ totalTime/1000000000);
	}

	private static void heapify(int[] arr, int n, int i) {
	    int largest = i;
	    int l = 2 * i + 1;
	    int r = 2 * i + 2;
	    if (l < n && arr[l] > arr[largest]) {
	        largest = l;
	    }
	    if (r < n && arr[r] > arr[largest]) {
	        largest = r;
	    }
	    if (largest != i) {
	        int swap = arr[i];
	        arr[i] = arr[largest];
	        arr[largest] = swap;
	        heapify(arr, n, largest);
	    }
	}
	
	public int[] aleatorio(int max) {
		int[] vetor = new int[max];
		for (int i =0; i < max; i++) {			
			vetor[i] = (int)(Math.random()*13)%max-1;
		}
		/*for (int i : vetor) {
			System.out.println(i);
		}*/	
		return vetor;
	}

}
