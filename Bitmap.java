/**
 * Bitmap editor is a simple program which use to genrate bitmap and to edit
 * IN this program we  can  create  the pixel by 2D array 
 *@author  :subash
 *@version :1.0
 *@created :4-08-2017 
 */
import java.util.Scanner;
public class Bitmap extends Editor {
public static void main(String[] args) {
    //extednig the parent class method
        Editor ge= new Editor();
        Scanner sc= new Scanner(System.in);
        System.out.println("do u want to enter in to the program Y/N");
        String b =sc.next();
        ge.inputCommand(b);
       }
    }
