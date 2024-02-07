package day0102;
class Operator7 {
	public static void main(String[] args) {
		int i = 4;
		i &= 20;
		i |= 0xf;
		i ^= 10;

		System.out.println(i);
	}
}
