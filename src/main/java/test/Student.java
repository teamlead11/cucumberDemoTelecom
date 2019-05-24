package test;

public class Student {

	public void calculateGrade(int mark,int attendance) {
		if (mark > 50) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public void sendReport() {
		System.out.println("logic to send report");
	}

}
