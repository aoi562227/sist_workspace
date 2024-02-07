package day0116;
import day0118.Fly;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Clark extends Person implements Fly{
	public int power;
	
	public Clark() {
		// TODO Auto-generated constructor stub
		power = 10;
	}
	
	/**
	 * @param stone 종류
	 * @return 결과
	 */
	public String power(String stone) {
		String result = "";
		
		if (stone.equals("다이아몬드")) {
			result="감사합니다";
			power = 10;
		}else if (stone.equals("크립토나이트")) {
			result="힘빠짐";
			power = 0;
		}else {
			result="열받음";
			power = 12;
		}
		
		return result;
	}
	
	@Override
	public String eat() {
		return getName() + "가 집에서 빵을 먹는다";
	}

	@Override
	public String eat(String menu, int price) {
		// TODO Auto-generated method stub
		return getName() + "이 레스토랑에서 " + menu + " 인 음식을 " + price + "$ 내고 사먹는다";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String drivingForce() {
		// TODO Auto-generated method stub
		return "무릎을 꿇어서";
	}

	@Override
	public String lift() {
		// TODO Auto-generated method stub
		return "망토를 사용하여";
	}
	
}
