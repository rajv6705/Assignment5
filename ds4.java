q1.)

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){	
		this.data=data;
	}
	public String toString(){
		return ""+data;
	}
}
public class QuestionOne{
	Node head;
	Node tail;
	public void insert(int data){
		Node temp=new Node(data);
		temp.next=null;
		if(head == null){
			head=temp;
			tail=head;
		}else{
			tail.next=temp;
			tail=temp;
		}
	}
	public void print(){
		Node ptr=head;
		while(ptr!=null){
			System.out.print(ptr+"	");
			ptr=ptr.next;
		}
	}
	public void swap(int a,int b){
		int i=0;
		Node ptr=head;
		Node ptr1=null;
		Node ptr2=null;
		while(ptr.next!=null){
			if(i==a){
				ptr1=ptr;
			}
			if(i==b){
				ptr2=ptr;
			}
			++i;
			ptr=ptr.next;
		}
		int temp=ptr1.data;
		ptr1.data=ptr2.data;
		ptr2.data=temp;
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		QuestionOne obj=new QuestionOne();
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			obj.insert(scan.nextInt());
		}
		System.out.println("Enter position to swap ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		obj.swap(a,b);
		obj.print();
	}
}
----------------------------------------------------------
q2.)

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
	public String toString(){
		return ""+data;
	}
}

public class QuestionTwo{
	Node head;
	Node tail;
	void insert(int t){
		Node temp=new Node(t);
		if(head==null){
			head=temp;
			tail=head;
		}
		else{
			tail.next=temp;
			tail=temp;
			
		}
	}
	void insert_beg(int t){
		Node temp=new Node(t);
		temp.next=head;	
		head=temp;
	}
	void print(){
		Node temp=head;
		while(temp!=tail.next){
			System.out.print(temp+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	void removeDup(){
		Node ptr=head;
		Node pre=head;
		while(ptr.next!=null){
			
			if((ptr).data==(ptr.next).data){
				ptr.next=(ptr.next).next;
				ptr=pre;
				if(ptr!=head){
					pre=ptr;
					ptr=ptr.next;
				}
			}
			else{
			pre=ptr;
			ptr=ptr.next;
			}
		}
	}
	public static void main(String[] args){
		QuestionTwo ob=new QuestionTwo();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		ob.print();
		ob.removeDup();
		System.out.println("====================REMOVING DUPLICATES======================");
		ob.print();
	}
}
---------------------------------------------------------------------
q3.)

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
	public String toString(){
		return ""+data;
	}
}

public class QuestionThree{
	Node head;
	Node tail;
	void insert(int t){
		Node temp=new Node(t);
		if(head==null){
			head=temp;
			tail=head;
		}
		else{
			tail.next=temp;
			tail=temp;
			
		}
	}
	void insert_beg(int t){
		Node temp=new Node(t);
		temp.next=head;	
		head=temp;
	}
	void print(){
		Node temp=head;
		try{
			while(temp!=tail.next){
				System.out.print(temp+" ");
				temp=temp.next;
			}
		}
		catch(Exception e){
			System.out.println("Linked List is Empty!!!!");
		}
		System.out.println();
	}

	public void merge(QuestionThree obj2){
		
		
		(this.tail).next=obj2.head;
		(this.tail)=obj2.tail;	
	
	}
	public QuestionThree scanning(){
		QuestionThree ob=new QuestionThree();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		return ob;			
	}

	public static void main(String[] args){
		QuestionThree ob=new QuestionThree();
		QuestionThree obj1=ob.scanning();
		QuestionThree obj2=ob.scanning();
		obj1.print();
		obj2.print();
		obj1.merge(obj2);
		System.out.println("====================AFTER MERGING======================");
		obj1.print();
	}
}
---------------------------------------------------------------------
q4.)

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
	public String toString(){
		return ""+data;
	}
}

public class QuestionFour{
	Node head;
	Node tail;
	void insert(int t){
		Node temp=new Node(t);
		if(head==null){
			head=temp;
			tail=head;
		}
		else{
			tail.next=temp;
			tail=temp;
			
		}
	}
	void insert_beg(int t){
		Node temp=new Node(t);
		temp.next=head;	
		head=temp;
	}
	void print(){
		Node temp=head;
		while(temp!=tail.next){
			System.out.println(temp);
			temp=temp.next;
		}
	}
	void palindrome(QuestionFour obj){
		Node ptr=head;
		Node ptr2=obj.head;
		int f=0;
		while(ptr!=null){
			if(ptr.data!=ptr2.data){
				f=1;
				break;
			}
			ptr=ptr.next;
			ptr2=ptr2.next;
		}
		if(f==0){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
	QuestionFour reverse(){
		Node ptr=head;
		QuestionFour obj=new QuestionFour();
		while(ptr!=null){
			obj.insert_beg(ptr.data);
			ptr=ptr.next;
		}
		return obj;
	}

	
	public static void main(String[] args){
		QuestionFour ob=new QuestionFour();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		try{
		ob.print();
		QuestionFour obj=ob.reverse();
		ob.palindrome(obj);
		}
		catch(Exception e){
			System.out.println("List is Empty");
		}
	}
}
---------------------------------------------------------------------------
q5.)

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
	public String toString(){
		return ""+data;
	}
}

public class QuestionFive{
	Node head;
	Node tail;
	void insert(int t){
		Node temp=new Node(t);
		if(head==null){
			head=temp;
			tail=head;
		}
		else{
			tail.next=temp;
			tail=temp;
			
		}
	}
	void insert_beg(int t){
		Node temp=new Node(t);
		temp.next=head;	
		head=temp;
	}
	void print(){
		Node temp=head;
		while(temp!=tail.next){
			System.out.println(temp);
			temp=temp.next;
		}
	}
	void reverse(){
		Node prev=null;
		Node curr=head;
		Node next=null;
		//System.out.println("Reverse");
		tail=head;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}

	
	public static void main(String[] args){
		QuestionFive ob=new QuestionFive();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=scan.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		ob.print();
		ob.reverse();
		System.out.println("==============After Reverse===============");
		ob.print();
	}
}
-----------------------------------------------------------------------------
q6.)

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
	public String toString(){
		return ""+data;
	}
}

public class QuestionSix{
	Node headO;
	Node headE;
	Node tailO;
	Node tailE;
	void insert(int t){
		if(t%2==0){
			insertE(t);
		}
		else{
			insertO(t);
			}
	}
	void insertE(int t){
		Node temp=new Node(t);
		if(headE==null){
			headE=temp;
			tailE=headE;
		}
		else{
			tailE.next=temp;
			tailE=temp;
			
		}
	}
	void insertO(int t){
		Node temp=new Node(t);
		if(headO==null){
			headO=temp;
			tailO=headO;
		}
		else{
			tailO.next=temp;
			tailO=temp;
			
		}
	}
	void print(){
		
		Node temp=null;
		if(headO==null){
			temp=headE;
		}
		else{
			temp=headO;
			tailO.next=headE;
		}
		while(temp!=null){
			System.out.println(temp);
			temp=temp.next;
		}
	}
	public static void main(String[] args){
		QuestionSix ob=new QuestionSix();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			ob.insert(scan.nextInt());
		}
		ob.print();
	}
}