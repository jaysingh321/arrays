public class Selection {
    public static void main(String []args)
    {
        int arr[]= {23,45,67,89,23};
        for (int i=0; i<arr.length; i++)
        {
           int smallindex =i;         //smallindex apn pehlle postion me fir dusre fir tisre postion me toh ye i ke equal hua
           for(int j=i+1; j<arr.length; j++)  // small ko compare krna next wale sare array se toh j=i+1
    {
              if (arr[j] < arr[smallindex])   //jo next array hai ose chota hona pdega smallindex wale se 
              {
                  smallindex=j;   // toh sbse ooehle small index badlega or small index apna har baar ek aage jata toh =j or j hai i+1
              }
    }        
           int temp;   //fir last me hoga swap i loop me
           temp=arr[i];
           arr[i]=arr[smallindex];         //swapping apn i wale for loop me karenge kyu ki har ek iteration me ek swap hora mtln har ek i wale for loop me 
           arr[smallindex]=temp;   
        
        }
    }
}
