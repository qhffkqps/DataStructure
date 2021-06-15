package ksk0524;

class Qsort {
	int i = 0;
	public int partition(int a[], int begin, int end) {
		int pivot, temp, L, R, t;
		L = begin;
		R = end;
		pivot = (begin + end) / 2;
		System.out.printf(" \n [퀵정렬 %d 단계 : pivot=%d] \n",++i,a[pivot]);
		while(L<R) {
			while ((a[L] < a[pivot]) && (L < R))
				L++;
			while (a[R] >= a[pivot] &&(L < R))
				R--;
			if(L < R) {
				temp = a[L]; a[L] = a[R]; a[R] = temp;
			}
		}
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		for (t = 0; t < a.length; t++)
			System.out.printf("%3d", a[t]);
		System.out.println();
		return L;
	}

	}




	
	

