import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[n][m];
		int arr2[][] = new int[n][m];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st2 = new StringTokenizer(sc.nextLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			StringTokenizer st3 = new StringTokenizer(sc.nextLine());
			for(int j=0; j<m; j++) {
				arr2[i][j] = Integer.parseInt(st3.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j]+arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}