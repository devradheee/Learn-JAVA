// package 03_Operator;
public class IncrementDecrementOperatorEx3 {
	public static void main(String[] args) {
		int a=10,b;
        
//		b=a++;
//		b=++a;
//		b=a++-5;
//		b=a++-a;
//		b=++a-a+a++;
//		b=--a+a++-a++-a;
//		b=a--+--a+a--+a++;
//		b=a--*a/3+a++%a*5/a--;
//		b=a+++a;//a++ +a
//		b=a++++a;//error
//		b=a+++++a;//error
//		b=a+++ ++a;

		b=a++-++a;
		System.out.println(a);
		System.out.println(b);
		
		int x=10;
		x=x++;
		System.out.println(x);
	}
}

    

