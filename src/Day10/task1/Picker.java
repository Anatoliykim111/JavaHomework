package Day10.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehousePicker;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public Picker(Warehouse warehousePicker) {
        this.warehousePicker = warehousePicker;
    }

    public void doWork(){
        salary = salary + 80;
        warehousePicker.implementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if(warehousePicker.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed = true){
            System.out.println("Бонус уже выплачен");
            return;
        }

            salary = salary + 70000;
            isPayed = true;
    }
}
