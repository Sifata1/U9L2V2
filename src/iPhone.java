public class iPhone extends Smartphone {
    private boolean hasTouchButton;

    public iPhone(String name, String color, int storage, boolean hasTouchButton) {
        super(name, color, storage);
        this.hasTouchButton = hasTouchButton;
    }

    public void faceTime() {
        System.out.println("I am going to facetime my friend");
    }

}
