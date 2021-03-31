public class Homework4 {
    public static void main(String[] args) {
        int [] mass = new int[7];

        int maxNumber = 1;

        int maxIndex = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
            System.out.println(mass[i] + " ");
            if (maxNumber <= mass[i]){
                maxNumber = mass[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальное число " + maxNumber);
    }
}
