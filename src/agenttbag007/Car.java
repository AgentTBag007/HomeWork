package agenttbag007;

public class Car {


    public int noOfWheels;
    private int power;

    public Car(){}
    // перегрузка
    public Car(int noOfWheels, int power){
        this.noOfWheels = noOfWheels;
        this.power = power;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


}
