import java.util.*;
//ISLAM AHNAF AL 20041569D
//DINESH GAUTAM 20040968D
import java.awt.*;

public class Square extends Shape implements Drawable
{
    private float length;

    public Square(){
        readShape();
        computeArea();
        computePerimeter();
        displayShape();
        draw();
    }
    
    public Square(float l){
        length = l;
    }
    
    public void readShape(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the length:");
        System.out.println();

        length = input.nextFloat();
        System.out.println();
    }
    
    
    public void computeArea(){
        area = length*length;
    }
    
    public void computePerimeter(){
        perimeter = length*4;
    }
    
    public void displayShape(){
        System.out.println("Area of the square = " + area);
        System.out.println("Perimeter of the square = " + perimeter);
    }
    
    public void draw()
    {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, "blue",
                        new java.awt.Rectangle(60, 50, (int)length, (int)length));
            canvas.wait(10);
        }
}