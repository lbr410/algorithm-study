import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        
        if(i==j && j==k) {
            res = 10000+(i*1000);
        } else if(i==j || j==k || i==k) {
            if(i==j || i==k) {
                res = 1000+(i*100);
            } else {
                res = 1000+(j*100);
            }
        } else if(i!=j && j!=k && i!=k) {
            int max = 0;
            max = i>j ? i : j;
            max = max>k ? max : k;
            res = max*100;
        }
        System.out.println(res);
	}
}