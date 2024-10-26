package Service;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        fb = new FlyNoWay();
        sb = new MuteSound();
    }

    public void display(){
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }
}
