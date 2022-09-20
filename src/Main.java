public class Main {
    public static void main(String[] args) {
        double[] number = {8.13, 32.7, 15.2, -23.6,- 25.5, 45.4, 32.10, 12.2, 87.12, 65.16, 51.28, 48.9, 95.3, 55.11, 33.22};
        double sum = 0;
        int num = 0;
        boolean proverka = false;
        for (double nam : number) {
            if (nam < 0) {
                proverka = true;
            } else if (nam > 0 && proverka) {
                sum += nam;
                num++;
                System.out.println(nam);
            }

        }
        System.out.println("общее арифметическое число" + sum / num);


    }
}