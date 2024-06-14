import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[100][100];
		int area = 0;
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int point_x = Integer.parseInt(st.nextToken());
			int point_y = Integer.parseInt(st.nextToken());
			for(int j=point_x; j<point_x+10; j++) {
				for(int k=point_y; k<point_y+10; k++) {
					arr[j][k] += 1;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==1) {
					area += arr[i][j];
				} else if(arr[i][j]>1) {
					area += arr[i][j]/arr[i][j];
				}
			}
		}
		
		System.out.println(area);
	}
}