package Service;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Hola soy un pato de cabeza roja");
    }

    @Override
    public String toString() {
        return "RedHeadDuck{}";
    }
}
