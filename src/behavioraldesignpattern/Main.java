package behavioraldesignpattern;

import behavioraldesignpattern.strategy.NormalDrive;
import behavioraldesignpattern.strategy.SpecialDrive;
import behavioraldesignpattern.strategy.SportyDrive;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new Vehicle(new SpecialDrive());
        sportsVehicle.drive();
        Vehicle passangerVehicle = new Vehicle(new NormalDrive());
        passangerVehicle.drive();
        Vehicle offvehicle = new Vehicle(new SportyDrive());
        offvehicle.drive();


    }
}
