
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; //������ 1�� double�� ���鼭 �ڵ����� �Ҽ��� ��ȯ�ȴ�
		double b2 = (double)1;
		
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // 1
		System.out.println(e);
		
		//1 to String
		/*
		 ����� �� �� :  
		 �˻�
		 java int to String casting
		 */
		String f = Integer.toString(1);
		System.out.println(f.getClass());
//		.getClass : ������Ÿ���� �˷���
		
	}

}
