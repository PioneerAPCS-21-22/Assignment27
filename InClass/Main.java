
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Width: ");
        int w = in.nextInt();
        System.out.print("Height: ");
        int h = in.nextInt();
        
        System.out.println("\n(r, c)\n");
        
        for(int r = 0; r < h; r++)
        {
            for(int c = 0; c < w; c++)
            {
                System.out.print("(" + r + ", " + c + ")\t");
            }
            
            System.out.println();
        }
    }
}