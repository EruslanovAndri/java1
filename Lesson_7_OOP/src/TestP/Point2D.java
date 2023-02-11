package TestP;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return String.format("x: %d, y: %d", x, y);
    }

    public Integer sum(){
        int res = x + y;
        return res;
    }

}
