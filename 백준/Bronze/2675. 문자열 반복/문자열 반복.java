import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int r = Integer.parseInt(st.nextToken());
			String result = "";
			String s = st.nextToken();
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					result += s.charAt(j);
				}
			}
			System.out.println(result);
		}
	}
}