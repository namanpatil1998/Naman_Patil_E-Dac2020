/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS.Assignments.Assignment4;

import java.util.*;

public class DemoBhk {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        OneBHK ob=new OneBHK();
        TwoBHK tb=new TwoBHK();
        TwoBHK[] tbarr=new TwoBHK[3];
        for(int n=0;n<3;n++)
        {
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            int l=sc.nextInt();
            tbarr[n]=new TwoBHK(i,j,k,l);
        }
        for(int n=0;n<3;n++)
        {
            tbarr[n].show();
        }
    }
}
class OneBHK
{
    int roomArea,hallArea,price;
    Scanner sc=new Scanner(System.in);
    OneBHK()
    {
        this(10,20,3000);
    }
    OneBHK(int r,int h,int p)
    {
        roomArea=r;
        hallArea=h;
        price=p;
    }
    void show()
    {
        System.out.println(roomArea+" "+hallArea+" "+price);
    }
}
class TwoBHK extends OneBHK
{
    int room2Area;
    TwoBHK()
    {
       // this(100,200,3000);
    }
    TwoBHK(int a, int b, int c,int d)
    {
        roomArea=a;
        hallArea=b;
        price=c;
        room2Area=d;
    }
   
    @Override
    void show()
    {
       System.out.println(roomArea+" "+hallArea+" "+price+" "+room2Area); 
    }
}
