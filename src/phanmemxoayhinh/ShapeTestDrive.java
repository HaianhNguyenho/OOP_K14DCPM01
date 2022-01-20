package phanmemxoayhinh;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle("summer.aif");
        Square square = new Square("spring.aif");
        Triangle triangle = new Triangle("tiktik.aif");

        circle.rotate();
        square.rotate();
        triangle.rotate();
        circle.playSound();
        square.playSound();
        triangle.playSound();
    }
    
}
