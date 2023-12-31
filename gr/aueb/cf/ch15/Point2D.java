package gr.aueb.cf.ch15;

public class Point2D extends Point {

    private int y;

    public Point2D() {
//        super();
//        y = 0;
    }

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    @Override
//    public String convertToString() {
//        return super.convertToString() + "(" + y + ")";
//    }


    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public void movePlusTen() {
        super.movePlusTen();
        y += 10;
    }
}
