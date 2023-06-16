package com.accessmodifier;

public class TQPPstudent extends Student {

	public void checkStudentVariableAccess() {
		Student stud=new Student();
		stud.rollno = 101;
		stud.adno = 25;
		stud.age = 22;
		// stud.courseid=786;(private)

	}

}
