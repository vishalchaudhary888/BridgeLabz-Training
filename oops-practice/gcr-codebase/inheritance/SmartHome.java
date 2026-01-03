
class Device{
    int deviceId;
    String status;

    Device(int deviceId,String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("Device Id: "+deviceId);
        System.out.println("Status: "+status);
    }
}
class Thermostat extends Device{
    float temperatureSetting;

    Thermostat(int deviceId,String status,float temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature: "+temperatureSetting);
    }
}
public class SmartHome {
    public static void main(String[] args) {
        Device tv = new Thermostat(2001,"working",20.53f);
        tv.displayStatus();
    }
}
