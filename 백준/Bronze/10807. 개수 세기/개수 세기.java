import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrCount = sc.nextInt();
		int arr[] = new int[arrCount];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int num = sc.nextInt();
		int aa = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				aa++;
			}
		}
		System.out.println(aa);
	}
}