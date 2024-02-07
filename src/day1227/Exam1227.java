package day1227;
class Exam1227 {
	public static void main(String[] args) {
		char firstNameInit = 'L';
		char middleNameInit = 'Y';
		char lastNameInit = 'C';
		int birthYear = 1998;

		double lfeyeVsn = 0.1;
		double rgeyeVsn = 0.1;

		int oneWayFare = 3600;

		char alpha = 'A';
//		���1
		System.out.println("�� �̸��� �̿��� �̰� �̴ϼ��� "+firstNameInit+", "+middleNameInit+", "+lastNameInit+"�Դϴ�.\n�¾ �ش� "+birthYear+"������\n���̴� "+(2023-birthYear+1)+"���Դϴ�");
//		���2
		System.out.println("�޴� �÷� "+lfeyeVsn+" ���� �� �÷� "+rgeyeVsn+" �̰� ��Ƚ÷� "+(lfeyeVsn+rgeyeVsn)/2+"�Դϴ�.");
//		���3
		System.out.println("������ "+oneWayFare+"�� �պ������ "+oneWayFare*2+"��,�Ѵ� 20�� ����ϸ� �� ������ �� "+oneWayFare*2*20+"�� �Դϴ�.");
//		���4
		System.out.println("�빮�� "+alpha+"�� unicode ���� "+(int)alpha+"�Դϴ�. A�� 32���ϸ� �ҹ��� '"+(char)(alpha+32)+"'�� ���� �� �ִ�.");
	}
}
