
public class ConditionalStatement {

	public static void main(String[] args) {
		/*int val1=10;
		int val2=20;
		
		if(val1 < val2){
			System.out.println("Yes, True");
		}*/
		
		int score =91;
		String grade;
		
		if (score>90){
			grade="A";
		}
		else if(score>80){
			grade="B";
		}
		else{
			grade="C";
		}
			System.out.println("Score is:" +score);
			System.out.println("Grade is:" +grade);
	}

}
