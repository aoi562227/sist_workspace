package day0116;

public class UsePerson {

    public UsePerson() {

    }

    public static void main(String[] args) {
        HongGilDong hongGilDong = new HongGilDong();
        Clark clark = new Clark();
        hongGilDong.setName("홍길동");
        clark.setName("클라크");

        System.out.printf("눈 %d, 코 %d, 입 %d, 이름 %s,\n", hongGilDong.getEye(), hongGilDong.getNose(),
                hongGilDong.getMouth(), hongGilDong.getName());

        // Example of using the fight method
        String fightResult = hongGilDong.fight(7);
        System.out.println("싸움 결과: " + fightResult);
        System.out.println("==========================");
        
        Clark superman = new Clark();
        superman.setName("클락 켄트");
        System.out.printf("눈 %d, 코 %d, 입 %d, 이름 %s,\n", superman.getEye(), superman.getNose(),
        		superman.getMouth(), superman.getName());
        
        System.out.println(superman.power("다이아몬드"));
        System.out.println(superman.power("크립토나이트"));
        System.out.println(superman.power("짱돌"));
        System.out.println(superman.power);
        System.out.println("========================과제=========================");
        Homework lee = new Homework();
        System.out.println("내 이름은 " + lee.getName() + " " + lee.getHobby() + "이 취미이다");
        lee.ride();
        
        System.out.println(hongGilDong.eat());
        
        System.out.println(hongGilDong);
        System.out.println(clark);
        System.out.println("----------------------------------------------------");
        
        System.out.println(superman.drivingForce());
        System.out.println(superman.lift());
    }
    
    
}
