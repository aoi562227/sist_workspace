package day1227;
class Exam1227_1 {
    public static final int mnthlAlwnc = 500000;
    public static final int as20th = 20;

    public static void main(String[] args) {
        int oneWayFare = 3600;

        System.out.println("�Ѵ� �뵷�� " + mnthlAlwnc + "��, �Ϸ� �뵷�� 20�� �������� " + mnthlAlwnc / as20th + "�� �Դϴ�.");
        System.out.println("�Ϸ� ������ �� ����� " + oneWayFare + "��, �պ� ����� " + (oneWayFare * 2) + "��, ���� �Ĵ� 7500������ �� " + ((oneWayFare * 2) + 7500) + "���� ����˴ϴ�.");
        System.out.println("�Ѵ��� ������ �ܾ��� " + (mnthlAlwnc - ((oneWayFare * 2 + 7500) * as20th)) + "�� �Դϴ�.");

        System.out.println("Byte �ּҰ� " + Byte.MIN_VALUE + " �ִ밪 " + Byte.MAX_VALUE);
        System.out.println("Short �ּҰ� " + Short.MIN_VALUE + " �ִ밪 " + Short.MAX_VALUE);
        System.out.println("Integer �ּҰ� " + Integer.MIN_VALUE + " �ִ밪 " + Integer.MAX_VALUE);
        System.out.println("Long �ּҰ� " + Long.MIN_VALUE + " �ִ밪 " + Long.MAX_VALUE);
        System.out.println("Float �ּҰ� " + Float.MIN_VALUE + " �ִ밪 " + Float.MAX_VALUE);
        System.out.println("Double �ּҰ� " + Double.MIN_VALUE + " �ִ밪 " + Double.MAX_VALUE);
        System.out.println("Character �ּҰ� " + (int)Character.MIN_VALUE + " �ִ밪 " + (int)Character.MAX_VALUE);
    }
	
}
