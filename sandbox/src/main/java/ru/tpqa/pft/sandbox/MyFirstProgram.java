package ru.tpqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(5);
    System.out.println("Плащадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Плащадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }


  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }


}