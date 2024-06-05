public class Main {
    public static void main(String[] args) {
        ParametrsBalls parametrsA = new ParametrsBalls(10, 5);
        MediumBalls objectA = new MediumBalls(ColorBalls.RED, parametrsA, 10);

        ParametrsBalls parametrsB = new ParametrsBalls(7, 3);
        SmallBalls objectB = new SmallBalls(ColorBalls.GREEN, parametrsB, 5, 15);

        ParametrsBalls parametrsC = new ParametrsBalls(9, 4);
        SmallBalls objectC = new SmallBalls(ColorBalls.BLUE, parametrsC, 6, 20);

        System.out.println(objectA);
        System.out.println(objectB);
        System.out.println(objectC);

        System.out.println("Volume of objectA: " + objectA.calculateVolume(3));
        System.out.println("Volume of objectA with height: " + objectA.calculateVolume(3, 5));

        System.out.println("Volume of objectB: " + objectB.calculateVolume(3));
        System.out.println("Volume of objectC: " + objectC.calculateVolume(3));
    }
}
