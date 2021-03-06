/**
 * [연습문제 04일차 02]
 *-------------------------------------------
 * 다음의 프로그램이 동작할 수 있도록 Book 클래스를 작성하시오.
 *
 *
 * [실행결과 예시]
 *-------------------------------------------
 * 	Book [title=모바일 웹 퍼블리싱, price=35100, author=주영아, publisher=인터프레스, pubDate=2012-12-21]
 *	제목: Javascript+jQuery+Ajax 완벽가이드
 *	가격: 29700
 *	저자: 주영아,이광호
 *	출판사: Interpress
 *	출간일: 2014-11-25
 */
public class Exam0402 {
	public static void main(String[] args) {
		// 생성자 파라미터 --> 제목, 가격, 저자, 출판사, 출간일
		Book book = new Book("모바일 웹 퍼블리싱", 35100, "주영아", "인터프레스", "2012-12-21");
		System.out.println(book.toString());
		
		// 제목 설정하기
		book.setTitle("Javascript+jQuery+Ajax 완벽가이드");
		// 가격 설정하기
		book.setPrice(29700);
		// 저자 설정하기
		book.setAuthor("주영아,이광호");
		// 출판사 설정하기
		book.setPublisher("Interpress");
		// 출간일 설정하기
		book.setPubDate("2014-11-25");
		
		System.out.println("제목: " + book.getTitle());
		System.out.println("가격: " + book.getPrice());
		System.out.println("저자: " + book.getAuthor());
		System.out.println("출판사: " + book.getPublisher());
		System.out.println("출간일: " + book.getPubDate());
	}
}
