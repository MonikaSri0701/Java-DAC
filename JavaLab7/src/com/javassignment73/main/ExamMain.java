package com.javassignment73.main;

public class ExamMain {
	public static void main(String[] args) {

		Exam ref = new Exam();
		ref.examattended();
		TheoryExam ref1 = new TheoryExam();
		ref1.examattended();
		TheoryAndLabExam ref2 = new TheoryAndLabExam();
		ref2.examattended();
	}
}
