import java.util.Calendar;

/**
 * [01일차 문제 01]
 *-------------------------------------------------
 * 1) int형 변수 year를 선언하고 자신이 태어난 년도를 대입합니다.
 * 2) age 변수를 선언하고, year 변수를 사용하여 자신의 나이를 계산하여 대입하세요.
 *    
 * [출력결과 예시]
 *--------------------------------------------------
 * 25세 입니다.
 */
public class Exam0101 {

	public static void main(String[] args) {
		int year = 1975;
		//int age = 2017 - year;
		int age;
		
		//날짜 관련 정보를 얻는다.
		Calendar cal = Calendar.getInstance();
		//현재 년 값을 얻는다.
		int currentYear = cal.get(Calendar.YEAR);
		
		age = currentYear - year;
		
		System.out.println(currentYear + "년 입니다.");
		System.out.println(age + "세 입니다.");

	}

}
