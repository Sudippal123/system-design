package DependencyInversionPrinciple.BetterCode;

public class Switch {
    SwitchableDevice device;  // depends on abstraction that is interface
    public Switch(SwitchableDevice device){
        this.device=device;
    }

    public void operate(){
        this.device.turnOn();
    }
}
