package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbin = new Scanner(System.in);
        int val = 1;

        boolean con = true;

        while(con)
        {
            try
            {
                val = Integer.parseInt(kbin.nextLine());
                if(val > 2 && val <10)
                    con = false;
                else
                    System.out.printf("Please input a number from 3 to 9 inclusive");
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input, numbers only");
            }
        }

        //Makes three "poles" as integer arrays
        int pole1[] = new int [val];
        int pole2[] = new int [val];
        int pole3[] = new int [val];

        for(int i = 0; i < val; i++)
        {
            System.out.println(i);
            pole1[val] = -1;
            pole2[val] = -1;
            pole3[val] = -1;
        }

        for (int x: pole1)
        {
            System.out.println(x);
        }


    }
}
