/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package DS.Basic;

public class TowerOfHannoi {
    public static void main(String[] args)
    {
        int disk=3;
        char a='A',b='B',c='C';
        TowerOfHannoi th=new TowerOfHannoi();
        th.Towers(disk,a,b,c);
    }
    
    void Towers(int disk,char a,char b, char c)
    {
        if(disk==1)
        {
            System.out.println("Disk 1 from " + a + " to " + c);
        }else{
        Towers(disk-1, a, c, b);
        System.out.println("Disk "+disk+ " from " + a + " to " + c);
        Towers(disk-1, b, a, c);
        }
    }
}
