import java.util.Scanner;

class calculator
{

public static void add()
{
    System.out.println("************************");
    System.out.println("*** Addition Programc***");
    System.out.println("************************");

    int sum;

    Scanner reader_num1 = new Scanner(System.in);  // Begin reading from System.in
    System.out.println("Please enter the first number: ");
    int num1 = reader_num1.nextInt(); // Scans the next token of the input as an int.
    //once finished
    reader_num1.close(); //close the reading process

    Scanner reader_num2 = new Scanner(System.in);
    System.out.println("Please enter the first number: ");
    int num2 = reader_num2.nextInt();
    reader_num2.close();

    sum = num1 + num2;

    System.out.printf("Your answer is: ", sum);
}

public static void subtract()
{
    System.out.println("***************************");
    System.out.println("*** Subtraction Program ***");
    System.out.println("***************************");

    int sum;

    Scanner reader_num1 = new Scanner(System.in);  // Begin reading from System.in
    System.out.println("Please enter the first number: ");
    int num1 = reader_num1.nextInt(); // Scans the next token of the input as an int.
    //once finished
    reader_num1.close(); //close the reading process

    Scanner reader_num2 = new Scanner(System.in);
    System.out.println("Please enter the first number: ");
    int num2 = reader_num2.nextInt();
    reader_num2.close();

    sum = num1 - num2;

    System.out.printf("Your answer is: ", sum);
}

public static void multiply()
{
    System.out.println("*****************************");
    System.out.println("*** Multiplication Program***");
    System.out.println("*****************************");

    int sum;

    Scanner reader_num1 = new Scanner(System.in);  // Begin reading from System.in
    System.out.println("Please enter the first number: ");
    int num1 = reader_num1.nextInt(); // Scans the next token of the input as an int.
    //once finished
    reader_num1.close(); //close the reading process

    Scanner reader_num2 = new Scanner(System.in);
    System.out.println("Please enter the first number: ");
    int num2 = reader_num2.nextInt();
    reader_num2.close();

    sum = num1 * num2;

    System.out.printf("Your answer is: ", sum);
}

public static void divide()
{
    System.out.println("***********************");
    System.out.println("*** Division Program***");
    System.out.println("***********************");

    int sum;

    Scanner reader_num1 = new Scanner(System.in);  // Begin reading from System.in
    System.out.println("Please enter the first number: ");
    int num1 = reader_num1.nextInt(); // Scans the next token of the input as an int.
    //once finished
    reader_num1.close(); //close the reading process

    Scanner reader_num2 = new Scanner(System.in);
    System.out.println("Please enter the first number: ");
    int num2 = reader_num2.nextInt();
    reader_num2.close();

    sum = num1 / num2;

    System.out.printf("Your answer is: ", sum);
}

public static void main(String args[])
{
    int choice;

    System.out.println("******************************");
    System.out.println("*** Simple Java Calculator ***");
    System.out.println("****** by Will Holbrook ******");
    System.out.println("******************************\n");

    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide\n");
    
    System.out.println("Which operand would you like to use? \n\n");

    Scanner reader_choice = new Scanner(System.in);
    choice = reader_choice.nextInt();
    reader_choice.close();

    if (choice == 1)
    {
        add();
    }
    if (choice == 2)
    {
        subtract();
    }
    if (choice == 3)
    {
        multiply();
    }
    if (choice == 4)
    {
        divide();
    }
}
}