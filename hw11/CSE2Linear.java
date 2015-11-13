//Xavier Lema
//CSE002 HW11


import java.util.Scanner;

public class CSE2Linear {
    
    
    //scramble method
    public static void scramble( int[] list) {
        for(int scramNum=0; scramNum<list.length; scramNum++) {
            
            int target = (int) (list.length*Math.random() );
            
            int temp = list[target];
            list[target] = list[scramNum];
            list[scramNum] = temp;
        }
        System.out.println("Scrambled Array: ");
        for(int x=0; x<15; x++){
            System.out.print(list[x] + " ");
        }
    }

        
    public static void binarySearch( int[] list) {
        Scanner myScanner3 = new Scanner(System.in);
        int low = 0;
        int high = list.length;
        //Prompt the user to search for a grade in the array
        System.out.println("Enter a grade you want to search for in the array:");
        System.out.println("");
        int target1 = myScanner3.nextInt();
        int counter = 0;
        while(low <= high){
            int median = (int)((low + high)/2); 
            if(list[median] < target1) {
                low = median + 1;
            }
            else if(list[median] > target1){
                high = median - 1;
            }
            else if(list[median] == target1){
                System.out.println(target1+" was found after " + counter + " iterations.");   
                break;
            }
            else{
                System.out.println(target1+" was not found after" + counter + " iterations");
                break;
            }
            counter ++;
        }//end of while
    }//end of binarySearch method

    //method that performs a linear search
    public static void linearSearch( int[] list) {
        Scanner myScanner2 = new Scanner(System.in);
        //Prompt the user to search for a grade in the array
        System.out.println("Enter a grade you want to search for in the array:");
        int target = myScanner2.nextInt();
        boolean targetFound = false;
        for(int x=0; x<15; x++) {
            if(list[x] == target) {
                System.out.println("The grade " + target + " was found after " + x + " iterations.");
                targetFound = true;
                break;
                }
        }
        
        while(targetFound == false) {
                System.out.println("The grade " + target + " was not found after 15 iterations");
                break;
            }
    }
    
    
    public static void main(String[] args) {
        //Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Prompt use input of arrays
        System.out.println("Enter the grades for 15 CSE002 students in ascending order: ");
        System.out.println("");
        int[] grades = new int[15];
        for(int gradeNum=0; gradeNum<15; gradeNum++) {
            grades[gradeNum] = myScanner.nextInt();
            //check for failure to inout int
            if(grades[gradeNum] != (int)grades[gradeNum]){
                System.out.println("Input Error, intput int as grade. Try again: ");
                break;
            }
            //check for correct range of grade
            if(grades[gradeNum] > 100 || grades[gradeNum] < 0) {
                System.out.println("Input Error, inout grades from 0 to 100. Try again: ");
                break;
            }
            //grade must be in order
            if(gradeNum>1 && grades[gradeNum-1] > grades[gradeNum]){
                System.out.println("Input Error, Grades must be entered in ascending order. Try again: ");
                break;
            }
            
        }
    
        //print the array
        System.out.println("The following grades have been entered: ");
        System.out.println("");
        for(int j=0; j<15; j++){
            System.out.print(grades[j] + " ");
        }//end of for loop
        
        //perform a binary search
        System.out.println("");
        binarySearch(grades);
        
        //linear search
        System.out.println("");
        scramble(grades);
        System.out.println("");
        linearSearch(grades);
    

    }

}