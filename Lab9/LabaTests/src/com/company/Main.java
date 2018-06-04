package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner sc = new Scanner(System.in);
        TestsCollection tests = new TestsCollection();
        System.out.println("Welcome!");

        do {
            System.out.print("  1 - Create test\n  2 - Pass test\n  3 - Save test \n >: ");

            switch (sc.nextInt()) {

                case 1:
                    System.out.print("Enter count of tests: ");
                    tests.createTest(sc.nextInt());
                    break;
                case 2:
                    if (!tests.isEmpty())
                        tests.passTest();
                    else
                        System.out.println("You haven't got tests");
                    break;
                case 3: tests.saveTest();
                    break;
              /*  case 4:tests.readTest();
                    default:
                        break;*/
            }
            System.out.print("Repeat, and (or) pass test: ");
        }while(sc.next().compareToIgnoreCase("yes") == 0);

    }
}
