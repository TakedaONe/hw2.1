public final class SmallBalls extends MediumBalls {
    private double weight;

    public SmallBalls(ColorBalls color, ParametrsBalls parametrs, int size, double weight) {
        super(color, parametrs, size);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double calculateVolume(double radius) {
        return Math.PI * Math.pow(radius, 2) * (getSize() / 2.0);
    }

    @Override
    public String toString() {
        return "SmallBalls{" +
                "size=" + getSize() +
                ", weight=" + weight +
                ", color=" + getColor() +
                ", parametrs=(weight=" + getParametrs().getWeight() +
                ", diameter=" + getParametrs().getDiameter() + ")" +
                '}';
    }
}