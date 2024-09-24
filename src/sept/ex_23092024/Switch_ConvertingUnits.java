package sept.ex_23092024;

public class Switch_ConvertingUnits {
    public static void main(String[] args) {
        double value = 96.8;
        String unit = "m";
        switch (unit) {
            case "Km": {
                System.out.println(value + " km is equal to " + (value * 1000) + " m");
                break;
            }
            case "m": {
                System.out.println(value + " m is equal to " + (value / 1000) + " Km");
                break;
            }
            case "f": {
                System.out.println(value + " F is equal to " + ((value - 32) * 5 / 9) + " °C");
                break;
            }
            case "c": {
                System.out.println(value + "°C is equal to " + ((value * 9 / 5) + 32) + "F");
                break;
            }
        }
    }
}