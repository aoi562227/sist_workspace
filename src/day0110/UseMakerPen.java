package day0110;

/**
 * makerpenClass
 */
public class UseMakerPen {
	public static void main(String[] args) throws Exception {
		MakerPen mPen = new MakerPen("blue");
		mPen.setCap(10);
		mPen.setBody(1);
		System.out.printf("뚜껑의 수 %d개, 몸의 수 %d개, 색 %s\n",mPen.getCap(), mPen.getBody(), mPen.getColor());
		System.out.println(mPen.write("오늘은 맑은 수요일"));
		
	}//main
}
