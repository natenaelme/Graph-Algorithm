/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.Scanner;
/**
 *
 * @author Robel
 */
public class test {
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
   DFS dfs = new DFS(10);
        int i=0;
        while(i<9){
            System.out.println("Enter the first and second");
            int[] numbers = new int [2];      

            sc.nextLine();   
            for (int j = 0; j < numbers.length; j++)   
            {  
                numbers[j] = Integer.parseInt(sc.nextLine()); 

            }  
             dfs.addEdgesToGraph(numbers[0], numbers[1]);
             i++;
        }

        
 dfs.DFSearch(1);
    }
    
}
