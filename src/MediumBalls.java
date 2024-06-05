public class MediumBalls extends BigBalls {
    private int size;

    public MediumBalls(ColorBalls color, ParametrsBalls parametrs, int size) {
        super(color, parametrs);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public double calculateVolume(double radius) {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    public double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public final String nonOverridableMethod() {
        return "This method cannot be overridden.";
    }

    @Override
    public String toString() {
        return "MediumBalls{" +
                "size=" + size +
                ", color=" + getColor() +
                ", parametrs=(weight=" + getParametrs().getWeight() +
                ", diameter=" + getParametrs().getDiameter() + ")" +
                '}';
    }
}