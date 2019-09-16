package Homework2;

public class Square {
    int length;

    public Square(int length){

        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
    public void calculateSquare(){
        System.out.println(length*length);
    }
}






