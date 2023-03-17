public class SamsungGalaxy extends Smartphone {
    private boolean hasPen;

    public SamsungGalaxy(String name, String color, int storage, boolean hasPen) {
        super(name, color, storage);
        this.hasPen = hasPen;
    }

    public void fold() {
        System.out.println("I am going to fold my phone for no reason!");
    }
}
