/**
 * [03일차 문제 03]
 * (주의) 제시되는 기본 코드는 삭제,수정 없이 진행하세요.
 *-------------------------------------------------
 * 1) 다음과 같이 1차 배열을 정의하세요.
 * 
 *    int[] arr = { 1, 9, 4, 2, 5 };
 *    
 *    
 * 2) 반복문을 한번만 사용하여 arr 배열의 데이터를 역순으로 재배치 하세요.
 *    이 과정에서 다른 배열을 새롭게 정의하면 안됩니다.
 *    
 * 
 * 3) 정렬된 결과를 출력하기 위한 printArray(int[]) 메서드를 정의하고,
 *    정의한 메서드를 사용해서 결과를 출력하세요.
 * 
 * 
 * [출력결과 예시]
 *--------------------------------------------------
 * arr[0]=5
 * arr[1]=2
 * arr[2]=4
 * arr[3]=9
 * arr[4]=1
 */
public class Exam0303 {
	public static void main(String[] args) {
		// 문제 출제를 위한 배열
		int[] arr = { 1, 9, 4, 2, 5 };

		//처음과 끝을 동시에 변경하므로 범위를 반까지만 하면 된다.
		for(int i = 0; i < arr.length / 2; i++)
		{
			//첫배열 값을 변수에 저장
			int temp = arr[i];
			//첫 배열에 마지막 배열의 값을 복사
			arr[i] = arr[arr.length - 1 - i];
			//마지막 배열에 위에서 받은 첫배열 값 복사
			arr[arr.length - 1 - i] = temp;
		}
		
		// 출력을 위한 메서드 정의
		// --> 이 부분의 에러를 해결하기 위해서 어떻게 해야 할까요?
		printArray(arr);
	}
	
	public static void printArray(int[] args)
	{
		for(int i = 0 ; i < args.length; i++)
		{
			System.out.println("arr[" + i + "]=" + args[i]);
		}
	}
}
	
	

