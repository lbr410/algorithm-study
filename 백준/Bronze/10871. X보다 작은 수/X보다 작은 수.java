import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrCount = sc.nextInt();
		int num = sc.nextInt();
		int arr[] = new int[arrCount];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(num>arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}
}