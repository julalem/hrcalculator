package pl.julia;

public class HRCalculator {
    public static int calculateMaxHR(int age){
        if (age > 120 || age < 0) {
            throw new IllegalArgumentException(
                    "Age out of bounds"
            );
        }
        return 220 - age;
    }
    public static String getWorkoutZone(int age, int bpm) {
        int maxHR = calculateMaxHR(age);
        double percentage = (double) bpm / maxHR;

        if (percentage < 0.6) {
            return "Light";
        } else if (percentage < 0.7) {
            return "Fat Burn";
        } else if (percentage < 0.8) {
            return "Aerobic";
        } else if (percentage < 0.9) {
            return "Anaerobic";
        } else if (percentage <= 1.0) {
            return "Max";
        } else {
            return "Above Max";
        }
    }
}
