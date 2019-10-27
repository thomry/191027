package classproj;

public class BreadMain {

	public static void main(String[] args) {
		/*
		 * static field는 instance를 생성(new)하지않아도 호출가능
		 * static field(class 변수) 호출
		 * -> class name.field
		 */
		
		System.out.println("빵가격 = "+Bread.PRICE);

	}

}
