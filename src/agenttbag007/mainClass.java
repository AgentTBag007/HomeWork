package agenttbag007;

public class mainClass {
    public static void main(String[] args) {
        Truck truck = new Truck(8, 600, "blue");
        Car car = new Car(4,100);
        System.out.println("Количество колес у легковой: " + car.getNoOfWheels());

        truck.setNoOfWheels(10);
        truck.setPower(650);
        truck.setColor("black");

        System.out.println("Мощность грузовика составляет " + truck.getPower() + " лошадиных сил.");
        System.out.println("Количество колес вашего грузовика: " + truck.getNoOfWheels());
        System.out.println("Цвет грузовика - " + truck.getColor());
    }
}
