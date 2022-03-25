
public class StringOperation {

	public static void main(String[] args) {
		
		System.out.println("Hello World".length()); //11
		
//		이름 변경하기
		/*
		 * replace("[[name]]", "egoing")
		 * [[name]]을 egogin으로 바꾸어 출력한다
		 */
		System.out.println("Hello, [[name]] ...bye. ".replace("[[name]]", "egoing"));
	}
}
