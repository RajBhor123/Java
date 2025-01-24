package Demo;

public class ArrrayMaxExample {

	public static void main(String[] args) {
		
		int arr[]= {98,23,45,780,66,29};
		int max=arr[0];
		
        for(int i=1;i<arr.length;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        System.out.println("Largest No="+max);
	}

}
