//ISLAM AHNAF AL 20041569D
//DINESH GAUTAM 20040968D
public class PictureTester {
    public static void main(String[] args) {
        Picture p = new Picture();
        p.addShape(new Square(2));
        p.addShape(new Square(2));
        p.addShape(new Circle(3));
        p.addShape(new Circle(4));
        p.addShape(new Rectangle(5, 6));
        p.addShape(new Rectangle(7, 8));
        p.computeShape();
        p.listAllShapeTypes();
        p.listSingleShapeType("Circle");
    }
}
