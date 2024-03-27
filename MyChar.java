package com.in28minutes.primitive.datatypes;

public class MyChar {
	
	private char myChar;

	public MyChar(char myChar) {
		this.myChar = myChar;
	}

	
	
	public char getMyChar() {
		return myChar;
	}



	public void setMyChar(char myChar) {
		this.myChar = myChar;
	}



	public boolean isVowel() {
		if(myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' ||
				myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U') {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean isConsonant() {
		
		if (!isVowel()) {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if(myChar >= 48 && myChar <=57) {
			return true;
		}	
		return false;
	}

	public boolean isAlphabet() {
		// myChar between 'a' and 'z' also myChar between 'A' and 'Z'
		if((myChar >= 65 && myChar <= 90) || (myChar >= 97 && myChar <= 122)) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		
	}

	public static void printUpperCaseAlphabets() {
		
	}
	
	

}
