public class QuantityMeasurementApp {

    public static void demonstrateAdditionWithTarget(
            QuantityLength q1,
            QuantityLength q2,
            LengthUnit targetUnit) {

        QuantityLength result =
                QuantityLength.add(q1, q2, targetUnit);

        System.out.println(
                "add(" + q1 + ", " + q2 + ", " + targetUnit + ") -> " + result);
    }

    public static void main(String[] args) {

        demonstrateAdditionWithTarget(
                new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS);

        demonstrateAdditionWithTarget(
                new QuantityLength(36.0, LengthUnit.INCHES),
                new QuantityLength(1.0, LengthUnit.YARDS),
                LengthUnit.FEET);

        demonstrateAdditionWithTarget(
                new QuantityLength(5.0, LengthUnit.FEET),
                new QuantityLength(-2.0, LengthUnit.FEET),
                LengthUnit.INCHES);
    }
}