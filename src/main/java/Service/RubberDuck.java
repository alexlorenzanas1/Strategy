package Service;

public class RubberDuck extends Duck {

    public RubberDuck(){
        fb = new FlyNoWay();
        sb = new Squeak();
    }

    public void display(){
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }
}
