package day0110;

public class Person {
	private final int eye;
	public int getEye() {
		return eye;
	}

	public int getNose() {
		return nose;
	} 

	public int getMouth() {
		return mouth;
	}

	public String getName() {
		return name;
	}

	public String getNick() {
		return nick;
	}

	private final int nose;
	private final int mouth;
	private final String name;
	public final String nick;

	public static class Builder {
		private final int nose;
		private final int mouth;

		private int eye = 2;
		private String name = "";
		private String nick = "";

		public Builder(int nose, int mouth) {
			// TODO Auto-generated constructor stub
			this.nose = nose;
			this.mouth = mouth;
		}

		public Builder eye(int val) {
			eye = val;
			return this;
		}

		public Builder name(String val) {
			name = val;
			return this;
		}

		public Builder nick(String val) {
			nick = val;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person(Builder builder) {
		nose = builder.nose;
		mouth = builder.mouth;
		eye = builder.eye;
		name = builder.name;
		nick = builder.nick;
	}

	public void eat() {
		System.out.println("집밥");
	}

	public void eat(String menu, int price) {
		System.out.printf("%d %s", price, menu);
	}


}
