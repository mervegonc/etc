public class TeslaCar extends Vehicle implements Electric{
    @Override
    public void move() {
        System.out.println("hareket ettti");
    }

    @Override
    public void charge() {
        System.out.println("şarj oluyor");
    }
}
