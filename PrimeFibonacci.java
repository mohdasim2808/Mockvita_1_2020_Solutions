# Mockvita_1_2020_Solutions

import java.io.*;
import java.util.*;

class PrimeFibonacci {
    public static List<Integer> genPrime(int start,int end) {
        List<Integer> prime=new ArrayList<>();
    
        for(int i=start;i<=end;i++){
             if(isPrime(i))
                prime.add(i);

      }
      return prime;
    }

    static boolean isPrime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
            if(n%i==0)
                return false;
   
        return true;
           
    }
    static void fibonacci(int x, int y,int limit)  
    {    
     long n1=x;
     long n2=y;
     long n3=0,i,count=limit; 
     for(i=2;i<count;++i)    
     {    
      n3=n1+n2;       
      n1=n2;    
      n2=n3;    
     }    
    System.out.println(n3);
    }

    public static void main(String[] args)throws IOException {
    
    //Taking inputs
    
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
      int Start=Integer.parseInt(line.nextToken());
        int  End=Integer.parseInt(line.nextToken());
        
        List<Integer> p=genPrime(Start, End);     //Generating List of Primes
     
        Set<String> hash_Set = new HashSet<String>();     //Creating set of Strings to store all possible unique combinations
        for(int element:p){
            for(int item: p){
                hash_Set.add(""+element+item);      //Storing Unique combinations
            }
        }
        
 //Second List to store only prime numbers from all unique combinations obtained in above SET
        
        ArrayList<Integer> secondList= new ArrayList<Integer>();       
        for(String values:hash_Set){
            
            if(isPrime(Integer.valueOf(values))){
                secondList.add(Integer.valueOf(values));

            }
        }
     
        Collections.sort(secondList);   //Sort the secondList to find minimum and maximum element in List
        int N = secondList.size();      //Finding list Size
     
        int first=secondList.get(0);     //Obtaining first element of sorted secondList
        int last=secondList.get(N-1);   //Obtaining last element of sorted secondList

        fibonacci(first, last, N);    //Pass these first and last as first and second number of fibonacci series of size equivalent to list size i.e. N

    
    }

}
