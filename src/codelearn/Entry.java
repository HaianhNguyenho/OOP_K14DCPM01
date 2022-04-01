package codelearn;



public class Entry {
    public static void main(String[] args) {
        PoLyLine  polyLine = new PoLyLine();
        polyLine.appendPoint(new Point(1, 1));
        polyLine.appendPoint(new Point(2, 3));
        polyLine.appendPoint(3, 0);
        polyLine.appendPoint(4, 2);

        System.out.println(polyLine.getLength());
    }
    
}
