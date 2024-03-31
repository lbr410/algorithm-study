import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int resa = 0;
        int resb = 0;
        
        if(a>=0 && a<=23) {
            resa = a+((b+c)/60);
            resb = b+c;
            if(resa>23) {
                resa = resa-24;
            }
            if(b+c>59) {
                resb = (b+c)%60;
            }
        }
        System.out.println(resa);
        System.out.println(resb);
	}
}