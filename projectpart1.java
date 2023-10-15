// this will be a project to display computer specs // 
import java.util.Scanner; // import the scanner class //
public class projectpart1
{
   public static void main(String[]args)
   {
      // reference variable that will be used to hold the address of a scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // variables for user input
      double gpuClockSpeed = 0;
      double cpuClockSpeed = 0;
      
      int numCores = 0;
      
      String processor = "";
      String input = "";
      
      char overclock = ' ';      
      
      
      // display of questions that gets user input // 
      System.out.println("Please type what processor you have");
      processor = keyboard.nextLine();
      
      System.out.println("Please type the GPU clock speed");
      gpuClockSpeed = keyboard.nextDouble();
      
      System.out.println("Plase type the CPU clock speed");
      cpuClockSpeed = keyboard.nextDouble();
      
      System.out.println("Please type the number of cpu Cores");
      numCores = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.println("Is this cpu overclock friendly? (Enter y for yes and n for no): ");
      input = keyboard.nextLine();
      overclock = input.charAt(0);
      
      // display the Users inputs using string literals// 
      System.out.println("Computer Hardware Recommendation Tool");
      System.out.println();
      System.out.println("Type of Processor: " + processor);
      System.out.println("GPU clock speed: " + gpuClockSpeed + "MHz");
      System.out.println("CPU clock speed: " + cpuClockSpeed + "MHz");
      System.out.println("Number of cores: " + numCores);
      System.out.println("Overclock friendly?: " + overclock); 
   }
}