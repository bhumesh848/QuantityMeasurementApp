public class QuantityMeasurementApp {

    public static boolean checkEquality(
            double value1, LengthUnit unit1,
            double value2, LengthUnit unit2) {

        QuantityLength length1 = new QuantityLength(value1, unit1);
        QuantityLength length2 = new QuantityLength(value2, unit2);

        return length1.equals(length2);
    }

    public static void main(String[] args) {

        System.out.println("Input: 12 inch and 1 foot");
        System.out.println("Output: Equal (" +
                checkEquality(12.0, LengthUnit.INCH, 1.0, LengthUnit.FEET) + ")");

        System.out.println();

        System.out.println("Input: 1 foot and 1 foot");
        System.out.println("Output: Equal (" +
                checkEquality(1.0, LengthUnit.FEET, 1.0, LengthUnit.FEET) + ")");

        System.out.println();

        System.out.println("Input: 1 inch and 1 inch");
        System.out.println("Output: Equal (" +
                checkEquality(1.0, LengthUnit.INCH, 1.0, LengthUnit.INCH) + ")");
    }
}
