// Garrett Brunsch
// Lab #0

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Main
{
    public static void main(String[] args)
    {
        String name, strOutput, msgTitle;
        int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);
        name = JOptionPane.showInputDialog("What is your full name?");

        //JOptionPane.showInputDialog returns a string; we need to convert it to a number before storing in int
        num1= Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

        sum = num1 + num2;
        msgTitle ="Java program by " + name + "!";
        strOutput="The sum of " + num1 +
                " and " + num2 + " is " + sum;

        //outputs to a console
        System.out.println(msgTitle +"\n" + strOutput);

        ImageIcon icon = new ImageIcon("src/JavaLogo.jpg");
        JOptionPane.showMessageDialog(null, strOutput, msgTitle,
                JOptionPane.INFORMATION_MESSAGE, icon);

        //showConfirmDialog() will bring up a dialog with the options Yes and No
        int result = JOptionPane.showConfirmDialog(null,"Are you ready to exit?", "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        strOutput="You selected: ";
        //switch statement -fall through  demo
        switch (result)
        {
            case JOptionPane.YES_OPTION: strOutput += "YES\n";
            case JOptionPane.NO_OPTION: strOutput += "NO\n";
            default: strOutput += "I am going to exit anyway :) \n";
        }

        System.out.println(strOutput);
        scanner.close();
    }
}

/*
Java program by Garrett Brunsch!
The sum of 1 and 2 is 3
You selected: YESNO
I am going to exit anyway :)

Process finished with exit code 0

Java program by Garrett!
The sum of 5 and 3 is 8
You selected: NO
I am going to exit anyway :)

Process finished with exit code 0
 */
