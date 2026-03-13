package behavioral.strategy.pattern.strategy;

public class SportyDrive implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("This has sporty drive capabilities");
    }
}
