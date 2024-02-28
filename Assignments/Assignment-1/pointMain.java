class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printCoordinates() {
        System.out.println("(" + x + ", " + y + ")");
    }
}


public class pointMain {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        
        System.out.println("Coordinates of point1:");
        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());
        
        Point point2 = new Point(point1);
        
        point2.setX(7);
        point2.setY(9);
        
        System.out.println("\nCoordinates of point1:");
        point1.printCoordinates();
        System.out.println("Coordinates of point2:");
        point2.printCoordinates();
    }
}
