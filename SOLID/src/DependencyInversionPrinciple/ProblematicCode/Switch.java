package DependencyInversionPrinciple.ProblematicCode;

public class Switch {
    Lamp lamp = new Lamp();     // tightly coupled to Lamp
    public void operate() {
        lamp.turnOn();
    }
}
