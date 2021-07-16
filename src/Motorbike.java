public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int yearOfIssue, String color, String model){
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public void getMotorbikeParameters(){
        System.out.println(yearOfIssue + ", " + color + ", " + model);
    }
}
