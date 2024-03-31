import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n%4==0) {
            for(int i=0; i<n; i+=4) {
                System.out.println("long");
                if(i==(n-4)) {
                    System.out.println("int");
                }
            }
        }
	}
}