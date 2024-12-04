package else_if_ladder_statement;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter score");
		int score = scan.nextInt();
		
		Grades g1 = new Grades();
		g1.getGrades(score);
		// TODO Auto-generated method stub

	}

}
