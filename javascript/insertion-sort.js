var array = [41, 31, 59, 26, 41, 58];



var insertionSort = function( A ) {
	var key, i;

	for( var j = 1; j < A.length; j++) {

		key = A[j];

		i = j - 1;

		while( i >= 0 && A[i] > key ) {
			A[i+1] = A[i];
			A[i] = key;

			i--;
		}

	}

	return A;

};


console.log( insertionSort(array) );