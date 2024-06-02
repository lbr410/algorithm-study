import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toUpperCase();
		int freq[] = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				freq[c-'A']++;
			}
		}
		
		int maxFreq = -1;
		char maxChar = ' ';
		boolean isDuplicate = false;
		
		for(int i=0; i<26; i++) {
			if(freq[i]>maxFreq) {
				maxFreq = freq[i];
				maxChar = (char)(i+'A');
				isDuplicate = false;
			} else if(freq[i]==maxFreq) {
				isDuplicate = true;
			}
		}
		
		if(isDuplicate) {
			System.out.println("?");
		} else {
			System.out.println(maxChar);
		}
	}
}