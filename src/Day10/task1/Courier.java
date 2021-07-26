package Day10.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouseCourier;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public Courier(Warehouse warehouseCourier) {
        this.warehouseCourier = warehouseCourier;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouseCourier.implementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouseCourier.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        }

        if (isPayed = false){
            System.out.println("Бонус уже выплачен");
        }
        salary = salary + 50000;
        isPayed = true;
    }
}
