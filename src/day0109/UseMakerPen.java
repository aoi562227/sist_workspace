package day0109;

/**
 * makerpenClass
 */
public class UseMakerPen {
	public static void main(String[] args) throws Exception {
		MakerPen mPen = new MakerPen("black");
		mPen.setCap(10);
		mPen.setBody(1);
		System.out.printf("뚜껑의 수 %d개, 몸의 수 %d개\n",mPen.getCap(), mPen.getBody());
		System.out.println(mPen.write("오늘은 눈내리는 화요일"));
		
	}//main
}
