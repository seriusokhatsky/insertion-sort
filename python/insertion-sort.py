def insertionSort( A ):
	for j in range(1, len(A)):
		key = A[j]
		i = j - 1
		while i >= 0 and A[i] > key:
			A[i+1] = A[i]
			A[i] = key
			i = i - 1

	return A



array = [41, 31, 59, 26, 41, 58]


print insertionSort( array ) 