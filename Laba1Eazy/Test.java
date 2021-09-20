package Laba1Eazy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("test.in"));
        Scanner test = new Scanner(new FileInputStream("test.out"));
        int testNumber = 1;
        while (in.hasNextLine()) {
            String data = in.nextLine();
            long testAns = new Calc(new StringSource(data.toCharArray())).cout();
            long ans = test.nextInt();
            System.out.print("Test " + testNumber + ": ");
            if (ans  == testAns) {
                System.out.println("passed");
            } else {
                System.out.println("failed expected: " + ans + " actual: " + testAns);
            }
            testNumber++;
        }
        //System.out.println(calc.cout());
    }
}
