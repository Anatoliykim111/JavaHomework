package Day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Pavel", "C");
        Teacher teacher = new Teacher("Ilya", "Programming");

        String getGroupName = student.getGroupName();
        String getSubjectName = teacher.getSubjectName();

        System.out.println(getGroupName);
        System.out.println(getSubjectName);

        student.printInfo();
        teacher.printInfo();

    }
}
