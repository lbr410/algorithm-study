import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		if(x>=1 && y>=1) {
			result = 1;
		} else if(x<=-1 && y>=1) {
			result = 2;
		} else if(x<=-1 && y<=-1) {
			result = 3;
		} else if(x>=1 && y<=-1) {
			result = 4;
		}
		System.out.println(result);
	}
}