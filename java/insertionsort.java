import java.util.Arrays;

class insertionsort {

	Integer[] array; 


	public static void main( String[] args ) {
		new insertionsort().go();
	}

	public void go() {
		array = new Integer[]{41, 31, 59, 26, 41, 58};

		System.out.println(Arrays.toString(insertionSort(array)));

	}

	public Integer[] insertionSort( Integer[] arr ) {
		int key, i;

		for( int j = 1; j < arr.length; j++ ) {

			key = arr[j];

			i = j - 1;

			while( i >= 0 && arr[i] > key ) {

				arr[i+1] = arr[i];
				arr[i] = key;

				i--;

			} 


		}

		return arr;

	}


}