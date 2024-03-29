import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = "";
		if(a>b) {
			result = ">";
		} else if(a<b) {
			result = "<";
		} else if(a==b) {
			result = "==";
		}
		System.out.println(result);
	}
}