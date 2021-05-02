public class Main {
    public static void main(String[] args) {


        Startable carBmv = new Car("бмв", 220, 23000);
        Startable car2 = new Car("мерс", 220, 23000);
        Startable car3 = new Car("жигули", 220, 23000);
        Startable car4 = new Car();
        Startable[] startables = {carBmv, car2, car3, car4};

        for (Startable startable : startables) {
            try {
                startable.start();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
