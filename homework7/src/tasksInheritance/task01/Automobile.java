package tasksInheritance.task01;

public class Automobile extends Device {
    private int maxSpeed;
    private String color;

    public Automobile(String name, int maxSpeed, String color) {
        setDeviceName(name);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Wrrrummm");
    }

    @Override
    public void show() {
        System.out.println(getDeviceName());
    }

    @Override
    public void desc() {
        System.out.println("Device to ride your road, nothing more, nothing less");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
