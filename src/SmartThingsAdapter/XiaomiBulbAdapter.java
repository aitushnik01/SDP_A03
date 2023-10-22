package SmartThingsAdapter;

public class XiaomiBulbAdapter implements SmartHouseInteraction {
    private SmartThings.XiaomiBulb smartBulb;

    public XiaomiBulbAdapter(SmartThings.XiaomiBulb smartBulb) {
        this.smartBulb = smartBulb;
    }

    @Override
    public void turnOn() {
        smartBulb.lightOn();
    }

    @Override
    public void turnOff() {
        smartBulb.lightOff();
    }
}

