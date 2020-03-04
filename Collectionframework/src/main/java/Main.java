
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Arraylist arr=new Arraylist();
		int a[]=new int[100];
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.Add\n2.remove\n3.fetch\n4.print\n5.Exit");
			int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter how many elements?");
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
				arr.add(a[i]);
			}
			break;
		case 2:
			System.out.println("Enter element to be removed");
			int n1=s.nextInt();
		 arr.remove(n1);
			break;
		case 3:
			System.out.println("Enter index:");
			int n2=s.nextInt();
		 arr.fetch(n2);
			break;
		case 4:
			arr.print();
			break;
		case 5:
			System.exit(0);
		}
		}while(true);

	}

}
