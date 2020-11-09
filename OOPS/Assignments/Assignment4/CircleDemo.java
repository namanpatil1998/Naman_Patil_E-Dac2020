/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Assignments.Assignment4;

import java.util.*;

public class CircleDemo {
public static void main(String[] args)
{
    Circle c=new Circle();
    c.init();
    c.calculateArea();
    c.display();
}
}
class Circle
{
    double radius;
    double area;
    Scanner sc=new Scanner(System.in);
    void init()
    {
        radius=sc.nextDouble();
    }
    double calculateArea()
    {
        area= 3.14*Math.pow(radius, 2);
        return area;
    }
    void display()
    {
        System.out.println("Area of Circle :- "+area);
    }
}