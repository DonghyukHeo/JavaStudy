/**
 * [연습문제 04일차 01]
 *-------------------------------------------
 * 다음의 프로그램이 동작할 수 있도록 Square 클래스를 작성하시오.
 * 	- Square에는 가로를 의미하는 width, 세로를 의미하는 height를 멤버변수로 정의합니다.
 *    (getter, setter는 추가하지 않아도 됩니다.)
 *  - 사각형의 넓이는 `가로x세로` 입니다.
 *  - 사각형의 둘레 길이는 `가로x2 + 세로x2` 입니다. 
 *
 *
 * [실행결과 예시]
 *-------------------------------------------
 * 	사각형의 넓이 -> 6제곱cm
 *	사각형의 둘레 -> 10cm
 */
public class Exam0401 {
	public static void main(String[] args) {
		// 사각형의 가로, 세로 길이를 생성자에 전달한다.
		Square s = new Square(3, 2);
		
		// 넓이를 구해서 리턴하는 메서드 호출
		System.out.println("사각형의 넓이 -> " + s.getArea() + "제곱cm");
		// 둘레의 길이를 구해서 리턴하는 메서드 호출
		System.out.println("사각형의 둘레 -> " + s.getRound() + "cm");
	}
}


class Square {
	private int width;
	private int height;
	
	Square(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return this.width * this.height;
	}
	
	int getRound() {
		return (this.width * 2) + (this.height * 2); 
	}	
}