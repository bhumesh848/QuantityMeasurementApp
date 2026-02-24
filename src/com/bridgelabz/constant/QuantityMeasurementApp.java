package com.bridgelabz.constant;

@SuppressWarnings("java:S106")
public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength length1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength length2 = new QuantityLength(12.0, LengthUnit.INCHES);


        System.out.println(length1.add(length2, LengthUnit.FEET));

        System.out.println(length1.equals(length2));


        QuantityWeight w1 = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000.0, WeightUnit.GRAM);

        System.out.println(w1.equals(w2));

        System.out.println(w1.convertTo(WeightUnit.GRAM));
        System.out.println(w2.convertTo(WeightUnit.POUND));

        System.out.println(w1.add(w2));

        QuantityWeight w3 = new QuantityWeight(2.0, WeightUnit.POUND);
        System.out.println(w3.convertTo(WeightUnit.KILOGRAM));

        System.out.println(
                new QuantityWeight(2.0, WeightUnit.KILOGRAM)
                        .add(new QuantityWeight(4.0, WeightUnit.POUND), WeightUnit.KILOGRAM)
        );
    }
}