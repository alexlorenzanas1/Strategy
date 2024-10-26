package Service;

public class MallardDuck extends Duck{

    public MallardDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
    }

    @Override  //supeditar
    public void display() {
        System.out.println("Hola soy un pato silvestre");
    }

    @Override
    public String toString() {
        return "MallardDuck{}";
    }
}