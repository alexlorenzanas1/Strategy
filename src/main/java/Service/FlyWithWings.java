package Service;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Vuelo con alas");
    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }
}
