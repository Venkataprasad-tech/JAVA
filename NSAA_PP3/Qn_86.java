package NSAA_PP3;

public class Qn_86 {
	public static void addMatrix(int a[][], int b[][], int c[][] ) {
		int n = a.length;
		int m = b.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
	}
	public static void main(String[] args) {
		int a[][] = {{1,1,1},{2,2,2},{3,3,3},{4,4,4,4}};
		int b[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		int c[][] = new int [4][3];
	}
}
