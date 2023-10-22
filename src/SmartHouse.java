import SmartThings.SamsungDoor;
import SmartThings.XiaomiBulb;
import SmartThings.XiaomiTemperature;
import SmartThingsAdapter.SmartHouseInteraction;

public class SmartHouse implements SmartHouseInteraction {
    private XiaomiTemperature xiaomiThermostat = new XiaomiTemperature();
    private SamsungDoor samsungDoor = new SamsungDoor();
    private XiaomiBulb xiaomiBulb = new XiaomiBulb();

    @Override
    public void turnOn() {
        System.out.println("Smart House turned on");
        xiaomiThermostat.heatOn();
        samsungDoor.unlock();
        xiaomiBulb.lightOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Smart House turned off");
        xiaomiThermostat.coolOn();
        samsungDoor.lock();
        xiaomiBulb.lightOff();
    }
}