package oopHomework1;

public class Course {

	private int id;
	private String name;
	private String description;
	private Instructor instructor;
	private Category category;
	
	public Course(int id, String name, String description, Instructor instructor,Category category) {
		this();
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
		this.category = category;
	}
	public Course() {
		
		
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
	
}
