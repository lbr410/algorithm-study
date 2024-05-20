import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(int i='a'; i<='z'; i++) {
			int point = 0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j) == i) {
					System.out.print(j+" ");
					point++;
					break;
				}
			}
			if(point==0) {
				System.out.print(-1+" ");
			}
		}
	}
}