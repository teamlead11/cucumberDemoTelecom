package test;

public class Class10 extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class10 obj = new Class10();
		obj.calc();
	}

	public void calc() {
		calculateGrade(60);
		sendReport();
	}

	public void calculateGrade(int mark) {
		if (mark > 70) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}
