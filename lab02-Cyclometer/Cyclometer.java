//Joseph Han
// 2/5/16
// CSE2
//My bicycle cyclometer (meant to measure speed, distance, etc.) records two kinds of data, 
//the time elapsed in seconds, and the number of rotations of the front wheel during that time. 
//For two trips, given time and rotation count, your program should
//print the number of minutes for each trip
//print the number of counts for each tirp
//print the distance of each trip in miles
//print the distance for the two trips combined
// Document your program. 
//
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480; // the time elapsed in seconds on first trip
        int secsTrip2=3220; //the time elapsed in second on second trip
        int countsTrip1=1561; //the number of rotations of the front wheel during first trip
        int countsTrip2=9037; //the number of rotations of the front wheel during second trip
        double wheelDiameter=27.0; //diameter of the wheel 
        double PI=3.14159; //value of math number PI
        int feetPerMile=5280; //how many feet are in a mile
        int inchesPerFoot=12; //how many inches are in a foot
        int secondsPerMinute=60; //how many seconds are in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //to store various distances in double form
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts."); 
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+ 
        countsTrip2+" counts."); 
        //Above prints out the numbers we stored in variables  that store number of seconds and counts
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches 
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles for trip 2
        totalDistance=distanceTrip1+distanceTrip2; //total distance in miles
        //Print out the output data. 
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+"miles");
        
    }  //end of main method
} //end of class