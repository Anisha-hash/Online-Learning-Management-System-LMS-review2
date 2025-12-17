public class Validator {
public static void validate(Student student) throws Exception {
if (student.getName() == null || student.getName().isEmpty()) {
throw new Exception("Name cannot be empty");
}


if (student.getEmail() == null || !student.getEmail().contains("@")) {
throw new Exception("Invalid email address");
}
}
}
