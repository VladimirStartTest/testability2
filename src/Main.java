public class Main {
    public static void main(String[] args) {

        BMIindex service = new BMIindex();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        int BMI = service.calculate(weightInKg,heightInMeters);

        System.out.println(BMI);
    }
}
