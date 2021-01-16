//add of two matrix or two 2d arrays
import java.util.*;

public class Sumofmatrix {
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dimensions ");
        int rows =sc.nextInt();
        int cols =sc.nextInt();


        int a1[][]=new int [rows][cols];
        int a2[][]=new int [rows][cols];
        
        System.out.println("enter the numbers for first matrix");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }   
        
         System.out.println("enter the numbers for second matrix");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }

        int a3[][]= new int[rows][cols];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
               a3[i][j] = a1[i][j]+a2[i][j];
            }
        }
      System.out.println("result of matrix is ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(a3[i][j]);
            }
             System.out.println();

          
    
            }

sc.close();
        } 
}