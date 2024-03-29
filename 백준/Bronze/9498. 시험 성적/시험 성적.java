import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        String result = "";
        if(score>=0 && score<=100) {
            if(score>=90) {
                result = "A";
            } else if(score>=80) {
                result = "B";
            } else if(score>=70) {
                result = "C";
            } else if(score>=60) {
                result = "D";
            } else {
                result = "F";
            }
        }
        System.out.println(result);
	}
}