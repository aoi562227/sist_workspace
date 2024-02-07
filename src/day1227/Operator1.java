package day1227;
class Operator1 {	//���� ������
	public static void main(String[] args) {
		int i = 10, j = -10;
		System.out.println("~" + i + " = " + ~i);
		System.out.println("~" + j + " = " + ~j);

		i = 12; j = 28;
		System.out.println(!(i<j));
		
		boolean flag1 = true, flag2 = false;
		System.out.println("!" + flag1 + " = " + !flag1);
		System.out.println("!" + flag2 + " = " + !flag2);
		
		i = 5; j = 10;
		System.out.println("������ �� : "+i+", "+j);
		++i;
		--j;
		++i;
		--j;
		System.out.println("���� ���� �� i = : "+i+" j = "+j);
		i++;
		j--;
		i++;
		j--;
		System.out.println("���� ���� �� i = : "+i+" j = "+j);

		i = 10;
		int result = 0;
		result = ++i;
		System.out.println("result : "+ result + " i : " + i);
		i = 10;
		result = 0;
		result = i++;
		System.out.println("result : "+ result + " i : " + i);

		i = 10; j = 10;
//		System.out.println("���� : " + ++i + " ���� : " + j++);
//
//		System.out.println("method ȣ�� �� i : "+i+", j : " + j);
		System.out.println(~i + 1);
	}
}
