package gr.aueb.cf.ch4;

/**
 * αεναο for loop
 */
public class SpecialForCaseApp
{
    public static void main(String[] args)
    {
        int counter = 0;

        for ( ; ;)
        {
            System.out.println("forever");
            counter++;
            if (counter % 20 == 0) System.out.println();
            if (counter == 100) break; //χωρις αυτο θα ειναι αεναο loop
        }

    }
}
