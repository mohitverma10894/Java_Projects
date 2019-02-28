package String;

import java.util.Scanner;

class ReverseLogic{
	public static String reverse(String s1) {
		String []words=s1.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]);
			
		}
		return sb.toString().trim();
	}
}



public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String s1=sc.nextLine();
		System.out.println(ReverseLogic.reverse(s1));
		
		
	}

}
