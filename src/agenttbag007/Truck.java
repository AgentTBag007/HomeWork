package agenttbag007;

public class Truck extends Car{
    private String color;
    public Truck(int noOfWheels, int power, String color){
        super(noOfWheels, power);
        this.color = "blue";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   // переопределение
    @Override
    public int getNoOfWheels() {
        System.out.println("Getting number of wheels...");
        return noOfWheels;
    }


}
