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

            name = JOptionPane.showInputDialog("What is your  full name?");


        //JOptionPane.showInputDialog returns a string; we need to convert it to a number before storing in int
        num1= Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));


            sum = num1 + num2;
            msgTitle ="Java program by " + name + "!";
            strOutput="The product of " + num2+
                     "and " + num2 + " is " + sum;

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
            case JOptionPane.YES_OPTION: strOutput += "YES";
            case JOptionPane.NO_OPTION: strOutput += "NO";
            default: strOutput += "\nI am going to exit anyway :) ";
        }

 System.out.println(strOutput);
            scanner.close();
        }
    }

/*
Copy and paster your test runs/output here
 */
