public class Bubblesort
{
    public static void main (String []args)
    {
        int a[] = {23,34,12,45,67};
        int n = a.length;   //apn baad me n ka use krenge toh n ko define krna pdega toh length daaldi n me
        
        for(int i=0; i<n-1; i++)   // total iteration 4 hai 
        {
            for(int j=0; j<n-1; j++) // andar apne elements n-1 baar compare hore
            {
                if(a[j+1] < a[j])   // j+1 mtlb right wala or aj left
                {
                    int temp = a[j+1];  // swapping
                        a[j+1] = a[j];
                          a[j] = temp;
                }
            }
        }
     for (int q: a) // ye latest for loop array print karane ke liye for each jisme q me apn ne array ki values rakh di
     {
         System.out.print(q +" ");
     }
    
    }
}