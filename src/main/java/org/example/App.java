package org.example;

import javax.swing.*;
import java.util.function.BiFunction;


/**
 * Hello world!
 */
public class App {

    final static BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
    private int num1 = 0;
    private int num2 = 0;

    public void process() {

        try {

            num1 = Integer.parseInt(JOptionPane.showInputDialog("Please give a number:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Please give a second number:"));
            int num3 = add.apply(num1, num2);
            //num3 does not have to be global because it is already validated.

            JOptionPane.showMessageDialog(null,
                    num1 + " + " + num2 + " = " + num3);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Wrong input entered. Start again using numbers.");
            process();
        }

    }

    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Give two numbers. Both will be" +
                " added and the result will be shown....");

        new App().process();

    }
}
