package bt4;


public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super("No color");
        side1 = side2 = side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        super("No color");
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Cạnh tam giác không hợp lệ. Set default");
            this.side1 = this.side2 = this.side3 = 1.0;
        }


    }

    // Kiểm tra xem có thể tạo thành một tam giác từ ba cạnh cho trước không
    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 > 0 && side2 > 0 && side3 > 0 &&
                (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + ", Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3;
    }
}
