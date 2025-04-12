package tasksInheritance.task01;

abstract class Device {
    private String deviceName;

    abstract void sound();

    abstract void show();

    abstract void desc();

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
