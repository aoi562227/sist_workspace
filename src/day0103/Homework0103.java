package day0103;

public class Homework0103 {
	public static void main(String[] args) {
		String transportation = args[0];
		int travelDistance = Integer.parseInt(args[1]);
		
		Transportation choosenTransportation =Transportation.valueOf(transportation);
		int baseFare = choosenTransportation.getFare();
		
		int calculatedTransportationCosts = calculationTransportationCosts(baseFare, travelDistance);
		
		System.out.println("입력하신 교통수단은 " + choosenTransportation + "이고, 이동거리는 " + travelDistance + "Km입니다.");
		System.out.println("교통 수단의 기본요금 : " + baseFare);
		System.out.println("편도요금 : "+ calculatedTransportationCosts);
		System.out.println("왕복요금 : "+ calculatedTransportationCosts * 2);
		System.out.println("한달 20일 기준 총 교통 요금은 " + (calculatedTransportationCosts * 2 * 20) + "원 입니다.");
	}// main
	
	/**
	 * 교통수단 열거체
	 */
	public enum Transportation {
	    마을버스(1200),
	    버스(1500),
	    지하철(1400);

	    private final int fare;

	    Transportation(int fare) {
	        this.fare = fare;
	    }

	    public int getFare() {
	        return fare;
	    }
	}
	
	/**
	 * @param baseFare
	 * @param distance
	 * @return 연산된 거리대비 가격
	 */
	public static int calculationTransportationCosts(int baseFare, int distance) {
		if (distance <= 10) {
	        return baseFare;
	    } else {
	        int additionalCharge = (distance - 10) / 5 * 100;
	        return baseFare + additionalCharge;
	    }
	}
}