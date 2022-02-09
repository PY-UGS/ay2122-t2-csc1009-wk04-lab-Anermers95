import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q1
        BMI bmi = new BMI();
        Scanner sc = new Scanner(System.in);
        //int test[];

        System.out.print("Enter weight in pounds: ");
        bmi.setWeight(sc.nextDouble());
        System.out.print("Enter height in inches: ");
        bmi.setHeight(sc.nextDouble());
        System.out.printf("BMI is %f\n", bmi.getBMI());
        System.out.print(bmi.getBMICatagory());

        //Q2
        StackOfIntegers stack = new StackOfIntegers();
        for(int i = 0; i < 10; ++i)
        {
            stack.push(i);
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        //System.out.printf("%d", stack.peek());

        sc.close();
    }
}
