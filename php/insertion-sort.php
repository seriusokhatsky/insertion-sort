<?php 

$array = [41, 31, 59, 26, 41, 58];


function insertionSort( $A ) {


	for( $j = 1; $j < count($A); $j++ ) {

		$key = $A[$j];

		$i = $j - 1;

		while( $i >= 0 && $A[$i] > $key ) {
			$A[$i+1] = $A[$i];
			$A[$i] = $key;
			$i--;
		}

	}

	return $A;

}


echo implode( insertionSort( $array ), ' ' );


 ?>