package class4;

import java.awt.GraphicsDevice;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Practice4 {
	
	public static void main(String [] args) {
	
		
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * ﬁnal scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("please add you quiz score");
		int quiz=scn.nextInt();
		
		System.out.println("Please add you mid term score");
		int midTerm=scn.nextInt();
		
		System.out.println("Please add you final score");
		int finalScore=scn.nextInt();
		
		int avg=(quiz+midTerm+finalScore)/3;
		
		
		if (avg>=90) {
			System.out.println("Grade is A " +avg);
			
		}else if ( avg >=70  && avg<90) {
			
			System.out.println("Grade is B " +avg);
		}else if (avg>=50 && avg <70) {
			
			System.out.println("Grade is C "+avg);
		}else {
			System.out.println("Grade is F " +avg);
		}
		
		
		
	}

}
