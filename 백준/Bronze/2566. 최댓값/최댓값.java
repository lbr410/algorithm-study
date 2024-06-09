import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int row = 0;
		int column = 0;
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			for(int j=0; j<9; j++) {
				int val = Integer.parseInt(st.nextToken());
				if(val>=max) {
					max = val;
					row = i+1;
					column = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row+" "+column);
	}
}