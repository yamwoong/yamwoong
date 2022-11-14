package chap01;

import java.util.Scanner;

class Min3{
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("세 정수의 최소값을 구합니다.");
		System.out.println("a의 값 : ");
		a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		c = stdIn.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("최소값은" + min + "입니다.");
	}
}
