package Day6;

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

    void info(){
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        int yearDifference = inputYear - yearOfIssue;
        if (yearDifference > 0){
            return yearDifference;
        }
        else
            return 0;
    }
}
