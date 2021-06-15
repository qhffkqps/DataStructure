package ksk0531;


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
		public void quikSort(int a[], int begin,int end) {
			if(begin < end) {
				int p;
				p = partition(a, begin, end);
				quikSort(a,begin,p-1);
				quikSort(a,p+1,end);
			}
		}
	}

class QuickTest {
	public static void main(String args[]) {
		int a[] = {69,10,30,2,16,8,31,22};
		Qsort S = new Qsort();
		System.out.printf("\n정렬할 원소:");
		for(int i = 0; i<a.length; i++)
			System.out.printf("%d", a[i]);
		System.out.println();
		S.quikSort(a,0,7);
	}
}