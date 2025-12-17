public class Main {
public static void main(String[] args) {
Student student = new Student("Anisha", "anisha@gmail.com");


try {
Validator.validate(student);
StudentService.saveStudent(student);
System.out.println("Student added successfully");
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
}
}
