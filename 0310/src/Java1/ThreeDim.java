package Java1;

public class ThreeDim {

	public static void main(String[] args) {
int sale[][][] = new int[][][] {{{1,2,3,4},{5,6,7,8}},{{9,10,11,12},{13,14,15,16}}};
		
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				for(int k=0;k<4;k++)
					System.out.println(sale[i][j][k]);
	}

}
