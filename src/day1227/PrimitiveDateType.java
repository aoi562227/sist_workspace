package day1227;/*
�⺻�� ������ �� : ������ ������� �����ϴ� ������ ��
*/

class PrimitiveDateType{
	public static void main(String[] args) {
		//---------���� ����� ������ �� �ִ� ������ ��
		/*byte a = 10;
		//byte b = 128; //error
		short b = 10;
		int c = 10;
		long d = 10;

		//�ڽ��� ��� ������ ���� �ڻ��� ������ �Ҵ�
		long money = 5000000000L;*/

		//------------char��
		char e = 'A';
		char f = '0';
		char g = '2';
		char h = '\u000e';
		//System.out.println("char : " + e+f+g+h);
		
		//System.out.println("byte :"+a+" short : " + b + " int : " + c + " long : " + d);

		//--------�Ǽ���---------------
		float fl = 12.27f; //8byte�� float���� 4byte�� �� �� ����.
		float fr = 12.28F;
		double k = 2023.12D;
		//System.out.println("float : "+fl+" "+fr + " double : " + k);
		boolean t = true;
		boolean fal = false;
		System.out.println("boolean : "+ t+" "+fal);
	}
}
