package Homework2;

public class Triangle {
    int A;
    int B;
    int C;
    public Triangle(int A, int B, int C){
        this.A = A;
        this.B = B;
        this.C = C;


    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }

    public void calculateTriangle(){
        System.out.println(A+B+C);
    }

}
