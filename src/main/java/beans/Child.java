package beans;

public class Child {
	private long id;
	private String childName;
	private double weight;
	private int age;
	
	
	public Child() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
		public Child(long id, String childName, double weight, int age) {
		super();
		this.id = id;
		this.childName = childName;
		this.weight = weight;
		this.age = age;
	}


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getChildName() {
		return childName;
	}



	public void setChildName(String childName) {
		this.childName = childName;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
}
