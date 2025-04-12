package tasksInheritance.task01;

public class Kettle extends Device {
    private int power;
    private String color;

    public Kettle(String name, int power, String color) {
        setDeviceName(name);
        this.power = power;
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Brrrrr");
    }

    @Override
    public void show() {
        System.out.println(getDeviceName());
    }

    @Override
    public void desc() {
        System.out.println("All right baby that thing's gonna heat your water fine");
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
