public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 10;

    public static void main(String[] args) {
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");
//        Car car4 = new Car("Car4");

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);
//        Thread t4 = new Thread(car4);

        t1.start();
        t2.start();
        t3.start();
//        t4.start();
    }
}
