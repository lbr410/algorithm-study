import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int strlen = str.length();
		int count = 0;
		
		String croatian[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
				
		for(int i=0; i<croatian.length; i++) {
			int fromindex = 0;
			while(str.indexOf(croatian[i], fromindex) != -1) {
				strlen = strlen - croatian[i].length() + 1;
				fromindex = str.indexOf(croatian[i], fromindex) + croatian[i].length();
				if(croatian[i].equals("dz=")) {
					count++;
				}
			}
			if(str.contains(croatian[2]) && croatian[i] == croatian[7]) {
				strlen += count;
			}
		}
		System.out.println(strlen);
	}
}