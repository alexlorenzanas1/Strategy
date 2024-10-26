package Service;

public class ModelDuck extends Duck {

    public ModelDuck() {
        fb = new FlyLikeRocket();
        sb = new MuteSound();
    }

    @Override
    public void display() { System.out.println("Hola soy un pato modelo"); }

    @Override
    public String toString() { return "ModelDuck{}"; }

    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performSound();

        // Cambiar comportamiento en tiempo de ejecución
        modelDuck.setFb(new FlyNoWay());
        modelDuck.setSb(new Quack());

        modelDuck.performFly();
        modelDuck.performSound();
    }
}
