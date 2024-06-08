import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double scoreSum = 0;
		double gradeSum = 0;
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			st.nextToken();
			Double score = Double.parseDouble(st.nextToken());
			scoreSum += score;
			
			String grade = st.nextToken();
			if(grade.equals("A+")) {
				gradeSum += score*4.5;
			} else if(grade.equals("A0")) {
				gradeSum += score*4.0;
			} else if(grade.equals("B+")) {
				gradeSum += score*3.5;
			} else if(grade.equals("B0")) {
				gradeSum += score*3.0;
			} else if(grade.equals("C+")) {
				gradeSum += score*2.5;
			} else if(grade.equals("C0")) {
				gradeSum += score*2.0;
			} else if(grade.equals("D+")) {
				gradeSum += score*1.5;
			} else if(grade.equals("D0")) {
				gradeSum += score*1.0;
			} else if(grade.equals("F")) {
				gradeSum += score*0.0;
			} else if(grade.equals("P")) {
				scoreSum -= score;
			}
		}
		System.out.printf("%.6f%n", Math.ceil((gradeSum/scoreSum)*1000000)/1000000);
	}
}