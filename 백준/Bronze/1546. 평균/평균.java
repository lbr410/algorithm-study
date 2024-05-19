import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double arr[] = new double[count];
		double m = 0;
		double sum = 0;
		
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(m<arr[i]) {
				m = arr[i];
			}
		}
		
		for(int i=0; i<count; i++) {
			arr[i] = arr[i]/m*100;
			sum += arr[i];
		}
		
		System.out.println(sum/count);
	}
}