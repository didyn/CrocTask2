public class Circle extends Figure implements Moveable{

    private int x;
    private int y;
    private int r;

    Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
