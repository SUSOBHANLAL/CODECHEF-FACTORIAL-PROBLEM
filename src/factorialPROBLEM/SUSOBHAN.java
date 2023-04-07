package factorialPROBLEM;
import java.util.*;
public class SUSOBHAN {
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int j=0;j<T;j++){
		int  n= sc.nextInt();
		int sum =0;
		for(int i =5;i<=n;i=i*5){
		    int res = n/i;
		     sum = sum +res;
		}
		System.out.println(sum);
		}
		
	
	}

}
