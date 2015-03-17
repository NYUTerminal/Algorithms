public class Student{  
    int rollno;  
    String name;  
    static String college="ITS";  
    
    public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(Student.college);
		Student s2 = new Student();
		s2.college="changed";
		System.out.println(s1.college);

	}
}  