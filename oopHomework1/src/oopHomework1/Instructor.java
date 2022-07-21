package oopHomework1;

public class Instructor {

	public Instructor() {
		
	}
	
	public Instructor(int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;
	private String name;
	
	
}
