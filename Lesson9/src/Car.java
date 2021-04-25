public class Car {
    String brand;
    int speed;
    int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void Start() {
        System.out.println("");
    }

    public static void main(String[] args) {
        final int max = 20;
        final int rnd = rnd(max);
        System.out.println("" + rnd);
    }

    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }
}
