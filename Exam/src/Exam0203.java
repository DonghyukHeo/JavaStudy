/**
 * [02일차 문제 02]
 *-------------------------------------------------
 * 이중 반복문을 사용하여 다음의 결과를 출력해 보시오.
 * 단, Exam0202 예제를 기준으로
 * j값에 대한 두 번째 반복문의 초기식, 조건식, 증감식만 수정하고
 * 그 밖의 출력 형태는 수정하지 마세요.
 * 
 * 
 * [출력결과 예시] --> 별(*)이 라인마다 하나씩 증가하면서 총 10줄이 출력됩니다.
 *--------------------------------------------------
 *	**********
 *	*********
 *	********
 *	*******
 *	******
 *	*****
 *	****
 *	***
 *	**
 *	*
 */
public class Exam0203 {
	public static void main(String[] args) {
	
		for(int i = 0; i < 10 ; i++)
		{
			for(int j = 10 ; j > i ; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		
		}
		
	}
}
