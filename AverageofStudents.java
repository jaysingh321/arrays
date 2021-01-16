// 1. no. of students 2.enter marks 3. average

import java.util.*;

public class AverageofStudents
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int a=sc.nextInt();
        int marks[]=new int[a];
        System.out.println("enter the marks");
        for(int i=0;i<a;i++)
        {
            marks[i]=sc.nextInt();
        }
       int avg=0;
        for( int i=0 ;i<a ;i++)
       {
           avg += marks[i];
       }
    avg = avg/a;
    
System.out.println("the average marks of students are" +avg);
sc.close();
}
}