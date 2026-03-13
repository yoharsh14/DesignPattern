package behavioraldesignpattern.strategy;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("This has special drive capabilities");
    }
}
