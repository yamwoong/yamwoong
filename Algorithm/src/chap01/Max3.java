package chap01;
import java.util.Scanner;


class Max3{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		int max = a;
		if(b > max) max = b;
		if(c > max)	max = c;
		
		System.out.println("최댓값은 " + max + "입니다");
	}
}

/* 		int max = a;
		if(b > max) max = b;
		if(c > max)	max = c;
		
		이부분이 최대값을 구하는 과정이다 
		
		1. max에 a 값을 넣는다.
		2. b 값이 max보다 크면 max에 b 값을 넣는다.
		3. c 값이 max보다 크면 max에 c 값을 넣는다.
		
		이렇게 여러 문장이 순차적으로 실행되는 구조를 순차적 구조라고 한다 
		
		 */