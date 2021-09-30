package arrays;

public class UNIN {
	static void union(int a[],int b[])
	{
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				System.out.println(a[i++]);
			}
			else if(a[i]>b[j])
			{
				System.out.println(b[j++]);
				
			}
			else {
				System.out.println(a[i++]);
				j++;
			}
		}
		while(i<a.length)
		{
			System.out.println(a[i++]);
		}
		while(j<b.length)
		{
			
			System.out.println(b[j++]);
			    
			
		}
		
	}
	static void in(int a[],int b[])
	{
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i++]);
				j++;
				
			}
			else if(a[i]>b[j])	
				j++;
			else{
				i++;
			}
			


		}
	}
	public static void main(String args[]) {
		int a[]= {2,3,5,6,7};
		int b[]= {2,4,5,6,10,11};
		union(a,b);
		System.out.println();
		in(a,b);
	}

}
