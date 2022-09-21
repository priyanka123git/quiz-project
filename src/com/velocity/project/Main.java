package com.velocity.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Quiz q=new Quiz();
		q.logic();
		
	}

}
class Quiz{
	Scanner sc = new Scanner(System.in);
	int correctAnsCount=0;
	int worngAnsCount=0;
	//logic implementation
	
	public void logic() {
		
		
		
		MultipleChoiceQuestion q1 = new MultipleChoiceQuestion(Question:"1. Who invented java programming?",option1:"a.Guido van Rossum",option2:"b.James Gosling",option3:"c.Dennis Richie",option4:"d.Bjarne Stroustrup ");
		MultipleChoiceQuestion q2 = new MultipleChoiceQuestion(question:"2. Which one of the following is not a java feature?",option1:"a.Object-Oriented",option2:"b.Use of pointers",option3:"c.Portable",option4:"d.Dynamic and extensible");
		MultipleChoiceQuestion q3 = new MultipleChoiceQuestion(question:"3. What is the extension of java code files?",option1:"a. .js",option2:"b. .txt",option3:"c. .class ",option4:"d. .java");
		MultipleChoiceQuestion q4 = new MultipleChoiceQuestion(question:"4. Which of the following is not an OOPS concept in java?",option1:"a.polymorphism",option2:"b. inheritance",option3:"c.compilation",option4:"d.encapsulation");	
		MultipleChoiceQuestion q5 = new MultipleChoiceQuestion(question:"5. What is Truncation in java?",option1:"a.Floating-point value assigned to a floating type",option2:"b.Floating-point value assigned to a integer type ",option3:"c.Integer value assigned to floating type",option4:"d.none");
		MultipleChoiceQuestion q6 = new MultipleChoiceQuestion(question:"6. Which exception is thrown when java is out of memory?",option1:"a.MemoryError",option2:"b.OutOfMemoryError",option3:"c.MemoryOutOfBoundsException",option4:"d. MemoryFullException");
		MultipleChoiceQuestion q7 = new MultipleChoiceQuestion(question:"7. Which of these are selection statements in java?",option1:"a.break",option2:"b.continue",option3:"c.for()",option4:"d.if()");
		MultipleChoiceQuestion q8 = new MultipleChoiceQuestion(question:"8. Which of the following is a superclass of every calss in java?",option1:"a.ArrayList",option2:"b.Abstract Class",option3:"c.Object Class ",option4:"d.String");
		MultipleChoiceQuestion q9 = new MultipleChoiceQuestion(question:"9. Which of these packages contains the exception Stack Overflow in java?",option1:"a.java.io",option2:"b.java.system",option3:"c.java.lang  ",option4:"d.java.util");
		MultipleChoiceQuestion q10 = new MultipleChoiceQuestion(question:"10. Which one of the following is not an access modifier?",option1:"a.Protected",option2:"b.Void ",option3:"c.Public",option4:"d.Private");
		Map<Questions,Character> hmap = new HashMap<>();
		hmap.put(q1,'b');
		hmap.put(q2,'b');
		hmap.put(q3,'d');
		hmap.put(q4,'c');
		hmap.put(q5,'b');
		hmap.put(q6,'b');
		hmap.put(q7,'d');
		hmap.put(q8,'c');
		hmap.put(q9,'c');
		hmap.put(q10,'b');
		for(Map.Entry<Questions,Character>map:hmap.entry()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getQuestion1());
			System.out.println(map.getKey().getQuestion2());
			System.out.println(map.getKey().getQuestion3());
			System.out.println(map.getKey().getQuestion4());
			System.out.println(map.getKey().getQuestion5());
			System.out.println(map.getKey().getQuestion6());
			System.out.println(map.getKey().getQuestion7());
			System.out.println(map.getKey().getQuestion8());
			System.out.println(map.getKey().getQuestion9());
			System.out.println(map.getKey().getQuestion10());
			System.out.println("enter your answer");
			Character ans = sc.next().charAt(0);
			int cans=Character.compare(ans,map.getValue());
			if(cans==0) {
				System.out.println("correct");
			}else {
				System.out.println("wrong");
				wrongAnsCount++;
			}
			System.out.println();
			System.out.println("--------result-----------");
			System.out.println("total questions:"+hmap.size());
			System.out.println("correct anwerd questions:"+correctAnsCount);
			System.out.println("wrong answerd questions:"+correctAnsCount);
			System.out.println("percentege:"+(100*correctAnsCount)/hmap.size());
			
			
			
			
			
			
			
			
			
		}
		
		

		
	}
}
