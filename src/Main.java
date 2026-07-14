import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];
        for (int index = 0; index < dataPoints.length; index++)
        {
            dataPoints[index] = rnd.nextInt(100) + 1;
        }
        System.out.println("The values in the array are:");

        for (int index = 0; index < dataPoints.length; index++)
        {
            System.out.print(dataPoints[index] + " | ");
        }

        System.out.println();
        int sum = 0;

        for (int index = 0; index < dataPoints.length; index++)
        {
            sum = sum + dataPoints[index];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println();
        System.out.println("The sum of the values is: " + sum);
        System.out.println("The average of the values is: " + average);

        int searchValue = SafeInput.getRangedInt(
                in,
                "Enter a number to search for",
                1,
                100
        );
        int count = 0;

        for (int index = 0; index < dataPoints.length; index++)
        {
            if (dataPoints[index] == searchValue)
            {
                count++;
            }
        }

        System.out.println(
                "The number " + searchValue +
                        " was found " + count + " time(s) in the array."
        );
        int secondSearchValue = SafeInput.getRangedInt(
                in,
                "Enter another number to search for",
                1,
                100
        );

        boolean found = false;
        int foundIndex = -1;

        for (int index = 0; index < dataPoints.length; index++)
        {
            if (dataPoints[index] == secondSearchValue)
            {
                found = true;
                foundIndex = index;
                break;
            }
        }

        if (found)
        {
            System.out.println(
                    "The number " + secondSearchValue +
                            " was first found at array index " + foundIndex + "."
            );
        }
        else
        {
            System.out.println(
                    "The number " + secondSearchValue +
                            " was not found in the array."
            );
            int minimum = dataPoints[0];
            int maximum = dataPoints[0];

            for (int index = 1; index < dataPoints.length; index++)
            {
                if (dataPoints[index] < minimum)
                {
                    minimum = dataPoints[index];
                }

                if (dataPoints[index] > maximum)
                {
                    maximum = dataPoints[index];
                }
            }

            System.out.println("The minimum value in the array is: " + minimum);
            System.out.println("The maximum value in the array is: " + maximum);
            double[] doubleDataPoints = new double[dataPoints.length];

            for (int index = 0; index < dataPoints.length; index++)
            {
                doubleDataPoints[index] = dataPoints[index];
            }

            System.out.println("Average of dataPoints is: " + getAverage(doubleDataPoints));
        }
    }
    public static double getAverage(double[] values)
    {
        double total = 0;

        for (int index = 0; index < values.length; index++)
        {
            total = total + values[index];
        }

        return total / values.length;

    }
}