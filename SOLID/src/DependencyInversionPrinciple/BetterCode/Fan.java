package DependencyInversionPrinciple.BetterCode;

public class Fan implements SwitchableDevice{
    @Override
    public void turnOn() {
        System.out.println("Turn on Fan");
    }
}
