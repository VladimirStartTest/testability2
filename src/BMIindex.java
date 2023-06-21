public class BMIindex {

    public int calculate(int weightInKg, double heightInMeters) {
        int index = (int) (weightInKg / (heightInMeters * heightInMeters));
        return index;
    }
}
