import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int k = 0;
		int sum = 0;
		
		for(int i=0; i<n.length(); i++) {
			k++;
			int num = 0;
			char c = n.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				num = c-'A'+10;
			} else {
				num = Integer.parseInt(Character.toString(c));
			}
			sum += (num*Math.pow(b, n.length()-k));
		}
		System.out.println(sum);
	}
}