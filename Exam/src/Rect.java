public class Rect extends Shape {
	/**
	 * 생성자
	 * @param width 	- 가로길이
	 * @param height 	- 세로길이
	 */
	public Rect(int width, int height) {
		super(width, height);
	}
	
	/**
	 * 면적을 구해서 리턴한다.
	 */
	@Override
	public int getArea() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = x * y;
		
		return z;
	}
	
	//Exam0502 관련 getArea 메서드 Overload
	public int getArea(int x, int y) {
		//부모 클래스에 정의된 width, height에 값을 설정
		this.setWidth(x);
		this.setHeight(y);
		
		return this.getArea();
	}	

	/**
	 * 둘레의 길이를 구해서 리턴한다.
	 */
	@Override
	public int getRound() {
		int x = this.getWidth();
		int y = this.getHeight();
		int z = (x * 2) + (y * 2);
		return z;
	}

	//Exam0502 관련 getRound 메서드 Overload
	public int getRound(int x, int y) {
		//부모 클래스에 정의된 width, height에 값을 설정
		this.setWidth(x);
		this.setHeight(y);

	
		return this.getRound();
	}	
	

	

}
