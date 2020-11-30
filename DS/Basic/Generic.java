
package DS.Basic;


class  Generic 
{
	public static <T extends Comparable<T>> void fun(T a , T b , T c)      //generic function
	{
		if( a.compareTo(b)>= 0  &&  a.compareTo(c)>= 0 )
                {
                    System.out.println("a is greater.");
                }
		else if( b.compareTo(c)>= 0 )
                {
                    System.out.println("b is greater.");
                }
                else{
		System.out.println("c is greater.");
                }
	}
	
	public static void main(String hh[])
	{
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(6);
		
		fun(a , b, c);
		
	}
}