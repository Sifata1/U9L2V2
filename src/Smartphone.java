public class Smartphone {
    private String name;
    private String color;
    private int storage;

    public Smartphone(String name, String color, int storage) {
        this.name = name;
        this.color = color;
        this.storage = storage;
    }

    public void broke() {
        System.out.println("Oh no I broke my phone!");
    }

}
