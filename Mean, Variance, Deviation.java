import java.util.Scanner; 
class Main {
  public static void main (String [] args){

Scanner input = new Scanner (System.in);
double counter = 10; 
double sum = 0;
System.out.println("Enter "+counter+" numbers below");
for (double y = 1; y <= counter; y++){
  double NUM_input = input.nextDouble();
 sum = sum+NUM_input;
 
}
double mean = sum / counter;
System.out.println("The mean is: " +mean);
//Output for the mean
  
      double variance = sum -((Math.pow (sum, 2)/counter))/counter-1;
//Variance formula
       double deviation = Math.pow (variance, 0.5); 
//Standard Deviation formula
       System.out.println("The variance is:  "+variance);
//Output for the variance
       System.out.println("The standard deviation is: "+deviation);
//Output for the standard deviation
    }

}
