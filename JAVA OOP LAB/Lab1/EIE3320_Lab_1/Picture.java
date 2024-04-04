//ISLAM AHNAF AL 20041569D
//DINESH GAUTAM 20040968D
import java.util.*;
public class Picture
{
    private ArrayList<Shape> shapes;
    Picture(){
        shapes =  new ArrayList<Shape>();
    }
    
    void addShape(Shape s){
        shapes.add(s);
    }
    
    void computeShape(){
        for(Iterator iter = shapes.iterator(); iter.hasNext(); ) {
            Shape shapes = (Shape)iter.next();
            shapes.computeArea();
            shapes.computePerimeter();
        }
    }
    
    public void listAllShapeTypes(){
        for(Iterator iter = shapes.iterator(); iter.hasNext(); ) {
            Shape shapes = (Shape)iter.next();
            shapes.displayShape();
    }
    }
    public void listSingleShapeType(String className){
        for(Iterator iter = shapes.iterator(); iter.hasNext(); ) {
            Shape shapes = (Shape)iter.next();
            if(shapes.getClass().getName().equals(className)){
                shapes.displayShape();
            }
    }
}
}