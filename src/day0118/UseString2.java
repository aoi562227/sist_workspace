package day0118;

public class UseString2 {
	public static void main(String[] args) {
		String csv = "Java아니근Oracle아니근데JDBC아니HTML";
		String[] arr = csv.split("[아?니?근?데?]+");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		String csv2 = "가나.다라.마바";
		String[] arr2 = csv2.split("\\.");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		int i = -40;

		
	}//main
}
