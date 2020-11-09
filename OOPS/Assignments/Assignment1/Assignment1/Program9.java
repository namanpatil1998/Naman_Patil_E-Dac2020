/*
Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.
 */
package OOPS.Assignments.Assignment1.Assignment1;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        //if(days>=365)
        //{
            int year=days/365;
            int rdays=days-(365*year);
           int month=((days/(365/12))-(year*12));
           System.out.println("Yr-"+year + "___M-" +month);
           if((month%2)==0)
           { 
               if(month==2)
           {
                double mdays=(rdays-(month*30)-2);
            System.out.println("____D-"+ mdays);
           }
           
           else{
            double mdays=rdays-(month*30);
            System.out.println("____D-"+ mdays);
           }
    }
          else if((month%2)==1)
           {
                double mdays=(rdays-(month*30));
            System.out.println("____D-"+ mdays);
           }
    }
        //}
       /* else if(days<365)
        {
             int year=days/365;
            int rdays=days-(365*year);
           int month=((days/(365/12))-(year*12));
          int mdays=(rdays%month);
           System.out.println("Yr-"+year + "___M-" +month+ "____D-"+mdays);
        }
        else
        {
             int year=days/365;
            int rdays=days-(365*year);
           int month=((days/(365/12))-(year*12));
          int mdays=(rdays%month);
           System.out.println("Yr-"+year + "___M-" +month+ "____D-"+mdays);
        }*/
    }      
    


