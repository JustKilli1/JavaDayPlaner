package javadayplaner.base;

import javadayplaner.gui.Design;
import javadayplaner.gui.DesignBuilder;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static final Design DESIGN = new DesignBuilder()
                                            .setBackgroundColor(new Color(34, 34, 34))
                                            .setBackgroundColorComponents(new Color(255, 228, 196))
                                            .setTextColor(new Color(255, 255, 255))
                                            .setTextColorHeader(new Color(255, 165, 0))
                                            .setCaretColor(new Color(255, 0, 0))
                                            .setTextFontHeader(new Font("Arial", Font.PLAIN, 16))
                                            .setTextFont(new Font("Arial", Font.PLAIN, 12))
                                            .setBorderButtons(null)
                                            .setBorderHeader(null)
                                            .setBorderComponents(null)
                                            .build();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        JOptionPane.showMessageDialog(null, "Hello \nHow are\nYou askdaskdjalsdasdasdasdasdas");
    }
}