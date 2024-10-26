package Service;

public abstract class Duck { //clase abstracta
    protected FlyBehavior fb;
    protected SoundBehavior sb;

    public Duck(){}

    public abstract void display(); //metodo abstracto

    public void swim(){
        System.out.println("Estoy nadando");
    }

    public void performFly(){
        fb.fly();
    }

    public void performSound(){
        sb.MakeSound();
    }

    public void setFb(FlyBehavior fb) {
        this.fb = fb;
    }

    public void setSb(SoundBehavior sb) {
        this.sb = sb;
    }

    @Override
    public String toString() {
        return "Duck{}";
    }
}
