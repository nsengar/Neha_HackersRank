
public class PracticeOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		a=a+10;
		a+=10;
		a-=10;
		/*
		 * 1.Arithmetic Operator --> + - * / %
		 * 2.Unary Operator      --> only on single operand ++, --, +(make value positive), -(negate the value)
		 * 3. Assignment Operator
		 *    right to left associativity =
		 *    a=5; a=a+5;
		 *    
		 *  4. Relational Operator
		 *  relations like ==, >,<,>=,<=
		 *  5. Logical Operator &&, ||,
		 *  6. Ternary Operator expersion:a:b  
		 *  7. Bitwise Opertor operations performed on Bits 1,0 AND, OR,XOR,NOR & | ^~
		 *  8. Shift Operators shift bits to left right >> <<
		 */
		
		int b=10,c=15,result;
		result = (b>c)?b:c;
		System.out.println("Max is "+result);
		
		byte myByte=11; //0000 1011    0000 0010
		
		System.out.println(11>>2);
		a=b=c=10;
	}

}
