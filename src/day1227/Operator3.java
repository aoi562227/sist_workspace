package day1227;
class Operator3 { //shift ����
	public static void main(String[] args) {
		int i = 5;
		System.out.println(i + " << 3 = " + (i << 3));

		i = 75;
		System.out.println(i + " >> 5 = " + (i >> 5));
		//0100 1011
		//0000 0010
		i = 29;
		System.out.println(i + " >> 1 = " + (i >> 1));
//		0001 1101
//		0000 1110
		i = 1;
		System.out.println(i + " << 31 = " + (i << 31));

		i = -1;
		System.out.println(i + " >> 5 = " + (i >> 5));
		
		System.out.println(i + " >>> 1 = " + (i >>> 1));


	}
}

