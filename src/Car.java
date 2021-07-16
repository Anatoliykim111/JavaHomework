public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public void setCarParameters(int yearOfIssue, String color, String model){
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public void getCarParameters(){
        System.out.println(yearOfIssue+ ", " + color + ", " + model);
    }
}
