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
        int num1, num2, product;

        Scanner scanner = new Scanner(System.in);
        name = JOptionPane.showInputDialog("What is your full name?");

        //JOptionPane.showInputDialog returns a string; we need to convert it to a number before storing in int
        num1= Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

        product = num1 * num2;
        msgTitle ="Java program by " + name + "!";
        strOutput="The product of " + num1 +
                " and " + num2 + " is " + product;

        //outputs to a console
        System.out.println(msgTitle +"\n" + strOutput);

        ImageIcon icon = new ImageIcon("src/JavaLogo.png");
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
            break;
            case JOptionPane.NO_OPTION: strOutput += "NO\n";
            default: strOutput += "I am going to exit anyway :) \n";
            break;
        }

        System.out.println(strOutput);
        scanner.close();
    }
}

/*
Java program by Garrett BRUNSCH!
The product of 15 and 3 is 45
You selected: NO
I am going to exit anyway :)


Process finished with exit code 0


Java program by Garrett Brunsch!
The product of 2 and 25 is 50
You selected: YES


Process finished with exit code 0
 */
