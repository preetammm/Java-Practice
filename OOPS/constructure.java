class Rectangle {
    int length;
    int breadth;

    Rectangle() {
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

public class constructure {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 3);

        System.out.println(r1.getArea()); // 0
        System.out.println(r2.getArea()); // 6
    }
}