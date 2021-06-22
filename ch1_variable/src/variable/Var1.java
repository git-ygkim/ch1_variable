package variable;

class 설명 {
	
	// 멤버변수(field)
	// 생성자 : 중요!
	// 메소드
		
}


// 크기순 : byte < short/char < int < long < float < double 
// 작은 것을 큰 것에 넣을 경우 문제가 되지 않음. 

public class Var1 {

	// Run할 경우 main 메소드를 실행함
	// main메소드가 없는 경우 실행되지 않는 도면과 같은 클래스이다. 
	public static void main(String[] args) {
		
		byte b = 127;	//
		int i = 100;
		
		System.out.println("byte+int: " + (b+i));
		int sum = b + i;	// 자동 형변환 
		byte sum2 = (byte) ( b + i );	// 에러 발생 : 명시적인 형변환 필요
		

	}

}
