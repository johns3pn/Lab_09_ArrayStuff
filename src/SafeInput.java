import java.util.Scanner;

public class SafeInput {

    /**
     *
     * @param pipe Scanner object
     * @param prompt prompt for user
     * @return non-empty String
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

        } while(retString.length() == 0);

        return retString;
    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int value;

        while(true)
        {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                return value;
            }
            else
            {
                System.out.println("Invalid integer. Try again.");
                pipe.nextLine();
            }
        }
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double value;

        while(true)
        {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            }
            else
            {
                System.out.println("Invalid number. Try again.");
                pipe.nextLine();
            }
        }
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value;

        while(true)
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();

                if(value >= low && value <= high)
                {
                    return value;
                }
                else
                {
                    System.out.println("Input must be between " + low + " and " + high + ".");
                }
            }
            else
            {
                System.out.println("Invalid integer. Try again.");
                pipe.nextLine();
            }
        }
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value;

        while(true)
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();

                if(value >= low && value <= high)
                {
                    return value;
                }
                else
                {
                    System.out.println("Input must be between " + low + " and " + high + ".");
                }
            }
            else
            {
                System.out.println("Invalid number. Try again.");
                pipe.nextLine();
            }
        }
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response;

        while(true)
        {
            System.out.print("\n" + prompt + " [Y/N]: ");

            response = pipe.nextLine();

            if(response.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y or N.");
            }
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String response;

        while(true)
        {
            System.out.print("\n" + prompt + ": ");

            response = pipe.nextLine();

            if(response.matches(regEx))
            {
                return response;
            }
            else
            {
                System.out.println("Invalid format. Try again.");
            }
        }
    }

    public static void prettyHeader(String msg)
    {
        int width = 60;
        int insideWidth = width - 6; // 3 stars on each side

        int spaces = (insideWidth - msg.length()) / 2;
        int remainingSpaces = insideWidth - msg.length() - spaces;

        for(int i = 0; i < width; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        System.out.print("***");

        for(int i = 0; i < spaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for(int i = 0; i < remainingSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for(int i = 0; i < width; i++)
        {
            System.out.print("*");
        }

        System.out.println();

    }

}


