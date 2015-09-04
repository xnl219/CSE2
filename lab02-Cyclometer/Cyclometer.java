//Assignment: My bicycle cyclometer (meant to measure speed, distance, etc.) 
//records two kinds of data, the time elapsed in seconds, and the number of 
//rotations of the front wheel during that time. For two trips, given time 
//and rotation count, your program should:

//a. print the number of minutes for each trip
//b. print the number of counts for each tirp
//c. print the distance of each trip in miles
//d. print the distance for the two trips combined

//class
public class Cyclometer {
    
    // main method 
    public static void main(String[] args) {
       	    
        // our input data
        int secsTrip1=480;  //seconds trip 1
        int secsTrip2=3220;  //seconds trip 2
        int countsTrip1=1561;  //rotation count of trip 1
        int countsTrip2=9037; //rotation count of trip 2
        
        //constant variables
        double wheelDiameter=27.0;  //Whell Diameter
        double PI=3.14159; // value of pi
        int feetPerMile=5280;  // feet per mile ration
        int inchesPerFoot=12;   // inch per foot ration
        int secondsPerMinute=60;  // seconds per minute ratio
        double distanceTrip1, distanceTrip2,totalDistance;  // distnace variables
        
        //printing store variables
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
        //run the calculations; store the values. Document your
        		//calculation here. What are you calculating?
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data.
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
        	System.out.println("Trip 2 was "+distanceTrip2+" miles");
        	System.out.println("The total distance was "+totalDistance+" miles");
	}    
}