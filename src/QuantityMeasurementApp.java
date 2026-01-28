public class QuantityMeasurementApp {

    public static class Feet {

        private final double value;

        public Feet(double value) {
            if (Double.isNaN(value) || Double.isInfinite(value)) {
                throw new IllegalArgumentException("Feet value must be a valid number");
            }
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;
            Feet other = (Feet) obj;

            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    public static void main(String[] args) {

        Feet feet1 = new Feet(5.0);
        Feet feet2 = new Feet(5.0);
        Feet feet3 = new Feet(6.0);

        System.out.println("feet1 equals feet2 : " + feet1.equals(feet2)); // true
        System.out.println("feet1 equals feet3 : " + feet1.equals(feet3)); // false
    }
}
