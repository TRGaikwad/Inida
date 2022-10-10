package Array;

public class Demo1 {

	public static void main(String[] args) {
		String[] arr=new String[5];
		arr[0]="Taterao";
		arr[1]="Ram";
		arr[2]="Gaikwad";
		arr[3]="Software";
		arr[4]="Engineer"; 
		String[] xyz=arr;
		for(int i=xyz.length-1;i>=0;i--)
		{
		
			System.out.println(xyz[i]);
		

	}

}}
