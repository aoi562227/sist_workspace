package day0116;


public class Homework2 {
	 public static void main(String[] args) {
		Homework2VO[] people = new Homework2VO[7];
		int ageSum = 0;
		int count = 0;
		people[0] = new Homework2VO("고한별", "서울시 강남구 역삼동", 25);
		people[1] = new Homework2VO("김동수", "경기도 수원시 영통구 영통통", 20);
		people[2] = new Homework2VO("김동섭", "서울시 강남구 서초동", 28);
		people[3] = new Homework2VO("정명호", "마계서울시 부평구 부평동", 26);
		people[4] = new Homework2VO("양수민", "경기도 부천시 부천동", 25);
		people[5] = new Homework2VO("진수현", "서울시 동대문구 동대문동", 27);
		people[6] = new Homework2VO("수연", "서울시 구로구 구로동", 26);
		
		System.out.println("이름\t주소\t\t\t나이");
		for (Homework2VO person : people) {
		    System.out.println(person.getName() + "\t" + person.getAddress() + "\t" + person.getAge());
		    if (person.getName().contains("수")) count++;
		    ageSum+=person.getAge();
		}

		System.out.println("\n이름에 \"수\"가 들어가는 사람의 수: " + count + "명");
		
		System.out.println("\n서울시에 살고 있는 사람:");
		for (Homework2VO person : people) {
		    if (person.getAddress().matches("^서울시.*$")) {
		        System.out.println(person.getName() + "\t" + person.getAddress() + "\t" + person.getAge());
		    }
		}
		
		System.out.println("\n나이의 합산 : " + ageSum);
    }
}
