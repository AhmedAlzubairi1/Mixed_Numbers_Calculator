import java.util.Scanner;
import java.math.BigInteger;

public class PizzaFracCalc {

	public static void main(String[] args) 
	{
		// TODO: Read the input from the user and call produceAnswer with an equation
		Scanner userInput = new Scanner (System.in);

		// have the code run until the user inputs quit
		String oneLine = userInput.nextLine();
		while (!oneLine.equals("quit")){
			String answer=  produceAnswer(oneLine);
			System.out.println(answer);
			System.out.println("Tell me another fraction, say quit if you want to quit");
			oneLine = userInput.nextLine();    	

		}
	}
	//print out answer by using a system out print for the produceAnswer for the previous declared and assigned
	// answer string


	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	//      e.g. input ==> "1/2 + 3/4"
	//        
	// The function should return the result of the fraction after it has been calculated
	//      e.g. return ==> "1_1/4"
	public static String produceAnswer(String input)
	{ 
		// TODO: Implement this function to produce the solution to the input
		// Takes the index of the space
		int firstSpace = input.indexOf(" ");


		//Take substring of 0 to the first space and store that as fist fraction
		String firstWord= input.substring(0,firstSpace);


		//Take and store the substring from the first space+1 to the end to cut out the first fraction form the word.

		String whatsLeft = input.substring(firstSpace + 1);
		//Take the index of the second space
		int secondSpace = whatsLeft.indexOf(" ");
		//Take and store the substring from the the stuff remainder of the original input string to the second space to store the operator
		String secondWord = whatsLeft.substring(0,secondSpace);

		//Find the last word by first isolating the remainding words to only one word using substring from second space
		String finalWord = whatsLeft.substring(secondSpace + 1);
		// Now you have stored both fractions and the operators 
		//Return the second fraction
		// return finalWord;
		//CHECK POINT 1 END
		//STARTCHECKPOINT 2
		// see if there is an "_" in your code
		// if there isnt  that means that whole number is 0
		// You can use if and else statements for this
		//then calculate the numerator which is before the / char
		//then calculate the denominator which is after the / char
		//work with the final word you got from check point 1
		String answer2 = "Nothing";
		String wholeNumber2;
		int dash2;
		String numerator2;
		String denominator2;
		int indexOfWhole2;
		String answer1 = "Nothing";
		String wholeNumber1;
		int dash1;
		String numerator1;
		String denominator1;
		int indexOfWhole1;
		if (finalWord.indexOf('_') == -1 && finalWord.indexOf('/')!=-1){
			wholeNumber2 = "0";
			dash2 = finalWord.indexOf('/');
			numerator2 = finalWord.substring(0, dash2);

			denominator2 = finalWord.substring(dash2+1);
			answer2 = wholeNumber2 + " "  + numerator2 + " "+ denominator2;



		}

		else if (finalWord.indexOf('_') != -1 )  {

			indexOfWhole2 = finalWord.indexOf('_');
			wholeNumber2 = finalWord.substring(0, indexOfWhole2);
			dash2 = finalWord.indexOf('/');
			numerator2 = finalWord.substring(indexOfWhole2+1, dash2);

			denominator2 = finalWord.substring(dash2+1);
			answer2 = wholeNumber2 + " "  + numerator2 + " "+ denominator2;



		}

		else {
			wholeNumber2 = finalWord;
			numerator2 = "0";
			denominator2 ="1";
			answer2 = "whole:" + wholeNumber2 + " " + "numerator:" + numerator2 + " "+ "denominator:" + denominator2;


		}



		if (firstWord.indexOf('_') == -1 && firstWord.indexOf('/')!=-1){
			wholeNumber1 = "0";
			dash1 = firstWord.indexOf('/');
			numerator1 = firstWord.substring(0, dash1);

			denominator1 = firstWord.substring(dash1+1);
			answer1 = wholeNumber1 + " "  + numerator1 + " "+ denominator1;



		}

		else if (firstWord.indexOf('_') != -1 )  {

			indexOfWhole1 = firstWord.indexOf('_');
			wholeNumber1 = firstWord.substring(0, indexOfWhole1);
			dash1 = firstWord.indexOf('/');
			numerator1 = firstWord.substring(indexOfWhole1+1, dash1);

			denominator1 = firstWord.substring(dash1+1);
			answer1 = wholeNumber1 + " "  + numerator1 + " "+ denominator1;



		}

		else {
			wholeNumber1 = firstWord;
			numerator1 = "0";
			denominator1 ="1";
			answer1 = "whole:" + wholeNumber1 + " " + "numerator:" + numerator1 + " "+ "denominator:" + denominator1 + " ";


		}




		// sense check point 2 gave me the numerator and denominator and whole number seperately , i could use that for calculations.
		//  I should use the exact same way i found those things for the second fraction for the first fraction.
		// now i should have information for the numerator, denominator and whole number of both fractions.
		//After doing this, use a huge if and else statements to determine the operations and to use
		// those operations in the fractons, you should use seperate methods for each to calculate it.
		//Make sure all the calculations are done correctly for both fractions
		// the final return should be a string of both the operation methods and the final produce answer method.
		// Helpful tip is if the numerators is 0 of the answer, then the answer would be 0.
		// the value can never be  improper,so dont use that.
		// Make code if statements that guarantee either one of the fractions to be the answer or the answer to be 0
		String FINALANSWER = "wrong";
		// Change all the factors in the numbers from a string into an integer so that you can work with it in the math.
		int numeratorOne = Integer.parseInt(numerator1)	;
		int numeratorTwo = Integer.parseInt(numerator2)	;
		int denominatorOne = Integer.parseInt(denominator1)	;
		int denominatorTwo = Integer.parseInt(denominator2)	;
		int wholeNumberOne = Integer.parseInt(wholeNumber1)	;
		int wholeNumberTwo = Integer.parseInt(wholeNumber2)	;
		int greatestCommonFactor;




		
		 if (denominatorOne == 0 || denominatorTwo == 0){
			FINALANSWER = "Can't divide by 0";
		}
		else if (secondWord.equals("/") && finalWord.equals("-1") ){
			if (firstWord.substring(0,1).equals("-")){
				int negative = firstWord.indexOf('-');
				FINALANSWER = firstWord.substring(negative + 1);
			}
			else {
				FINALANSWER = "-" + firstWord;
			}
		}
		else if ((secondWord.equals("+") || secondWord.equals("-")) && (firstWord.equals("0")|| finalWord.equals("0")) ){
			if ( secondWord.equals("+")){
			if (firstWord.equals("0")){
				if (wholeNumberTwo<0){
					numeratorTwo = (wholeNumberTwo*denominatorTwo)-numeratorTwo;
					int GCD = GCF (numeratorTwo,denominatorTwo);
					numeratorTwo = numeratorTwo / GCD;
					denominatorTwo = denominatorTwo / GCD;
					wholeNumberTwo = numeratorTwo / denominatorTwo;
					numeratorTwo = Math.abs(numeratorTwo) % Math.abs(denominatorTwo);
					if (numeratorTwo == 0 && wholeNumberTwo == 0 ){
						FINALANSWER = "0";
					}
					else if (numeratorTwo == 0){
						FINALANSWER = wholeNumberTwo + "";
					}
					else {
						FINALANSWER = wholeNumberTwo + "_" + numeratorTwo + "/" + Math.abs(denominatorTwo);
					}
				}
				else if (wholeNumberTwo>=0){
					numeratorTwo = (wholeNumberTwo*denominatorTwo)+numeratorTwo;
					int GCD = GCF (numeratorTwo,denominatorTwo);
					numeratorTwo = numeratorTwo / GCD;
					denominatorTwo = denominatorTwo / GCD;
					wholeNumberTwo = numeratorTwo / denominatorTwo;
					numeratorTwo = Math.abs(numeratorTwo) % Math.abs(denominatorTwo);
					if (numeratorTwo == 0 && wholeNumberTwo == 0 ){
						FINALANSWER = "0";
					}
					else if (numeratorTwo == 0){
						FINALANSWER = wholeNumberTwo + "";
					}
					else {
						FINALANSWER = wholeNumberTwo + "_" + numeratorTwo + "/" + Math.abs(denominatorTwo);
					}
				}
			}
			else if (finalWord.equals("0")){
				if (wholeNumberOne<0){
					numeratorOne = (wholeNumberOne*denominatorOne)-numeratorOne;
					int GCD = GCF (numeratorOne,denominatorOne);
					numeratorOne = numeratorOne / GCD;
					denominatorOne = denominatorOne / GCD;
					wholeNumberOne = numeratorOne / denominatorOne;
					numeratorOne = Math.abs(numeratorOne) % Math.abs(denominatorOne);
					if (numeratorOne == 0 && wholeNumberOne == 0 ){
						FINALANSWER = "0";
					}
					else if (numeratorOne == 0){
						FINALANSWER = wholeNumberOne + "";
					}
					else {
						FINALANSWER = wholeNumberOne + "_" + numeratorOne + "/" + Math.abs(denominatorOne);
					}
				}
				else if (wholeNumberOne>=0){
					numeratorOne = (wholeNumberOne*denominatorOne)+numeratorOne;
					int GCD = GCF (numeratorOne,denominatorOne);
					numeratorOne = numeratorOne / GCD;
					denominatorOne = denominatorOne / GCD;
					wholeNumberOne = numeratorOne / denominatorOne;
					numeratorOne = Math.abs(numeratorOne) % Math.abs(denominatorOne);
					if (numeratorOne == 0 && wholeNumberOne == 0 ){
						FINALANSWER = "0";
					}
					else if (numeratorOne == 0){
						FINALANSWER = wholeNumberOne + "";
					}
					else {
						FINALANSWER = wholeNumberOne + "_" + numeratorOne + "/" + Math.abs(denominatorOne);
					}
				}
			}
			}
			else if (secondWord.equals("-")){
				if (firstWord.equals("0")){
					if (wholeNumberTwo<0){
						numeratorTwo = (wholeNumberTwo*denominatorTwo)-numeratorTwo;
						int GCD = GCF (numeratorTwo,denominatorTwo);
						numeratorTwo = numeratorTwo / GCD;
						denominatorTwo = denominatorTwo / GCD;
						wholeNumberTwo = numeratorTwo / denominatorTwo;
						numeratorTwo = Math.abs(numeratorTwo) % Math.abs(denominatorTwo);
						if (numeratorTwo == 0 && wholeNumberTwo == 0 ){
							FINALANSWER = "0";
						}
						else if (numeratorTwo == 0){
							FINALANSWER = -1*wholeNumberTwo + "";
						}
						else {
							FINALANSWER = -1*wholeNumberTwo + "_" + numeratorTwo + "/" + Math.abs(denominatorTwo);
						}
					}
					else if (wholeNumberTwo>=0){
						numeratorTwo = (wholeNumberTwo*denominatorTwo)+numeratorTwo;
						int GCD = GCF (numeratorTwo,denominatorTwo);
						numeratorTwo = numeratorTwo / GCD;
						denominatorTwo = denominatorTwo / GCD;
						wholeNumberTwo = numeratorTwo / denominatorTwo;
						numeratorTwo = Math.abs(numeratorTwo) % Math.abs(denominatorTwo);
						if (numeratorTwo == 0 && wholeNumberTwo == 0 ){
							FINALANSWER = "0";
						}
						else if (numeratorTwo == 0){
							FINALANSWER = -1*wholeNumberTwo + "";
						}
						else {
							FINALANSWER = -1*wholeNumberTwo + "_" + numeratorTwo + "/" + Math.abs(denominatorTwo);
						}
					}
				}
				else if (finalWord.equals("0")){
					if (wholeNumberOne<0){
						numeratorOne = (wholeNumberOne*denominatorOne)-numeratorOne;
						int GCD = GCF (numeratorOne,denominatorOne);
						numeratorOne = numeratorOne / GCD;
						denominatorOne = denominatorOne / GCD;
						wholeNumberOne = numeratorOne / denominatorOne;
						numeratorOne = Math.abs(numeratorOne) % Math.abs(denominatorOne);
						if (numeratorOne == 0 && wholeNumberOne == 0 ){
							FINALANSWER = "0";
						}
						else if (numeratorOne == 0){
							FINALANSWER = wholeNumberOne + "";
						}
						else {
							FINALANSWER = wholeNumberOne + "_" + numeratorOne + "/" + Math.abs(denominatorOne);
						}
					}
					else if (wholeNumberOne>=0){
						numeratorOne = (wholeNumberOne*denominatorOne)+numeratorOne;
						int GCD = GCF (numeratorOne,denominatorOne);
						numeratorOne = numeratorOne / GCD;
						denominatorOne = denominatorOne / GCD;
						wholeNumberOne = numeratorOne / denominatorOne;
						numeratorOne = Math.abs(numeratorOne) % Math.abs(denominatorOne);
						if (numeratorOne == 0 && wholeNumberOne == 0 ){
							FINALANSWER = "0";
						}
						else if (numeratorOne == 0){
							FINALANSWER = wholeNumberOne + "";
						}
						else {
							FINALANSWER = wholeNumberOne + "_" + numeratorOne + "/" + Math.abs(denominatorOne);
						}
					}
				}
			}
		}
		else if (secondWord.equals("/") && firstWord.equals("-1") ){
			if (finalWord.substring(0,1).equals("-")){
				int negative = finalWord.indexOf('-');
				FINALANSWER = finalWord.substring(negative + 1);
			}
			else {
				FINALANSWER = "-" + finalWord;
			}
		}
		else if ((!secondWord.equals("*") && !secondWord.equals("/")) &&(numerator1.equals("0") && wholeNumber1.equals("0"))){
			// just in case one fraction is already 0 to make things quicker
			FINALANSWER = wholeNumber2 + "_" + numerator2 + "/" + denominator2 ;
		}
		else if (!secondWord.equals("*") && !secondWord.equals("/") && !secondWord.equals("-") && !secondWord.equals("+")){
			FINALANSWER = "Invalid Operation";
		}
		else  if (( secondWord.equals("/")) &&(numerator2.equals("0")&& wholeNumber2.equals("0"))){
			// just in case one fraction is already 0 to make things quicker
			FINALANSWER = "ERROR" ;
			//you can't divide by 0 , so answer is error.
		}
	
		else if ((secondWord.equals("*") || secondWord.equals("/")) &&(numerator1.equals("0") && wholeNumber1.equals("0"))){
			// just in case one fraction is already 0 to make things quicker
			FINALANSWER = "0";
		}
		else if ((secondWord.equals("*") || secondWord.equals("/")) &&(numerator2.equals("0") && wholeNumber2.equals("0"))){
			// just in case one fraction is already 0 to make things quicker
			FINALANSWER = "0";
		}
	
		else {
			if (secondWord.equals("*")){
				int numeratorFinal;
				int denominatorFinal;
				// have multiple senarios with either both or one fractions
				// of the fractions is negative
				if (wholeNumberOne>=0 && wholeNumberTwo>=0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)  +numeratorTwo;
					numeratorFinal = numeratorOne*numeratorTwo;
					denominatorFinal = denominatorOne*denominatorTwo;
				}
				else if (wholeNumberOne>=0 && wholeNumberTwo<0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (Math.abs(wholeNumberTwo)*denominatorTwo)  +numeratorTwo;
					numeratorTwo = numeratorTwo * -1;
					numeratorFinal = numeratorOne*numeratorTwo;
					denominatorFinal = denominatorOne*denominatorTwo;
				}
				else if (wholeNumberOne<0 && wholeNumberTwo>=0){
					numeratorOne = (Math.abs(wholeNumberOne)*denominatorOne)+ numeratorOne;
					numeratorOne = numeratorOne * -1;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)  +numeratorTwo;
					numeratorFinal = numeratorOne*numeratorTwo;
					denominatorFinal = denominatorOne*denominatorTwo;
				}

				else
				{
					numeratorOne = (Math.abs(wholeNumberOne)*denominatorOne)+ numeratorOne;
					numeratorOne = numeratorOne * -1;
					numeratorTwo = (Math.abs(wholeNumberTwo)*denominatorTwo)  +numeratorTwo;
					numeratorTwo = numeratorTwo * -1;				
					numeratorFinal = numeratorOne*numeratorTwo;
					denominatorFinal = denominatorOne*denominatorTwo;
				}

				greatestCommonFactor = GCF(numeratorFinal,denominatorFinal);
				numeratorFinal = numeratorFinal / greatestCommonFactor;
				denominatorFinal = denominatorFinal /greatestCommonFactor;
				int wholeNumberFinal = 0;

				if (Math.abs(denominatorFinal) == 1){
					FINALANSWER = numeratorFinal + "";
				}
				else if (Math.abs(numeratorFinal)==0){
					FINALANSWER = "0";
				}
				else if (Math.abs(denominatorFinal)>Math.abs(numeratorFinal)){
					FINALANSWER = numeratorFinal + "/" +  denominatorFinal;

				}
				else if  ( Math.abs(denominatorFinal) == Math.abs(numeratorFinal))
				{
					wholeNumberFinal = wholeNumberFinal + 1;

					FINALANSWER = wholeNumberFinal + "";
				}

				else  {
					wholeNumberFinal = numeratorFinal / denominatorFinal;

					numeratorFinal = numeratorFinal % denominatorFinal;
					FINALANSWER = wholeNumberFinal + "_" + Math.abs(numeratorFinal) + "/" + Math.abs(denominatorFinal);


				}
			}
			else if ( secondWord.equals("/")){
				int numeratorFinal;
				int denominatorFinal;
				if (wholeNumberOne>=0 && wholeNumberTwo>=0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)  +numeratorTwo;
					numeratorFinal = numeratorOne*denominatorTwo;
					denominatorFinal = denominatorOne*numeratorTwo;
				}
				else if (wholeNumberOne>=0 && wholeNumberTwo<0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (Math.abs(wholeNumberTwo)*denominatorTwo)  +numeratorTwo;
					numeratorTwo = numeratorTwo * -1;
					numeratorFinal = numeratorOne*denominatorTwo;
					denominatorFinal = denominatorOne*numeratorTwo;
				}
				else if (wholeNumberOne<0 && wholeNumberTwo>=0){
					numeratorOne = (Math.abs(wholeNumberOne)*denominatorOne)+ numeratorOne;
					numeratorOne = numeratorOne * -1;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)  +numeratorTwo;
					numeratorFinal = numeratorOne*denominatorTwo;
					denominatorFinal = denominatorOne*numeratorTwo;
				}

				else
				{
					numeratorOne = (Math.abs(wholeNumberOne)*denominatorOne)+ numeratorOne;
					numeratorOne = numeratorOne * -1;
					numeratorTwo = (Math.abs(wholeNumberTwo)*denominatorTwo)  +numeratorTwo;
					numeratorTwo = numeratorTwo * -1;				
					numeratorFinal = numeratorOne*denominatorTwo;
					denominatorFinal = denominatorOne*numeratorTwo;
				}

				greatestCommonFactor = GCF(numeratorFinal,denominatorFinal);
				numeratorFinal = numeratorFinal / greatestCommonFactor;
				denominatorFinal = denominatorFinal /greatestCommonFactor;
				int wholeNumberFinal = 0;

				if (Math.abs(denominatorFinal) == 1){
					FINALANSWER = numeratorFinal + "";
				}
				else if (Math.abs(numeratorFinal)==0){
					FINALANSWER = "0";
				}
				else if (Math.abs(numeratorFinal)< Math.abs(denominatorFinal)){
					if (denominatorFinal<0){
					FINALANSWER = -1*numeratorFinal + "/" + Math.abs(denominatorFinal);
					}
					else {
						FINALANSWER = numeratorFinal + "/" + denominatorFinal;
	
					}
				}
				else if  ( Math.abs(denominatorFinal) == Math.abs(numeratorFinal))
				{
					wholeNumberFinal = wholeNumberFinal + 1;

					FINALANSWER = wholeNumberFinal + "";
				}
			
				else  {
					
					wholeNumberFinal = numeratorFinal / denominatorFinal;

					numeratorFinal = numeratorFinal % denominatorFinal;
					
					FINALANSWER = wholeNumberFinal + "_" + Math.abs(numeratorFinal) + "/" + Math.abs(denominatorFinal);

					

				}



			}
			else if (secondWord.equals("-")){
				int initialdenominatorOne ;
				int initialdenominatorTwo ;
				int initialnumeratorOne ;
				int initialnumeratorTwo ;
				int numeratorFinal ;
				int DenominatorFinal ;
				if (wholeNumberOne>=0 && wholeNumberTwo>=0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)+ numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne - initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;

				}
				else if (wholeNumberOne>=0 && wholeNumberTwo<0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)- numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne - initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;

				}
				else if (wholeNumberOne<0 && wholeNumberTwo>=0){
					numeratorOne = (wholeNumberOne*denominatorOne)- numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)+ numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne - initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;
				}
				else {
					numeratorOne = (wholeNumberOne*denominatorOne)- numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)- numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne - initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;	
				}
				greatestCommonFactor = GCF(numeratorFinal,DenominatorFinal);
				numeratorFinal = numeratorFinal / greatestCommonFactor;
				DenominatorFinal = DenominatorFinal / greatestCommonFactor;
				int wholeNumberFinal = 0;
				if ( Math.abs(DenominatorFinal) == 1){
					FINALANSWER = numeratorFinal + "";
				}
				else if (Math.abs(numeratorFinal) == 0){
					FINALANSWER = "0";
				}
				
				
				
				
				
				/// edit this 
				else if (Math.abs(numeratorFinal)> Math.abs(DenominatorFinal)){
					wholeNumberFinal = numeratorFinal / DenominatorFinal;
					numeratorFinal =Math.abs(numeratorFinal) % Math.abs(DenominatorFinal);
					if (numeratorFinal == 0 ){
						FINALANSWER = wholeNumberFinal + "";
					}
					else {
						
					
					FINALANSWER = wholeNumberFinal + "_" +numeratorFinal + "/" + DenominatorFinal;
				
					}
					}
				else if (Math.abs(numeratorFinal)< Math.abs(DenominatorFinal)){
					if (DenominatorFinal<0){
					FINALANSWER = -1*numeratorFinal + "/" + Math.abs(DenominatorFinal);
					}
					else {
						FINALANSWER = numeratorFinal + "/" + DenominatorFinal;
	
					}
				}
			// edit this
			
			
			
			
			
			}
			else if (secondWord.equals("+")){
				int initialdenominatorOne ;
				int initialdenominatorTwo ;
				int initialnumeratorOne ;
				int initialnumeratorTwo ;
				int numeratorFinal ;
				int DenominatorFinal ;
				if (wholeNumberOne>=0 && wholeNumberTwo>=0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)+ numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne + initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;

				}
				else if (wholeNumberOne>=0 && wholeNumberTwo<0){
					numeratorOne = (wholeNumberOne*denominatorOne)+ numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)- numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne + initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;

				}
				else if (wholeNumberOne<0 && wholeNumberTwo>=0){
					numeratorOne = (wholeNumberOne*denominatorOne)- numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)+ numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne + initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;
				}
				else {
					numeratorOne = (wholeNumberOne*denominatorOne)- numeratorOne;
					numeratorTwo = (wholeNumberTwo*denominatorTwo)- numeratorTwo;
					initialdenominatorOne = denominatorOne*denominatorTwo;
					initialdenominatorTwo = denominatorTwo * denominatorOne;
					initialnumeratorOne = (initialdenominatorOne/denominatorOne) * numeratorOne;
					initialnumeratorTwo = (initialdenominatorTwo/denominatorTwo) * numeratorTwo;
					numeratorFinal = initialnumeratorOne + initialnumeratorTwo;
					DenominatorFinal = initialdenominatorTwo;	
				}
				greatestCommonFactor = GCF(numeratorFinal,DenominatorFinal);
				numeratorFinal = numeratorFinal / greatestCommonFactor;
				DenominatorFinal = DenominatorFinal / greatestCommonFactor;
				int wholeNumberFinal = 0;
				if ( Math.abs(DenominatorFinal) == 1){
					FINALANSWER = numeratorFinal + "";
				}
				else if (Math.abs(numeratorFinal) == 0){
					FINALANSWER = "0";
				}
				else if (Math.abs(numeratorFinal)> Math.abs(DenominatorFinal)){
					wholeNumberFinal = numeratorFinal / DenominatorFinal;

					numeratorFinal = numeratorFinal % DenominatorFinal;
					
						FINALANSWER = wholeNumberFinal + "_" + Math.abs(numeratorFinal) + "/" + Math.abs(DenominatorFinal);

					
				}
				else if (Math.abs(numeratorFinal)< Math.abs(DenominatorFinal)){
					if (DenominatorFinal<0){
					FINALANSWER = -1*numeratorFinal + "/" + Math.abs(DenominatorFinal);
					}
					else {
						FINALANSWER = numeratorFinal + "/" + DenominatorFinal;
	
					}
				}
			}		}
		if (FINALANSWER.indexOf('_')!=-1){
			 int _ = FINALANSWER.indexOf('_');
			 if (FINALANSWER.substring(_+1,_+2).equals("0")){
				 FINALANSWER = FINALANSWER.substring(0,_);
			 }
		}
		/*if (FINALANSWER.indexOf('_')!=-1){
			 int baddy = FINALANSWER.indexOf('_');
			 String NegativeWhole = FINALANSWER.substring(0,baddy);
			 int WholeNumber = Integer.parseInt(NegativeWhole);
			 int dashcurrent = FINALANSWER.indexOf('/');
			 String Numerator = FINALANSWER.substring(baddy+1,dashcurrent);
			 int NumeratorNumber = Integer.parseInt(Numerator);
			 String Denominator = FINALANSWER.substring(dashcurrent+1);
			 int DenominatorNumber = Integer.parseInt(Denominator);
			 int greatestcommon = GCF(NumeratorNumber,DenominatorNumber);
			 NumeratorNumber = NumeratorNumber / greatestcommon;
			 DenominatorNumber = DenominatorNumber / greatestcommon;
			 FINALANSWER = WholeNumber + "_" + NumeratorNumber / DenominatorNumber;



		}
		*/
		
		
		return FINALANSWER;

	}
	private static int GCF(int a, int b){
		BigInteger b1= BigInteger.valueOf(a);
		BigInteger b2 = BigInteger.valueOf(b);
		BigInteger gcd = b1.gcd(b2);
		return gcd.intValue();
	}
}

// issue with adding with  a 0, it doesnt simplify, you should have a final 
// code before returnng final answer that further checks for a fraction 
// and then simplifies, remember simplifiying is different depending on if
// it is negative or positive.  FIX DAT FAMMMMM!!!!






/*
if ((!secondWord.equals("*") && !secondWord.equals("/")) &&((numerator1.equals("0") && wholeNumber1.equals("0"))|| firstWord.equals("0"))){
	// just in case one fraction is already 0 to make things quicker
	greatestCommonFactor = GCF(numeratorTwo,denominatorTwo);
	numeratorTwo = numeratorTwo / greatestCommonFactor;
	denominatorTwo = denominatorTwo /greatestCommonFactor;
	if(wholeNumberTwo<0){
		wholeNumberTwo = Math.abs(numeratorTwo) / Math.abs(denominatorTwo) - wholeNumberTwo;
		numeratorTwo = Math.abs(numeratorTwo) % Math.abs(denominatorTwo);
		if (numeratorTwo != 0){
		FINALANSWER = wholeNumberTwo + "_" + Math.abs(numeratorTwo) + "/" + Math.abs(denominatorTwo);
		}
		else {
			FINALANSWER = wholeNumberTwo + "";
		}

	}
	else{
	if (numeratorTwo == 0){
		FINALANSWER = wholeNumberTwo + "";

	}
	else{
	FINALANSWER = wholeNumberTwo + "_" + numeratorTwo + "/" + denominatorTwo ;
	}
	}
	}
else  if ((!secondWord.equals("*") && !secondWord.equals("/")) &&(finalWord.equals("0")||(numerator2.equals("0")&& wholeNumber2.equals("0")))){
	// just in case one fraction is already 0 to make things quicker
	greatestCommonFactor = GCF(numeratorOne,numeratorTwo);
	numeratorOne = numeratorOne / greatestCommonFactor;
	denominatorOne = denominatorOne /greatestCommonFactor;
	if(wholeNumberOne<0){
		wholeNumberOne = Math.abs(numeratorOne) / Math.abs(denominatorOne) - wholeNumberOne;
		numeratorOne = Math.abs(numeratorOne) % Math.abs(denominatorOne);
		if (numeratorOne != 0){
		FINALANSWER = wholeNumberOne + "_" + Math.abs(numeratorOne) + "/" + Math.abs(denominatorOne);
		}
		else {
			FINALANSWER = wholeNumberOne + "";
		}

	}
	else{
	if (numeratorOne == 0){
		FINALANSWER = wholeNumberOne + "";

	}
	else{
	FINALANSWER = wholeNumberOne + "_" + numeratorOne + "/" + denominatorOne ;
	}
	}}
*/