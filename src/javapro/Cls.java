package javapro;

public class Cls {
int a=10;
int b=20;
int c=30;
public void m1() {
	int d=a+b+c;
	System.out.println(d);	
}
public static void m2() {
	System.out.print("addition of three numbers:     ");
	
}
public static void main(String[] args) {
Cls.m2();
Cls sn= new Cls();
sn.m1();
}
}
