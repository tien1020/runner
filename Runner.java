//CS200
//Spring, 2020 
//Tien Nguyen
//Instructor: Y. Gutstein 
//HW#2: Conditions - If-Else
//Due: Feb 18th 
//File name: Runner.jav

import java.util.Scanner;
public class Runner
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.println("Enter the first runner's name: ");
      String runner1 = kbd.next();
      System.out.println("Enter the first runner's time in minutes: ");
      double time1 = kbd.nextDouble();
      
      System.out.println("Enter the second runner's name: ");
      String runner2 = kbd.next();
      System.out.println("Enter the second runner's time in minutes: ");
      double time2 = kbd.nextDouble();
      System.out.println("Enter the third runner's name: ");
      String runner3 = kbd.next();
      System.out.println("Enter the third runner's time in minutes: ");
      double time3 = kbd.nextDouble();
      System.out.println();
      System.out.println("Results:");
      if ((time1 < time2) && (time1 < time3)){
      System.out.println("First place: " + runner1 + " - " + time1);
      }
      else if ((time2 < time1) && (time2<time3)){
      System.out.println("First place: " + runner2 + " - " + time2);
      }
      else {
      System.out.println("First place: " + runner3 + " - " + time3);
      }
      if ((time1 < time2) && (time1 < time3) && (time2<time3)){
      System.out.println("Second place: " + runner2 + " - " + time2);
      System.out.println("Third place: " + runner3 + " - " + time3);

      }
      else if ((time1 < time2) && (time1 < time3) && (time2>time3)){
      System.out.println("Second place: " + runner3 + " - " + time3);
      System.out.println("Third place: " + runner2 + "-" + time2);
      }
      else if ((time2 < time1) && (time2<time3) && (time1 < time3)){
      System.out.println("Second place: " + runner1 + " - " + time1);
      System.out.println("Third place: " + runner3 + " - " + time3);
      }
      else if ((time3 < time1) && (time3 < time2) && (time2 < time1)){
      System.out.println("Second place: " + runner2 + " - " + time2);
      System.out.println("Third place: " + runner1 + " - " + time1);
      }

      
      
      
   }
}
