import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String tab = " ";
		String star = "*";
		for(int i=1; i<=n; i++) {
			System.out.println(tab.repeat(n-i)+star.repeat(i*2-1));
		}
		
		for(int i=n-1; i>=1; i--) {
			System.out.println(tab.repeat(n-i)+star.repeat(i*2-1));
		}
	}
}