package day0116;

public class HongGilDong extends Person {

    private int level;

    public HongGilDong() {
        super();
        level = 6;
    }

    /**
     * @param yourLevel
     * @return 싸움 결과
     */
    public String fight(int yourLevel) {
        String result = "";

        if (level < yourLevel) {// 패배
            result = "패배";
            level--;
            if (level < 1) {
                level = 1;
            }
        } else if (level > yourLevel) {// 승리
            result = "승리";
            level++;
            if (level > 10) {
                level = 10;
            }
        } else {// 비기
            result = "비김";
        }
       

        return result;
    }
    @Override
	public String eat() {
		return getName() + "가 집에서 빵을 먹는다";
	}
    @Override
    public String eat(String menu, int price) {
		return getName() + "이 주막에서 " + menu + " 인 음식을 " + price + "푼 내고 사먹는다";
	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
