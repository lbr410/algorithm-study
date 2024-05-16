import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		boolean students[] = new boolean[31];
		
		for(int i=0; i<28; i++) {
			int submitted = Integer.parseInt(br.readLine());
			students[submitted] = true;
		}
		
		for(int i=1; i<=30; i++) {
			if(!students[i]) {
				System.out.println(i);
			}
		}
	}
}