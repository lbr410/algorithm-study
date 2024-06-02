import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int j = str.length();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(j-1)) {
				j--;
			} else if(str.charAt(i)!=str.charAt(j-1)) {
				System.out.println(0);
				break;
			}
			
			if(j==0) {
				System.out.println(1);
			}
		}
	}
}