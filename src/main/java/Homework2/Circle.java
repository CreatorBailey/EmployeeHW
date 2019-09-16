package Homework2;

public class Circle {
    int Radius;

    public Circle(int Radius){
    this.Radius = Radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
    public void calculateCircle(){
        System.out.println(Math.PI*(Radius*Radius));
    }
}
