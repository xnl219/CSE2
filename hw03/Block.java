//Xavier Lema CSE2
//HW 03 Block
//user inputs lenght, height, and width
//program calculates and prints the volume and surface area


import java.util.Scanner;

public class Block {
    
    public static void main(String[] args)  {
        
        Scanner blockScanner = new Scanner( System.in );
        
        System.out.print("Enter the length of the block: ");
        double length = blockScanner.nextDouble ();
        
        System.out.print("Enter the width of the block: ");
        double width = blockScanner.nextDouble ();
        
        System.out.print("Enter the height of the block: ");
        double height = blockScanner.nextDouble ();
        
        double volume, surfaceArea;
        
        surfaceArea = (length*height*2)+(length*width*2)+(height*width*2);
        volume = length*height*width;
        
        System.out.println("The volume of the block of dimensions "+length+" X "+width+" X "+height+" is "+volume);
        System.out.println("The surface areas of the block is "+surfaceArea);
    }
    
    
}