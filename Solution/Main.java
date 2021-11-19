/**
 * A27
 * @author Mr. King
 * @version 11/19/2021
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size for shapes: ");
        int h = in.nextInt();
        
        rightTriangleNoIf(h);
        System.out.println();
        hollowSquare(h);
        System.out.println();
        isosceles(h);
    }

    /**
     * Prints a right triangle (by using an if inside the loop).
     */
    public static void rightTriangle(int h)
    {
        for(int r = 0; r < h; r++)
        {
            for(int c = 0; c < h; c++)
            {
                if(c <= r)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }

    /**
     * Prints a right triangle (no ifs).
     */
    public static void rightTriangleNoIf(int h)
    {
        for(int r = 0; r < h; r++)
        {
            for(int c = 0; c <= r; c++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /**
     * Prints a hollow square.
     */
    public static void hollowSquare(int h)
    {
        for(int r = 0; r < h; r++)
        {
            for(int c = 0; c < h; c++)
            {
                if(r == 0 || c == 0 || r == h-1 || c == h-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    /**
     * Prints an isosceles triangle of height h.
     */
    public static void isosceles(int h)
    {
        for(int r = 0; r < h; r++)
        {
            for(int c = 0; c < 2*h - 1; c++)
            {
                if(c < h - 1 - r || c >= (2*h - 1) - (h-1-r))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}

