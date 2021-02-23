package app.hervey.com;

public class Driver {
	
	public static void main(String[] args) {
		
		
		MyString myString = new MyString("ThIsTeXt");
		
		System.out.println(myString);
		
		MyString myString2 = new MyString("ThEsEtExTs");
		

		System.out.println(myString.someText);
		
		myString.makeLowerCase();
		
		System.out.println("Result of calling method that changes object to lower case:  " + myString);
		
		String returnString = myString2.returnlowerCase();
		System.out.println("Result of returning a string: " + returnString);
		
		MyNumber myNumber = new MyNumber(22);
		MyNumber myNumber2 = new MyNumber(44);
		
		myNumber.makeObjectDoubleNumber();
		
		System.out.println("Result of calling method that changes object to double Number " + myNumber.theNumber);
		
		Integer myInteger = myNumber2.getReturnedDoubleNumber();
		
		System.out.println("Result of returned doubled Number:  " + myInteger);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
