package abstractclasses;

interface Connectable {
    void connect();
    void disconnect();
}

abstract class Device {
    String deviceName;
    int deviceId;

    public Device(String deviceName, int deviceId) {
        this.deviceName = deviceName;
        this.deviceId = deviceId;
    }
}

abstract class SmartLight extends Device {
    public SmartLight(String deviceName, int deviceId) {
        super(deviceName, deviceId);
    }
}

class RGBBulb extends SmartLight implements Connectable {

    public RGBBulb(String deviceName, int deviceId) {
        super(deviceName, deviceId);
    }

    @Override
    public void connect() {
        System.out.println(deviceName + " connected.");
    }

    @Override
    public void disconnect() {
        System.out.println(deviceName + " disconnected.");
    }
}

public class Runner {

    public static void main(String[] args) {
        
        // 1. Interface reference to concrete object
        Connectable bulb1 = new RGBBulb("Desk Light", 101);
        bulb1.connect();
        bulb1.disconnect();

        // 2. Abstract class reference to concrete object
        Device bulb2 = new RGBBulb("Room Light", 102);
        System.out.println("Device: " + bulb2.deviceName + " | ID: " + bulb2.deviceId);

    }
}