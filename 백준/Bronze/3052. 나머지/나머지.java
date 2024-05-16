import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int remain[] = new int[10];
		int different = 0;
		
		for(int i=0; i<remain.length; i++) {
			remain[i] = Integer.parseInt(br.readLine())%42;
		}
		
		for(int i=0; i<remain.length; i++) {
			int count = 1;
			for(int j=0; j<remain.length; j++) {
				if(i>j && remain[i] == remain[j]) {
					count = 0;
					break;
				}
			}
			if(count>=1) {
				different++;
			}
		}
		System.out.println(different);
	}
}