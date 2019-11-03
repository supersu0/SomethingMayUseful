import java.util.Scanner;
public class ProcessPrime{
	public static void main(String[]args){
		
		//int n;
		int[] x;
		System.out.println("Please input one number:");
		Scanner sin =new Scanner(System.in);
		int n =sin.nextInt();
		x= new int[n];
		InputData(x);
		ProcessData(x);
		PrintData(x);
		
	}
	public static void InputData(int[] x){
		
		for(int i =0;i<x.length;i++)
		{
			x[i]=i+1;
			
		}

	}
	//1 2 3 4 5 6 7 8
	//0 2 3 4 5 6
	
	public static void ProcessData(int[]x){
		x[0]=0; //表示要挖掉的非素数1
		for(int i=1;i<x.length-1;i++){
			if(x[i]==0)
				continue;
			for(int j=i+1;j<x.length;j++){
				if(x[j]%x[i]==0)
			{
				
				x[j]=0;
				}
			}
			
		}
		
	}
	
	
	public static void PrintData(int[] x)
	{
		int items =1;
		for (int i =0;i<x.length;i++){
			if(x[i]!=0){
				
				//System.out.println(x[i]);
				System.out.printf("%5d",x[i]);//分行打印
				items++;
				if(items%10==0)
					System.out.println();
				
				
			}
			
		}
	}
}
