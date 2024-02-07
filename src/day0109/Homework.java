package day0109;

/**
 * 과제 라면 클래스
 */
public class Homework {
	private String name;
	private String noodle;
	private boolean spicy;

	// 생성자
	public Homework(String name, String noodle, boolean spicy) {
		System.out.println("일반면, 건면이 있습니다");
		this.name = name;
		this.noodle = noodle;
		this.spicy = spicy;
	}

	// 라면 이름 설정
	public void setName(String name) {
		if (name != null && !name.isEmpty()&&name!=" ") {
			this.name = name;
		} else {
			throw new NullPointerException();
		}
	}

	// 면 종류 설정
	public void setNoodle(String noodle) {
		if (noodle == null || noodle.isEmpty() || !noodle.equals("건면")) {
		    this.noodle = "일반면";
		} else {
		    this.noodle = "건면";
		}

	}


	// 매운 정도 설정
	public void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}

	// 라면 끓이기
	public void cook() {

		System.out.println(name + "을 끓입니다. 면 종류는 " + noodle + ", " + (spicy ? "매운" : "안 매운") + "라면 입니다.");
	}
}
