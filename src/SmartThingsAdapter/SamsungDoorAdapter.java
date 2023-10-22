package SmartThingsAdapter;

import SmartThings.SamsungDoor;

public class SamsungDoorAdapter implements SmartHouseInteraction {
    private SamsungDoor smartLock;
    public SamsungDoorAdapter(SamsungDoor smartLock) {
        this.smartLock = smartLock;
    }

    @Override
    public void turnOn() {
        smartLock.lock();
    }
    @Override
    public void turnOff() {
        smartLock.unlock();
    }
}
