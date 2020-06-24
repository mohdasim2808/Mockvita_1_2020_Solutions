# Mockvita_1_2020_Solutions

import java.io.*;
import java.util.*;


 class PhilCoin {


public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer line = new StringTokenizer(br.readLine());
    int T=Integer.parseInt(line.nextToken());
    for (int i=1;i<=T;i++)
        { 
            int k=Integer.parseInt(br.readLine());
       int power=0;
       
     /*
     Every time no. of coins should be 2^k<=k
     i.e the power of two for which the result is 
     less than or equal to number (k).
     */
     
		while(Math.pow(2,power)<=k){
			power++;
			}
        System.out.println(power);

        }


    }
}

 
