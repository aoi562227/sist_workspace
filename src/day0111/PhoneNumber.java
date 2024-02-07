package day0111;

public final class PhoneNumber {
	private final short areaCode, prefix, lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "지역코드");
		this.prefix = rangeCheck(prefix, 999, "프리픽스");
		this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max)
			throw new IllegalArgumentException(arg + " " + val);
		return (short) val;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumber))
			return false;
		PhoneNumber pn = (PhoneNumber) o;
		return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNum;
		return result;
	}

	public static void main(String[] args) {
		PhoneNumber pn = new PhoneNumber(123, 25, 126);
		PhoneNumber pn1 = new PhoneNumber(123, 25, 16);
		System.out.println("Equals: " + pn.equals(pn1));
        System.out.println("HashCode pn: " + pn.hashCode());
        System.out.println("HashCode pn1: " + pn1.hashCode());
        System.out.println("Phone Number pn: " + pn);
	    System.out.println("Phone Number pn1: " + pn1);
//	    System.out.println();
	}
}