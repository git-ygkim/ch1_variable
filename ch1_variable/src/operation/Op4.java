package operation;


// 논리연산자
// && and 참참참 빼고는 모두 다 거짓
// || or 거짓거짓거짓 빼고는 모두 다 참
// 비트연산자
public class Op4 {
	public static void main(String[] args) {

						//	16	8	4	2	1
		int n1 = 10;	//	0	1	0	1	0
		int n2 = 5;		//	0	0	1	0	1
	//------------------------------------------
	//      &(AND)		//	0	0	0	0	0	// 비트연산자의 논리 계산 시 & 한개 사용
		System.out.println(n1&n2);
		
	//------------------------------------------	
//		    |(OR)		//  0	1	1	1	1	
		System.out.println(n1|n2);
		
	
	
	}

}
