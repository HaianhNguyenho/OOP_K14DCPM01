package codelearn;

public class Entry6 {
  public static void main(String[] args) {
      IShape[] shapes = new IShape[3];

      shapes[0] = new Rectangle(3.5, 5.3);
      shapes[1] = new Circle(3.4);
      shapes[2] = new Rectangle(4.2, 3.2);

      for(int i=0; i<3; i++){
          System.out.println("Dien tich ["+i+"]:"+shapes[i].getArea());
          System.out.println("Perimeter of shapes["+i+"]: "+shapes[i].getPerimeter());
      }
  }
    
}
