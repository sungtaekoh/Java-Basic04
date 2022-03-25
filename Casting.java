
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; //정수이 1이 double에 들어가면서 자동으로 소수로 전환된다
		double b2 = (double)1;
		
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // 1
		System.out.println(e);
		
		//1 to String
		/*
		 방법을 모를 때 :  
		 검색
		 java int to String casting
		 */
		String f = Integer.toString(1);
		System.out.println(f.getClass());
//		.getClass : 데이터타입을 알려줌
		
	}

}
