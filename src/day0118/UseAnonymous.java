package day0118;

import day0116.Clark;

public class UseAnonymous {
	public void testFly(Fly fly) {
		System.out.println("추력 : " + fly.drivingForce());
		System.out.println("양력 : " + fly.lift());
		
	}
	public static void main(String[] args) {
        UseAnonymous useAnonymous = new UseAnonymous();

        useAnonymous.testFly(new Clark());
        useAnonymous.testFly(new Fly() {
			
			@Override
			public String lift() {
				// TODO Auto-generated method stub
				return "리프트";
			}
			
			@Override
			public String drivingForce() {
				// TODO Auto-generated method stub
				return "drivingForce";
			}
			
			
		});
        
	}//main
}
