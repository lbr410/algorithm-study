import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<t; i++) {
			String s = sc.nextLine();
			System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
		}
	}
}