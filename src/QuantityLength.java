public final class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    private static final double EPSILON = 0.0001;

    public QuantityLength(double value, LengthUnit unit) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite");
        }
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }


    public QuantityLength convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        double baseValue = unit.toBase(value);
        double converted = targetUnit.fromBase(baseValue);

        return new QuantityLength(converted, targetUnit);
    }


    public QuantityLength add(QuantityLength other) {
        if (other == null) {
            throw new IllegalArgumentException("Other quantity cannot be null");
        }

        double sumBase =
                unit.toBase(this.value) +
                        other.unit.toBase(other.value);

        double resultInThisUnit = unit.fromBase(sumBase);
        return new QuantityLength(resultInThisUnit, this.unit);
    }

    public static QuantityLength add(
            QuantityLength q1,
            QuantityLength q2,
            LengthUnit targetUnit) {

        if (q1 == null || q2 == null) {
            throw new IllegalArgumentException("Quantities cannot be null");
        }
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        double baseSum =
                q1.unit.toBase(q1.value) +
                        q2.unit.toBase(q2.value);

        double resultValue = targetUnit.fromBase(baseSum);
        return new QuantityLength(resultValue, targetUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;

        double thisBase = unit.toBase(this.value);
        double otherBase = other.unit.toBase(other.value);

        return Math.abs(thisBase - otherBase) < EPSILON;
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}