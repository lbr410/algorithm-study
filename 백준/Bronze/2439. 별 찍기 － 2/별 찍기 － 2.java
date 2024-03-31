import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String star = "";
        
        for(int i=1; i<=n; i++) {
            String space = "";
            for(int j=0; j<n-i; j++) {
                space += " ";
            }
            star += "*";
            System.out.println(space+star+"");
        }
	}
}