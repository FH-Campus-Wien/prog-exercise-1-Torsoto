package at.ac.fhcampuswien;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                        "(__/\\__ \\--/ __" + System.lineSeparator() +
                        "   \\___|----|  |   __" + System.lineSeparator() +
                        "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                        "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                        "      (--/\\--)    \\__/" + System.lineSeparator() +
                        "      _)(  )(_" + System.lineSeparator() +
                        "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char a = (int) 'Z';
        int b = 0xface;
        int c = 012;
        float d = 80L;
        int e = (int) 44e-1f;
        int f = (int) 5.5f;
        int g = (int) 8.88e1;
        int h = (int) 99.9;

        int sum = (int) (a+b+c+d+e+f+g+h);
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x , y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.println("x: " + "y: "+"After Swap:");
        x = scan.nextInt();
        y = scan.nextInt();
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        int n1, n2;
        n1 = s.nextInt();
        n2 = s.nextInt();
        if (n1>n2) {
            System.out.println("n1: "+"n2: "+"n1 > n2");
        }
        if (n1<n2){
            System.out.println("n1: "+"n2: "+"n2 > n1");
            }
        if (n1==n2) {
            System.out.println("n1: "+ "n2: "+"n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        int x;
        System.out.print("Enter annual Revenue: ");
        x = s.nextInt();
        if (x<0 || x>=100000) {
            System.out.print("Invalid Revenue" + System.lineSeparator());
        }
        else if (x<20000){
            System.out.print("Poor Sales Revenue" + System.lineSeparator());
        }
        else if (x<=50000){
            System.out.print("Average Sales Revenue");
        }
        else if (x<80000){
            System.out.println("Good Sales Revenue");
        }
        else
            System.out.println("Excellent Sales Revenue");
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    Scanner s = new Scanner(System.in);
        int commission = s.nextInt();
        switch (commission){
            case 0:
                System.out.print("Enter CommissionClass: "+"Your Commission Rate was set to 0.0"+ System.lineSeparator());
                break;
            case 1:
                System.out.print("Enter CommissionClass: "+"Your Commission Rate was set to 0.01"+ System.lineSeparator());
                break;
            case 2:
                System.out.print("Enter CommissionClass: "+"Your Commission Rate was set to 0.02"+ System.lineSeparator());
                break;
            case 3:
                System.out.print("Enter CommissionClass: "+"Your Commission Rate was set to 0.03"+ System.lineSeparator());
                break;
            case 4:
                System.out.print("Enter CommissionClass: "+"Your Commission Rate was set to 0.04"+ System.lineSeparator());
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        if (x % 4 == 0 && x % 400 == 0) {
            System.out.println("Year: "+"Leapyear");
        }
        else System.out.println("Year: "+"Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int rev = 0;
        while (x!=0 && x<=999){
            rev=rev*10 + x%10;
            x=x/10;
        }
        System.out.println("Number: "+rev);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}