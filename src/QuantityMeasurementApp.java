public class QuantityMeasurementApp {

    public static boolean checkEquality(
            double value1, LengthUnit unit1,
            double value2, LengthUnit unit2) {

        QuantityLength q1 = new QuantityLength(value1, unit1);
        QuantityLength q2 = new QuantityLength(value2, unit2);

        return q1.equals(q2);
    }

    public static void main(String[] args) {

        System.out.println("1 yard == 3 feet : " +
                checkEquality(1.0, LengthUnit.YARD, 3.0, LengthUnit.FEET));

        System.out.println("1 yard == 36 inches : " +
                checkEquality(1.0, LengthUnit.YARD, 36.0, LengthUnit.INCH));

        System.out.println("12 inches == 1 foot : " +
                checkEquality(12.0, LengthUnit.INCH, 1.0, LengthUnit.FEET));

        System.out.println("30.48 cm == 1 foot : " +
                checkEquality(30.48, LengthUnit.CENTIMETER, 1.0, LengthUnit.FEET));

        System.out.println("2.54 cm == 1 inch : " +
                checkEquality(2.54, LengthUnit.CENTIMETER, 1.0, LengthUnit.INCH));
    }
}
