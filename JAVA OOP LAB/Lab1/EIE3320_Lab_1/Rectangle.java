//ISLAM AHNAF AL 20041569D
//DINESH GAUTAM 20040968D
import java.awt.*;
import java.util.*;
public class Rectangle extends Shape implements Drawable
{
    private float length;
    private float width;
    
    public Rectangle(){
        readShape();
        computeArea();
        computePerimeter();
        displayShape();
        draw();
    }
    
    public Rectangle(float l, float w){
        length = l;
        width = w;
    }
    
    public void readShape(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the length:");
        System.out.println();
        System.out.print("Please input the width:");
        System.out.println();
        
        length = input.nextFloat();
        width = input.nextFloat();
        System.out.println();
    }

    
    public void computeArea(){
        area = length*width;
    }
    
    public void computePerimeter(){
        perimeter = 2*(length+width);
    }
    
    public void displayShape(){
        System.out.println("Area of the rectangle = " + area);
        System.out.println("Perimeter of the rectangle = " + perimeter);
    
    }
    public void draw()
    {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, "blue",
                        new java.awt.Rectangle(30, 20, (int)length, (int)width));
            canvas.wait(10);
    }
}
