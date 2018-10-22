import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		/*
		// 2단
		System.out.println("2단");
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);
		*/
		
		/*
		// 3단 
		System.out.println("3단");
		int result = 3*1;
		System.out.println(result);
		result = 3*2;
		System.out.println(result);
		result = 3*3;
		System.out.println(result);
		result = 3*4;
		System.out.println(result);
		result = 3*5;
		System.out.println(result);
		result = 3*6;
		System.out.println(result);
		result = 3*7;
		System.out.println(result);
		result = 3*8;
		System.out.println(result);
		result = 3*9;
		System.out.println(result);
		*/
		
		/*
		// Scanner 이용
		System.out.print("구구단 총 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num*1);
		System.out.println(num*2);
		System.out.println(num*3);
		System.out.println(num*4);
		System.out.println(num*5);
		System.out.println(num*6);
		System.out.println(num*7);
		System.out.println(num*8);
		System.out.println(num*9);
		*/
		
		/*
		// 반복문(while) 이용
		int i = 1;
		System.out.println("6단");
		while(i<10) {
			System.out.println(6*i);
			i = i +1;
		}
		*/
		
		/*
		// 반복문(for) 이용
		System.out.println("7단");
		for(int j = 1; j<10; j++) {
			System.out.println(7*j);
		}
		*/
		
		/*
		// Scanner + 조건문
		System.out.print("구구단 총 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num < 2) {
			System.out.println("값을 잘못 입력했습니다");
		}else if(num > 9) {
			System.out.println("값을 잘못 입력했습니다.");
		}else {
			for(int i=1; i<10; i++) {
				System.out.println(num*i);
			}
		}
		*/
		
		/*
		// 배열 + Scanner
		int [] result = new int[9];
		
		System.out.print("구구단 총 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=0; i<9; i++) {
			result[i] = num*(i+1);
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		*/
		
		/*
		int [] result = new int[9];
		
		for(int i=2; i<10; i++) {
			System.out.println(i+"단");
			for(int j=0; j<9; j++) {
				result[j] = i * (j+1);
				System.out.println(result[j]);
			}
			System.out.println(" ");
		}*/
		
		// 메소드!
		for(int i =0; i<8; i++) {
			int[] result = calculate(i+2);
			print(result);
			System.out.println(" ");
		}
	}
	public static int[] calculate(int times) {
		int [] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
