q1.)

import java.util.*;
public class QuestionOne{

	public boolean find(int[] arr,int m,int k){
		if(arr[k]==m){
			return true;
		}
		else{
			if(k==0){return false;}
			return find(arr,m,--k);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		QuestionOne obj=new QuestionOne();
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int k=arr.length;
		System.out.println(obj.find(arr,m,--k));
	}
}
------------------------------------------------------------
q2.)

import java.util.*;

public class QuestionTwo{
	public int[] reverse(int[] arr,int[] rev,int n,int k){
		if(n==0){
			rev[k++]=arr[n];
			return rev;
		}
		else{	
			rev[k++]=arr[n];
			return reverse(arr,rev,--n,k);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		QuestionTwo obj=new QuestionTwo();
		int[] rev=new int[n];
		int k=0;
		rev=obj.reverse(arr,rev,--n,k);

		System.out.println("Reverse");
		for(int i=0;i<rev.length;i++){
			System.out.println(rev[i]);
		}
	}
}
-------------------------------------------------------------------
q3.)

import java.util.*;

public class QuestionThree{
	public int fib(int n,int a,int b){
		if(n==0){
			return a+b;
		}
		else{
			return fib(--n,b,a+b);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		QuestionThree obj=new QuestionThree();
		int a=0,b=1;
		n-=2;
		System.out.println("n position number -> "+obj.fib(--n,a,b));
	}
}
------------------------------------------------------------------------
q4.)

import java.util.*;

public class QuestionFour{
	public int pow(int x,int y){
		if(y==1){
			return x;
		}
		else{
			return x*pow(x,--y);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		QuestionFour obj=new QuestionFour();
		System.out.println("ANSWER -> "+obj.pow(x,y));
	}
}

----------------------------------------------------------------------------
q5.)

import java.util.*;

public class QuestionFive{
	public int sum(String s,int l){
		if(l==0){
			return Integer.parseInt(""+s.charAt(l));
		}
		else{
			return Integer.parseInt(""+s.charAt(l))+sum(s,--l);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		QuestionFive obj=new QuestionFive();
		int l=s.length();
		System.out.println("ANSWER -> "+obj.sum(s,--l));
	}
}
----------------------------------------------------------------------
q6.)

import java.util.*;

public class QuestionSix{
	public String removeDuplicate(String s,String ss,int i){
		if(i==(s.length()-1)){
			return ss+s.charAt(i);
		}
		else{
			if(s.charAt(i)!=s.charAt(i+1)){
				ss+=s.charAt(i);
			}
			return removeDuplicate(s,ss,++i);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		QuestionSix obj=new QuestionSix();
		String newString=new String();
		int l=(s.length());
		int i=0;
		System.out.println("ANSWER -> "+obj.removeDuplicate(s,newString,i));
	}
}
-----------------------------------------------------------------------
q7.)

import java.util.*;

public class QuestionSeven{
	public boolean brackets(String s,int i,char[] c,int top){
		if((s.charAt(i)==']'||s.charAt(i)==')'||s.charAt(i)=='}') || i==(s.length()-1)){
			if(( s.charAt(i)==')'&&c[top]=='(' ) || ( s.charAt(i)==']'&&c[top]=='[' ) || ( s.charAt(i)=='}'&&c[top]=='{' ) ){
				top--;
				return true;
				
			}
			else{
				return false;
			}
		}
		else{
			if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
				c[++top]=s.charAt(i);
			}
			return brackets(s,++i,c,top);
		}
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		QuestionSeven obj=new QuestionSeven();
		int i=0,top=-1;char[] c=new char[s.length()];
		System.out.println("ANSWER -> "+obj.brackets(s,i,c,++top));
	}
}
---------------------------------------------------------------------

