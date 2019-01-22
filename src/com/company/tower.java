package com.company;

public class tower {

    //Variable to count number of steps
    public static int steps = 1;


    public static void solve(int n, int fir, int thir, int sec)
    {
        //So this solves it by basically breaking down to original logic to solve 3 rings and solving other little parts off of it.

        if (n==1)
        {
            System.out.println("Step #" + steps + ":\tMove ring 1 from pole " + fir + " to pole " + thir);
            steps++;
        }
        else
        {
            tower.solve(n-1, fir, sec, thir);
            System.out.println("Step #" + steps + ":\tMove ring " + n + " from pole " + fir + "  to pole " + thir);
            steps++;
            tower.solve(n-1, sec, thir, fir);
        }
    }
}
