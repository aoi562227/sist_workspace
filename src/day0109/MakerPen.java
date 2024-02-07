package day0109;

/**
 * class 연습
 */
public class MakerPen {
	private int cap;
	private int body;
	private String color;
	
	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		if (cap != 1) {
			this.cap = 1;
		}
		
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}
	
	private void setColor(String color) throws Exception {
		color = color.toLowerCase();
        if (color.equals("red") || color.equals("blue") || color.equals("black")) {
            this.color = color;
        } else {
            this.color = "black";
            System.out.println("색상 오류, 기본 색상: 검은색");
        }
	}
	
	public String getColor() {
		return color;
	}


	
	public MakerPen(String color) throws Exception {
		// TODO Auto-generated constructor stub
		System.out.println("마커펜 생성");
        setColor(color);
        setCap(1);
	}
	
	
	
	public String write(String word){
		return "\"" + word + "\"" +"를 " + color + " 색으로 적었다";
		
	}


}
