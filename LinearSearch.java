import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------------------LINEAR SEARCH------------------------");
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        System.out.println("Enter the elements in the array : ");
        int arr[]=new int[size];  
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element to Search : ");
        int key=sc.nextInt();
        linearSearch(arr,key);
    }
    public static void linearSearch(int[] arr,int key)
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("The given element is found at the index "+i);
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("The given element is not found");
        }
    }
}
