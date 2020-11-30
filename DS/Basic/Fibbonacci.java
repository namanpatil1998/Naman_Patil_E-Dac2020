/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.Basic;

public class Fibbonacci {
    public static void main(String[] args)
    {
        Fibbonacci rf=new Fibbonacci();
         System.out.println("Recursive");
        for(int i=0;i<10;i++)
        {
            System.out.print(rf.fibbo(i));
        }
      
         System.out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
         System.out.print("Iterative");
         int n = 45, t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
}
    int fibbo(int n)
        {
            if(n==0||n==1)
            {return n;}
            return (fibbo(n-2)+fibbo(n-1));
        }
}