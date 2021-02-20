package assinments;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
	public static void main (String[] args){

		String student1 = "Bob";
		String student2 = "Tom";
		String student3 = "Ken";
		String student4 = "David";
		String student5 = "Ben";
		String student6 = "Jen";
		String student7 = "Eshmat";

		// An array is a data structure,which can store a fixed-sizes collection of elemnts of the same data type
		// An array is used to store a collection of data,but it is often more useful to think of an array as a
		// collection of variables of the same type.

		// In this example below, we have an array of String elements.First we need to define a type just like we do
		// for regular variables.Than we put[] to mean that it is going to be an array(group of elements).
		// then we can store each item in inside {} (body)

		//1.simplest way to create a string array.Directly initializing
		String[] javaFolks = {"Diyorbek","Maya","Natella","Tomi","Yuliya","Golib"};
		// to get the length of an array,use array.length
		int numberOfStudents = javaFolks.length;

		System.out.println("We have" + numberOfStudents + "Java programmers");

		//2.second approach of creating an array by specifiying the size.
		//String[] pythonFolks = new String[10];
		//pythonFolks[0] = "Jack";
		//pythonFolks[1] = "Mary";
		//pythonFolks[2] = "Linda";
		//pythonFolks[3] = "Peter";
		//pythonFolks[4] = "JBob";

		//System.out.println(pythonFolks[pythonFolks.length-1]);

		String[] pythonFolks = new String[10];
		pythonFolks[0] = "Jack";
		pythonFolks[1] = "Mary";
		pythonFolks[2] = "Linda";
		pythonFolks[3] = "Peter";
		pythonFolks[4] = "Bob";
		System.out.println(pythonFolks [4]);
		// exercise:create a String array called actors with the size of 3 and fill in this array with String elements:
		//you can use either approach.

		String[] actors = { "Tom Cruise", "Justin Beiber", "Peter Parker"};
		String[] actors2 = new String[3];
		actors2[0] = "TOm";
		actors2[1] = "Kevin";
		actors2[2] = "Oliver";
		// creating arrays with other data types (primitive types)
		// insertion order with arrays will be saved.whichever first element you insert will saved at its location
		int[] scores = {50,60,44,87,55,77};

		System.out.println(Arrays.toString(scores));
		int lastInt = scores[scores.length-1];
		System.out.println(lastInt);

		int marks[] = {1,2,3};
		byte m1= (byte)marks[0]; //marks[0] is returning an individual element of int type
		int markTwo = marks[1];
		int markThree = marks[2];
		String markTwoStr = marks[1] + ""; // "2"
		String markThreeStr = String.valueOf(marks[2]);
		//double array
		double[] prices = {223.88, 66.90, 10};
		//long array
		long longNums[] = new long[2];
		longNums[0] = 1544542L;
		longNums[1] = 434345L;
		//char array
		char[] genders = {'M','F','U','O'};
		String name2 = "Peter"; //                                                     Peter.toLowerCase()-> peter.startsWith("p") =true               
		boolean[] conditions = {true,true,false,true,(6 < 9),"abc".equals("def"), 67-12 < 100, name2.toLowerCase().startsWith("p")};
		System.out.println(Arrays.toString(conditions));
		boolean lastElement = conditions[conditions.length-1];
		System.out.println(lastElement);

			 
			String s1="I love java"; 
			String replaceString=s1.replace('o','o'); 
			System.out.println(replaceString); 
}


}