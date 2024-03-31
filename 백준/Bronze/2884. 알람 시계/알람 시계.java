import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int resh = 0;
        int resm = 0;
        if(h>=0 && h<=23) {
            if(m>=45 && m<=59) {
                resh = h;
                resm = m-45;
            } else if(m<45 && m>=0) {
                if(h==0) {
                    resh = 23;
                } else {
                    resh = h-1;
                }
                resm = 60-(45-m);
            }
        }
        System.out.println(resh);
        System.out.println(resm);
	}
}