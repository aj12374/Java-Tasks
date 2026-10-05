package Pack1;
import java.util.*;
public class Student_Result {
	public void Student_Inputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String name = sc.next();
		System.out.println("Enter Java Marks :");
		int java_marks = sc.nextInt();
		System.out.println("Enter Python Marks :");
		int python_marks = sc.nextInt();
		System.out.println("Enter JavaScript Marks :");
		int javaScript_marks = sc.nextInt();
		System.out.println("Enter Html Marks :");
		int html_marks = sc.nextInt();
		System.out.println("Enter CSS Marks :");
		int css_marks = sc.nextInt();
		System.out.println();
		System.out.println();
		int result= java_marks+python_marks+javaScript_marks+html_marks+css_marks;
		
		System.out.println("Name :"+name);
		System.out.println("Total:"+result);
		int avg = result/5;
		System.out.println("Average:"+avg);
		if(80<avg) {
			System.out.println("Grade :A");
		}
		else if(70<avg) {
			System.out.println("Grade :B");
		}
		else if(50<avg) {
			System.out.println("Grade :C");
		}
		else if(35<avg) {
			System.out.println("Grade :D");
		}
		else {
			System.out.println("Grade :F");
		}
		
		 if(result<=175) {
			System.out.println("Result :Fail");
		 }
		 else {
			 System.out.println("Result : Pass");
		 }
	
	}
	public static void main(String args[]) {
		Student_Result obj = new Student_Result();
		obj.Student_Inputs();
	}

}
