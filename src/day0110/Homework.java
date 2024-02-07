package day0110;

public class Homework {
	private final String breed;
	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	//Optional
	private final String name;
	private final int weight;
	private final String color;
	
	
	public static class BuilderP {
		private String breed = "";
		
		private String name = "멍멍이";
		private int weight = 10;
		private String color = "";


		public BuilderP(String breed) {
			// TODO Auto-generated constructor stub
			this.breed = breed;
		}
		public BuilderP name(String name) {
			this.name = name; return this;
		}
		public BuilderP weight(int weight) {
			this.weight = weight; return this;
		}
		public BuilderP color(String color) {
			this.color = color; return this;
		}

		

		public Homework build() {
			return new Homework(this);
		}
	}

	private Homework(BuilderP builder) {
		breed = builder.breed;
		name = builder.name;
		weight = builder.weight;
		color = builder.color;
		
	}
	
	public void bark() {
		System.out.println("멍");
	}
	
	public void run() {
		System.out.println("달리기");
	}
}
