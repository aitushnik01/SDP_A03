import SmartThings.SamsungDoor;
import SmartThings.XiaomiBulb;
import SmartThings.XiaomiTemperature;
import SmartThingsAdapter.SmartHouseInteraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHouseInteraction smartHouse = new SmartHouse();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an action:");
            System.out.println("1. Turn On Smart House");
            System.out.println("2. Turn Off Smart House");
            System.out.println("3. Control Devices");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    smartHouse.turnOn();
                    break;
                case 2:
                    smartHouse.turnOff();
                    break;
                case 3:
                    handleDeviceControl(smartHouse);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleDeviceControl(SmartHouseInteraction smartHouse) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select a device to control:");
            System.out.println("1. Xiaomi Thermostat");
            System.out.println("2. Samsung Door Lock");
            System.out.println("3. Xiaomi Smart Bulb");
            System.out.println("4. Back to Main Menu");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controlThermostat(smartHouse);
                    break;
                case 2:
                    controlDoorLock(smartHouse);
                    break;
                case 3:
                    controlSmartBulb(smartHouse);
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void controlThermostat(SmartHouseInteraction smartHouse) {
        XiaomiTemperature thermostat = new XiaomiTemperature();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action:");
        System.out.println("1. Turn On Heating");
        System.out.println("2. Turn On Cooling");
        int choice = scanner.nextInt();
        if (choice == 1) {
            thermostat.heatOn();
        } else if (choice == 2) {
            thermostat.coolOn();
        }
    }

    private static void controlDoorLock(SmartHouseInteraction smartHouse) {
        SamsungDoor doorLock = new SamsungDoor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action:");
        System.out.println("1. Lock the Door");
        System.out.println("2. Unlock the Door");
        int choice = scanner.nextInt();
        if (choice == 1) {
            doorLock.lock();
        } else if (choice == 2) {
            doorLock.unlock();
        }
    }

    private static void controlSmartBulb(SmartHouseInteraction smartHouse) {
        XiaomiBulb smartBulb = new XiaomiBulb();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action:");
        System.out.println("1. Turn On Light");
        System.out.println("2. Turn Off Light");
        int choice = scanner.nextInt();
        if (choice == 1) {
            smartBulb.lightOn();
        } else if (choice == 2) {
            smartBulb.lightOff();
        }
    }
}
