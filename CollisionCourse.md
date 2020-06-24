# Mockvita_1_2020_Solutions


import java.io.*;
import java.util.*;

public class CollisionCourse {
    
public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    int T=Integer.parseInt(br.readLine());

    Map<Double,Long> hash_Set=new HashMap<Double,Long>();

    for (int i=1;i<=T;i++)
        { 
            StringTokenizer line = new StringTokenizer(br.readLine());
            long x=Long.parseLong(line.nextToken());
            long y=Long.parseLong(line.nextToken());
            long speed =Long.parseLong(line.nextToken());
            double time =(distance(x, y))/(speed*speed);
            if(!hash_Set.containsKey(time))
                hash_Set.put(time,1L);
            else
                hash_Set.put(time,hash_Set.get(time)+1);
        }
        long sum=0;
      
        for(long ele:hash_Set.values())
            {
                if(ele>1)
                sum+=(ele*(ele-1))/2;
            }
            
            System.out.println(sum);
        
}
//Calculating distance
static long distance(long x1,long y1)
{
    long dist=x1*x1 + y1*y1; 
    return dist;
}
}

/*
5
5 12 1
16 63 5
-10 24 2
7 24 2
-24 7 2
*/
