package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		
		MyChar myChar = new MyChar('B');
		System.out.println("Is " + myChar.getMyChar() + " a vowel? "  + myChar.isVowel());
		System.out.println("Is " + myChar.getMyChar() + " a consonant? " + myChar.isConsonant());
		System.out.println("Is " + myChar.getMyChar() + " a digit? " + myChar.isDigit());
		System.out.println("Is " + myChar.getMyChar() + " a thourgh z or A through Z? " + myChar.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		System.out.println();
		MyChar.printUpperCaseAlphabets();
	}

}
