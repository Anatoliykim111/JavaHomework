package Day6;

public class Teacher {
    private String teacherName;
    private String subject;

    public Teacher(String teacherName, String subject){
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public void setName(String teacherName){
        this.teacherName = teacherName;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getName(){
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        int grade = 2 + (int)(Math.random() * 3);
        String gradeText = null;
        switch (grade) {
            case 2:
                gradeText = "НЕУДОВЛЕТВОРИТЕЛЬНО";
                break;
            case 3:
                gradeText = "УДОВЛЕТВОРИТЕЛЬНО";
                break;
            case 4:
                gradeText = "ХОРОШО";
                break;
            case 5:
                gradeText = "ОТЛИЧНО";
                break;
        }

        String StudentName = student.getStudentName();
        System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + StudentName +
                " по предмету " + subject + " на оценку " + gradeText);
    }
}
