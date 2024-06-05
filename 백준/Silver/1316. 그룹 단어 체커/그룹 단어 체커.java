import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int group = n;
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			int brk = 0;
			for(int j=0; j<str.length(); j++) {
				int count = 0;
				if(brk>0) {
					brk = 0;
					break;
				}
				for(int k=0; k<str.length(); k++) {
					if(brk>0) {
						break;
					}
					if(str.charAt(j)==str.charAt(k)) {
						count++;
					}
					if(k!=0) {
						if(count>1 && j!=k && str.charAt(j)!=str.charAt(k-1) && str.charAt(j)==str.charAt(k)) {
							group--;
							brk++;
							break;
						}
					}
				}
			}
		}
		System.out.println(group);
	}
}