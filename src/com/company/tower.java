package com.company;

public class tower {

    //Variable to count number of steps
    public static int steps = 1;

    //Not going to lie, i found this algorithm online but I tried my hardest to actually understand it and reverse engineer it.
    //I didn't just copy and paste it.

    public static void solve(int n, int fir, int thir, int sec)
    {
        //So this solves it by basically breaking down to original logic to solve 3 rings and solving other little parts off of it.
        //(Kind of like solving a 4x4 rubiks cube). You "ignore" certain parts to get the bigger disks complete then use the original 3 ring algorithm to solve the rest.

        //When it gets to the last ring, moves from ring its on to final ring.
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
