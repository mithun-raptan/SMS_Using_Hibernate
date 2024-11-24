package com.jsp.view;

import java.util.Scanner;

import com.jsp.model.Student;
import com.jsp.conroller.StudentController;

public class StudentView {
	static Scanner sc = new Scanner(System.in);

	private static Student getStudentObject() {
		System.out.println("enter student rollno : ");
		int rollno = sc.nextInt();
		System.out.println("enter student name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("enter student gmail: ");
		String gmail = sc.nextLine();
		System.out.println("enter student dob : ");
		String dob = sc.nextLine();
		System.out.println("enter student address : ");
		String address = sc.nextLine();
		System.out.println("enter student careof name : ");
		String careOf = sc.nextLine();

		Student s = new Student();
		s.setRollno(rollno);
		s.setName(name);
		s.setGmail(gmail);
		s.setDob(dob);
		s.setAddress(address);
		s.setCareOf(careOf);

//		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		System.out.println("welcome to student management system app");
		StudentController stc = new StudentController();

		while (true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. save student");
			System.out.println("2. find student by rollno");
			System.out.println("3. update student by rollno");
			System.out.println("4. delete student by rollno");
			System.out.println("5. find all students");
			System.out.println("6. exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student s = getStudentObject();
				stc.saveStudent(s);
				break;

			case 2:
				System.out.println("enter the roll no :");
				int roll = sc.nextInt();
				stc.findByRollNo(roll);
				break;
				
			case 3:
				System.out.println("enter the roll no :");
				int rollno = sc.nextInt();
				System.out.println("enter new name: ");
				sc.nextLine();
				String newname = sc.nextLine();
				stc.updatebyRollNo(rollno,newname);
				break;
				
			case 4:
				System.out.println("enter the roll no :");
				int no = sc.nextInt();
				stc.deleteByRollNo(no);
				break;
			
			case 5:
				stc.findAll();
				break;
				
			case 6:
				System.out.println("thank you for using this app");
				return;
				

			}
		}
	}
}
