// 5,"1",6,2,4,3  (1 se start krna hai or 1 ko check krna ki left wala element bada ho 1 se toh swap kr denge)

// 1,5,"6",2,4,3     (ab pehele 1 se kra the jo 1 index pe hai ab 2index se krenge,5 chota hai 6 se toh nai kuch hoga)

// 1,5,6,"2",4,3

// 1,2,6,5,4,3   ese chlte jyega

public class Insertion
{
    public static void main(String []args)
    {
        int a[] = {5,1,6,2,4,3};
     int temp,j;
        for(int i=1 ; i<a.length ; i++)
        {
            temp = a[i];                       // temp me a[i] ki value ye array ke element ki baat kara
            j = i;                               // j me i ki value,ye index ki baat kara
        
        while(j>0 && a[j-1] > temp)
        {
              a[j]= a[j-1];                   // j-1 daaldi a[j] me j-1 hai 5 5 ko dala 1 me
       
        j=j-1;                                  // j ki ek value kaam krdo ye isliye kara taki abhi sirf 5 1 ki postion me aya 1 5 me ni gaya    
        }
        a[j] = temp;                            // temp apn ne daal diya jo ki 1 tha a[i] wo gya a[j] j jo original i tha fir i-1 ho gaya toh wo gaya left side
    
    }

  for( int n: a)  
  {
      System.out.print(n +" ");
  }
 }
}