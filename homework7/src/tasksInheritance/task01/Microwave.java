package tasksInheritance.task01;

public class Microwave extends Device {
    private int power;
    private String color;

    public Microwave(String name, int power, String color) {
        setDeviceName(name);
        this.power = power;
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Rooong");
    }

    @Override
    public void show() {
        System.out.println(getDeviceName());
    }

    @Override
    public void desc() {
        System.out.println("Fixture but a very nice one if you need food from fridge done with");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
