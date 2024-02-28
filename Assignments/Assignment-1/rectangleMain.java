class Rectangle{
    private int length;
    private int width;

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        this.length=length;
    }

    public void setwidth(int width){
        this.width=width;
    }

    public int area(){
        return length*width;
    }

    public int perimeter(){
        return 2 * (length + width);
    }
}



public class rectangleMain {
   public static void main(String[] args) {
    Rectangle obj = new Rectangle(5, 10);
    System.out.println("Area: " + obj.area());
    System.out.println("Perimeter: " + obj.perimeter());
   }
}
