package ksk0524;


class BulbleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {69,10,30,2,16,8,31,22};
		BurbleSort S = new BurbleSort();
		System.out.printf("\n������ ���� :");
		for(int i = 0; i < a.length; i++)
			System.out.printf("%d", a[i]);
		System.out.println();
		S.BurbleSort(a);
	}
	class BurbleSort {
		public void BurbleSort(int a[]) {
			int i, j,temp, size;
			size = a.length;
			for(i = size-1; i>0; i--) {
				System.out.printf("\n ���� ����%d �ܰ� : ", size-i);
				for(j = 0; j < i; j++)
					if(a[j] > a[j+1]) {
						temp = a[j]; a[j] = a[j+1] = temp;
					}
				System.out.printf("\n \t");
				for(int k=0; k<size; k++)
					System.out.printf("%3d", a[k]);
			}
		}
	}
}