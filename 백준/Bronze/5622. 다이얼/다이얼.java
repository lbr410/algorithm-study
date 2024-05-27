import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dial = sc.nextLine();
		int sec = 0;
		for(int i=0; i<dial.length(); i++) {
			switch(dial.charAt(i)) {
			case 'A':
            case 'B':
            case 'C':
                sec = sec+3; break;
            case 'D':
            case 'E':
            case 'F':
                sec = sec+4; break;
            case 'G':
            case 'H':
            case 'I':
                sec = sec+5; break;
            case 'J':
            case 'K':
            case 'L':
                sec = sec+6; break;
            case 'M':
            case 'N':
            case 'O':
                sec = sec+7; break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                sec = sec+8; break;
            case 'T':
            case 'U':
            case 'V':
                sec = sec+9; break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                sec = sec+10; break;
			}
		}
		System.out.println(sec);
	}
}