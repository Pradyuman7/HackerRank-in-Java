import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
    
    //Write your code here
    Difference(int[] elements) 
    {
        this.elements = elements;
    }

    public void Difference() 
    {
        int max = 0;

        for (int i = 0; i < elements.length; i++) 
        {
            for (int j = 0; j < elements.length; j++) 
            {
                int abs = Math.abs(elements[i] - elements[j]);
                
                if (abs > max) 
                    max = abs;
            }
        }

        maximumDifference = max;
    }
} 
//End of Difference class

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.Difference();

        System.out.print(difference.maximumDifference);
    }
}