package day0116;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Homework2VO {
	private String name;
    private String address;
    private int age;

    public Homework2VO(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
