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
//Output for the mean!
  
      double variance = sum -((Math.pow (sum, 2)/counter))/counter-1;

       double deviation = Math.pow (variance, 0.5); 

       System.out.println("The variance is:  "+variance);
       System.out.println("The standard deviation is: "+deviation);

    }

    }
 
