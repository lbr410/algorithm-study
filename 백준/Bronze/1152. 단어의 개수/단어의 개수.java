import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int word = 0;
		while(st.hasMoreTokens()) {
			word++;
			st.nextToken();
		}
		System.out.println(word);
	}
}