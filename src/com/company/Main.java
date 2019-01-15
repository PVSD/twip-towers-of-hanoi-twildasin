package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbin = new Scanner(System.in);
        int val = 1;

        boolean con = true;

        System.out.println("Welcome to Tower of Hanoi Game Walk-through!\nPlease enter the numbers of rings you want between 3 and 9 (inclusive).");

        //While loops checks for correct user answer (number from 3 - 9 inclusive).
        while(con)
        {
            try
            {
                val = Integer.parseInt(kbin.nextLine());
                //Checks if value is in the correct range;
                if(val > 2 && val <10)
                    //Changes bool to exit the while loop
                    con = false;
                else
                    System.out.println("Please input a number from 3 to 9 inclusive");
            }
            //Catches an error if the input is not a number
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input, numbers only");
            }
        }


        tower.solve(val, 1,3,2);

    }
}
