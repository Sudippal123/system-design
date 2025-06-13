package DependencyInversionPrinciple.BetterCode;


public class Main {
    public static void main(String[] args) {
        SwitchableDevice light = new Light();
        SwitchableDevice fan = new Fan();

        Switch lampSwitch = new Switch(light);
        lampSwitch.operate(); // Light is ON

        Switch fanSwitch = new Switch(fan);
        fanSwitch.operate(); // Fan is ON
    }
}
