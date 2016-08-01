import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=s.nextInt();
int[] a=new int[n];
System.out.println("Enter the register nummbers");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
System.out.println("The repeated numbers are");

for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
if((a[i]==a[j]) && (i!=j))
{
	System.out.println(a[i]);
}
	}
}
}
}