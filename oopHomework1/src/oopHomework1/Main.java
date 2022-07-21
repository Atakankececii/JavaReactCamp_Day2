package oopHomework1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1,"Programlama");
		
		Instructor instructor1 = new Instructor(1,"Engin Demiroğ");
		
		Course course1 = new Course(1,
				"Yazılımı Geliştirici Yetiştirme Kampı(C# + Angular)",
				"Bu bir C# kampıdır.",instructor1,category1);
		Course course2 = new Course(2,
				"Yazılımı Geliştirici Yetiştirme Kampı(Java + React)",
				"Bu bir Java kampıdır.",instructor1,category1);
		Course course3 = new Course(3,
				"Yazılımı Geliştirici Yetiştirme Kampı(Javascript)",
				"Bu bir Javascript kampıdır.",instructor1,category1);
		Course course4 = new Course(4,
				"Programlamaya Giriş için Temel Kurs",
				"Bu temel bir eğitimdir.",instructor1,category1);
		
		Course[] courses = {
			course1,course2,course3,course4	
		};
		
		for (Course course : courses) {
			System.out.println(course.getCategory().getName() + " \n " + course.getName() + " " + course.getDescription() + " " + course.getInstructor().getName());
		}
		
	}

}
