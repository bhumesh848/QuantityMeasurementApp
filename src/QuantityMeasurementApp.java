public class QuantityMeasurementApp {

    public static void demonstrateLengthConversion(
            double value, LengthUnit from, LengthUnit to) {

        double result = QuantityLength.convert(value, from, to);
        System.out.println("convert(" + value + ", " + from + ", " + to + ") = " + result);
    }

    // Overloaded method
    public static void demonstrateLengthConversion(
            QuantityLength length, LengthUnit targetUnit) {

        QuantityLength converted = length.convertTo(targetUnit);
        System.out.println(length + " -> " + converted);
    }

    public static void demonstrateLengthEquality(
            QuantityLength l1, QuantityLength l2) {

        System.out.println(l1 + " equals " + l2 + " ? " + l1.equals(l2));
    }

    public static void main(String[] args) {

        demonstrateLengthConversion(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        demonstrateLengthConversion(3.0, LengthUnit.YARDS, LengthUnit.FEET);
        demonstrateLengthConversion(36.0, LengthUnit.INCHES, LengthUnit.YARDS);
        demonstrateLengthConversion(1.0, LengthUnit.CENTIMETERS, LengthUnit.INCHES);

        QuantityLength length = new QuantityLength(3.0, LengthUnit.YARDS);
        demonstrateLengthConversion(length, LengthUnit.INCHES);

        demonstrateLengthEquality(
                new QuantityLength(12.0, LengthUnit.INCHES),
                new QuantityLength(1.0, LengthUnit.FEET)
        );
    }
}