public class KmToMiles {

    public static void main (String[] args) {
        System.out.println("hello all");
        printConversion(5.6);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

            long toMilesPerHour = Math.round(kilometersPerHour / 1.609);
            return toMilesPerHour;

    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour ( kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
        // write your code here
    }
}
