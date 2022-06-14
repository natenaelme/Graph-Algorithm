package BFS;
import java.util.Scanner;
 class test {
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BFS bfs = new BFS(4);
		int i=0;
		while(i<5){
     		System.out.println("Enter the first and second");
     		int[] numbers = new int [2];      

     		sc.nextLine();   
     		for (int j = 0; j < numbers.length; j++)   
     			{  
					numbers[j] = Integer.parseInt(sc.nextLine()); 

    			 }  
     		bfs.addEdge(numbers[0], numbers[1]);
     		i++;
		}

     bfs.BFS(2);
	}
}
