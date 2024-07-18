//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(6);
        circle.setRadius(7.5);
        System.out.println("Circle: ");
        System.out.println("Radius=  "+circle.getRadius());
        System.out.println("Area= "+String.format("%.2f",circle.calculateArea()));
        System.out.println("Circumference= "+String.format("%.2f",circle.calculateCircumference()));
        System.out.println("-------------");

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.setHeight(4);
        rectangle.setWidth(6);
        System.out.println("Rectangle: ");
        System.out.println("Height= "+rectangle.getHeight());
        System.out.println("Width= "+rectangle.getWidth());
        System.out.println("Area= "+String.format("%.2f",rectangle.calculateArea()));
        System.out.println("Circumference= "+String.format("%.2f",rectangle.calculateCircumference()));
        System.out.println("-------------");

        Triangle triangle = new Triangle(10, 5);
        triangle.setHeight(8);
        triangle.setBase(4);
        System.out.println("Triangle: ");
        System.out.println("Height= "+triangle.getHeight());
        System.out.println("Base= "+ triangle.getBase());
        System.out.println("Area= "+String.format("%.2f",triangle.calculateArea()));
        System.out.println("Circumference= "+String.format("%.2f",triangle.calculateCircumference()));
        System.out.println("-------------");


        Triangle triangle1 = new Triangle(6, 6);

        System.out.println("Triangle 2: ");
        System.out.println("Height= "+triangle1.getHeight());
        System.out.println("Base= "+ triangle1.getBase());
        System.out.println("Area= "+String.format("%.2f",triangle1.calculateArea()));
        System.out.println("Circumference= "+String.format("%.2f",triangle1.calculateCircumference()));
        System.out.println("-------------");


    }
}