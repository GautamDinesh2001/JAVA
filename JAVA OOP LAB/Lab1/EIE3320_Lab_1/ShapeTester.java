//ISLAM AHNAF AL 20041569D
//DINESH GAUTAM 20040968D
import java.util.Scanner;

public class ShapeTester
{
    static boolean flag = true;
    public static void main(String[] args){
        while (flag){
        System.out.println("********************************************");
        System.out.println("* Please choose one the followings:        *");
        System.out.println("* Press 'c' - Circle                       *");
        System.out.println("* Press 's' - Square                       *");
        System.out.println("* Press 'r' - Rectangle                    *");
        System.out.println("* Press 'x' - EXIT                         *");
        System.out.println("********************************************");
        Scanner input = new Scanner(System.in);
        char choose = input.next().charAt(0);
        switch(choose){
            case 'c':
                Circle circle1 = new Circle();
                break;
            case 's':
                Square square1 = new Square();
                break;
            case 'r':
                Rectangle rectangle1 = new Rectangle();
                break;
            case 'x':
                flag = false;
                break;
            default:
                System.out.println("Invalid command!");
        }
        }
    }
}
