//ISLAM AHNAF AL 20041569D
//DINESH GAUTAM 20040968D
import java.awt.geom.*;
import java.util.*;
import java.awt.*;
public class Circle extends Shape implements Drawable
{

    private float radius;
    
    public Circle(){
        readShape();
        computeArea();
        computePerimeter();
        displayShape();
        draw();
    }
    
    public Circle(float r){
        radius = r;
    }
    
    public void readShape(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the radius:");
        System.out.println();

        radius = input.nextFloat();
        System.out.println();
    }
    
    public void computeArea(){
        area = radius*radius*(float)Math.PI;
    }
    
    public void computePerimeter(){
        perimeter = radius*2*(float)Math.PI;
    }    
    public void displayShape(){
        System.out.println("Area of the circle = " + area);
        System.out.println("Perimeter of the circle = " + perimeter);
    
    }
    public void draw()
    {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, "blue",
                        new Ellipse2D.Double(20, 60, 2*radius,  2*radius));
            canvas.wait(10);
        }
}