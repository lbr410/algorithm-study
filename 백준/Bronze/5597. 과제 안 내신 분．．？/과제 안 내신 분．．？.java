import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[28];
		int arr2[] = new int[30];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = i+1;
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr2[i] == arr[j]) {
					arr2[i] = 0;
					break;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] != 0) {
				System.out.println(arr2[i]);
			}
		}
	}
}