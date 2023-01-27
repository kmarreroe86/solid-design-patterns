package solid.liskov;

public class Square implements Shape {

    private int side;

    public Square(int width) {
        this.side = width;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int computeArea() {
        return side * side;
    }

}
