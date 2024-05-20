import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n1_r = (n1%10*100)+(n1%100/10*10)+(n1/100);
		
		int n2 = sc.nextInt();
		int n2_r = (n2%10*100)+(n2%100/10*10)+(n2/100);
		
		System.out.println(n1_r>n2_r ? n1_r : n2_r);
	}
}