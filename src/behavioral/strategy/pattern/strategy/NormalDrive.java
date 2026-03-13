package behavioral.strategy.pattern.strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("This has normal drive capabilities");
    }
}
