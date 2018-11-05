q1.)

import java.util.Scanner;
public class QuestionOne{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char[] c=s.toCharArray();
		String ss=new String();
		for(int i=s.length()-1;i>=0;i--){
			ss+=c[i];
		}
		if(s.equalsIgnoreCase(ss)){
			System.out.println("Palnindrome");
			}
		else{
			System.out.println("Not a Palnindrome");
			}
	}
}
----------------------------------------------------

q2.)

import java.util.Scanner;
public class QuestionTwo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String ss=new String();
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				ss+=Character.toLowerCase(s.charAt(i));
			}else{ss+=Character.toUpperCase(s.charAt(i));}
		}
		System.out.println(ss);
	}
}
----------------------------------------------------------------
q3.)

import java.util.Scanner;
public class QuestionThree{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char[] c=s.toCharArray();
		int[] a=new int[126];
		int count=0;
		char f=' ';
		for(int i=0;i<s.length();i++){
			a[s.charAt(i)]++;
			if(count<a[s.charAt(i)]){
				count=a[s.charAt(i)];
				//f=s.charAt(i);
			}
		}
		System.out.println("Character with highest frequencies -> ");
		for(int i=0 ;i<126;i++){
			if(a[i]>=count){System.out.println((char)i+" occured "+a[i]+" times");}
		}
		//System.out.println(f);
	}
}
----------------------------------------------------------------
q4.)

import java.util.Scanner;
public class QuestionFour{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for(int i=0;i<s.length();i++){
			for(int j=1;j<=s.length()-i;j++){
				System.out.println(s.substring(i,j+i));
			}
		}
	}
}