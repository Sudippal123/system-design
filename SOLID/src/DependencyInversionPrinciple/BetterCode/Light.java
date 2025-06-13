package DependencyInversionPrinciple.BetterCode;

public class Light implements SwitchableDevice{
    @Override
    public void turnOn() {
        System.out.println("Turn on Light");
    }
}