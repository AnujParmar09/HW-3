package program;

public class sort_finding {
	
	public sort_finding() // do nothing constructor
	{}
	
	public void sort(String arr[],int n)  //bubble sort
	{

	int i,j;
	for(i=0;i<n;i++)
	{for(j=0;j<n-1;j++)
	{if(arr[j].compareTo(arr[j+1])>0)
		
	{
	String temp="";
	temp+=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
	}}}
	}
	public int search(String a[], int lb,int ub,String value)    //binary searching
	{
	    int mid=(ub+lb)/2;
	    while(lb<=ub&&!a[mid].equals(value))
	    {
	        if(a[mid].compareTo(value)>0)
	            ub=mid-1;
	        else lb=mid+1;
	        mid=(lb+ub)/2;
	    }
	    if(a[mid].equals(value))
	        return 1;
	    else
	        return 0;

	}

	


}

