package srinujavaprograms;

public class obj {
	static int a=10;
	static int b=20;
public void m1() {
	int c=a+b;
	System.out.println(c);
}
public static void hi() {
	System.out.print("adding of two numbers:");	
}
public static void main(String[] args) {
	obj.hi();
	obj rr=new obj();
	rr.m1();
}
}
