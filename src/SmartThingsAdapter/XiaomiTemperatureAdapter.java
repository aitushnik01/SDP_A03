package SmartThingsAdapter;

import SmartThings.XiaomiTemperature;

public class XiaomiTemperatureAdapter implements SmartHouseInteraction {
    private XiaomiTemperature smartTemperature;
    public XiaomiTemperatureAdapter(XiaomiTemperature smartTemperature) {
        this.smartTemperature = smartTemperature;
    }
    @Override
    public void turnOn() {
        smartTemperature.heatOn();
    }

    @Override
    public void turnOff() {
        smartTemperature.coolOn();
    }
}
