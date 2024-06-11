import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char arr[][] = new char[5][15];
		String res = "";
		for(int i=0; i<5; i++) {
			String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(arr[j][i] == '\u0000') {
					res += "";
				} else {
					res += arr[j][i];
				}
			}
		}
		
		System.out.println(res);
	}
}