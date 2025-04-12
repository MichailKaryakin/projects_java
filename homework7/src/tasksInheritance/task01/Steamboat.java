package tasksInheritance.task01;

public class Steamboat extends Device {
    private int displacement;
    private int crewLimit;

    public Steamboat(String name, int displacement, int crewLimit) {
        setDeviceName(name);
        this.displacement = displacement;
        this.crewLimit = crewLimit;
    }

    @Override
    public void sound() {
        System.out.println("Psssss");
    }

    @Override
    public void show() {
        System.out.println(getDeviceName());
    }

    @Override
    public void desc() {
        System.out.println("Something that blows off some steam in the open sea");
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getCrewLimit() {
        return crewLimit;
    }

    public void setCrewLimit(int crewLimit) {
        this.crewLimit = crewLimit;
    }
}
