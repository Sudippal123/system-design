package InterfaceSegregationPrinciple.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for(User eachUser : users){
            if(eachUser instanceof Admin){
                eachUser.approveProduct();
            }
        }
    }
}
