
public class FirstTenPrimeNumbers {

	public static void main(String[] args) {
		int a=0, b=0, i=1, j=1;
		while(b<10)
		{
		    j=1; a=0;
		    while(j<=i)
		    {
		          if(i%j==0)
		                 a++;
		          j++;
		    }
		    if(a==2)
		    {
		          System.out.println("even number are as:"+i);
		          b++;
		    }
		    i++;
		}
		        
	}

}
