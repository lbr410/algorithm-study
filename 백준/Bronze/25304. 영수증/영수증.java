import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            res = res+(a*b);
        }
        if(x==res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}