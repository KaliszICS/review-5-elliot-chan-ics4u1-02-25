import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = scan.nextDouble();
		System.out.println(Math.abs(num));
		
	}

	public static void q2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scan.nextDouble();
		System.out.print("Input another number: ");
		double num2 = scan.nextDouble();
		System.out.println(Math.floor(num1 / num2));
		System.out.println(Math.ceil(num1 / num2));
		
	}

	public static void q3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scan.nextDouble();
		System.out.println(Math.round(Math.sqrt(num1)));
		
	}

	public static void q4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scan.nextDouble();
		System.out.print("Input another number: ");
		double num2 = scan.nextDouble();
		System.out.println(Math.pow(num1, num2));
		
	}

	public static void q5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scan.nextDouble();
		System.out.print("Input another number: ");
		double num2 = scan.nextDouble();
		System.out.print("Input one more number: ");
		double num3 = scan.nextDouble();
		System.out.println(Math.max(num1, Math.max(num2, num3)));
		System.out.println(Math.min(num1, Math.min(num2, num3)));
		
		
	}
	public static void q6() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		System.out.println(sentence.contains("on"));
		
	}
	public static void q7() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String mango = scan.nextLine();
		System.out.println(mango.toLowerCase().equals("mango"));
		
	}
	public static void q8() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = scan.nextLine();
		System.out.print("Input a letter: ");
		String letter = scan.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
		
	}

	public static void q9() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		System.out.println("Your sentence is " + sentence.length() + " characters long");
		
	}
	public static void q10() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		System.out.print("Input a word to replace: ");
		String word = scan.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String replaceWord = scan.nextLine();

		System.out.println(sentence.replaceAll(word, replaceWord));

		
	}

	public static void q11() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		System.out.println(sentence.toUpperCase().trim());
		System.out.println(sentence.toLowerCase().trim());
		
	}

	public static void q12() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = scan.nextLine();
		System.out.println(word.substring(0, 4));
		System.out.println(word.substring(word.length() - 4, word.length()));
	}
	

}
