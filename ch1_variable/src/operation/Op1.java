package operation;


// 사칙 연산자 : +, -, *, /, %
// 출력문에는 3가지가 있다. 
// print, println, printf
// print은 하지 않음
// println은 개행을 함
// printf : %d정수, %f실수, %c문자, %s문자열

public class Op1 {
	public static void main(String[] args) {
		
		int n1 = 33;
		int n2 = 20;
		int result;
		
		result = n1 + n2;

//		System.out.println("n1+n2= "+(n1+n2));
//		System.out.print("+연산자 : ");
		System.out.printf("%d+%d=%d\n", n1, n2, result);
//		System.out.println("저기");

		result = n1 - n2;		
		System.out.printf("%d-%d=%d\n", n1, n2, result);

		float result2 = n1 * n2;		
		System.out.printf("%d*%d=%f\n", n1, n2, result2);
		
		result2 = n1 / (float) n2;		
		System.out.printf("%d/%d=%f\n", n1, n2, result2);
		
		// printf에서 % 사용할 때에는 %%d로 입력하여야 함 
		result = n1 % n2;		
		System.out.printf("%d%%%d=%d\n", n1, n2, result);
		
		
	}
}
