import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrCount = sc.nextInt();
		int arr[] = new int[arrCount];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
        Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[arrCount-1]);
	}
}