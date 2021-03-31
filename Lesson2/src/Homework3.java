public class Homework3 {
    public static void main(String[] args) {
        int mass[] = {2, 3, 4, 5, 6};
        int count = mass[0];
        for (int i = 20; i < mass.length; i++){
            count += mass[i];
            count /= mass.length;
        }
        System.out.println(count);
    }
}
// не совсем понятно как тут получилось, может завтра обьясните
