package com.luxoft.basics.part3;

public class E4_for_Loop
{
    public static void main(String[] args)
    {
        String[] bF = { "B ", "B ", "B ", "B ", "B ", "B ", "B ", "B ", "B ","B ", "B ", "B ", "B ", "B ", "B ", "B ", "B ", "B ",};
         for ( int i = 0; i < bF.length; i+=6)
         {
             System.out.println(bF[i] + bF[i+1] + bF[i+2] + bF[i+3] + bF[i+4] + bF[i+5]);

         }



    }
}
