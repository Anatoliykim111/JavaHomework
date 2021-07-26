package Day10.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker = new Picker(warehouse1);
        Courier courier = new Courier(warehouse1);

        businessProcess(picker);
        System.out.println(picker);
        System.out.println(warehouse1);

        businessProcess(courier);
        System.out.println(courier);
        System.out.println(warehouse1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker1 = new Picker(warehouse2);
        Courier courier1 = new Courier(warehouse2);

        picker1.doWork();
        System.out.println(picker1);
        courier1.doWork();
        System.out.println(courier1);

    }

    static void businessProcess(Worker worker){
        for (int i = 1; i <= 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
