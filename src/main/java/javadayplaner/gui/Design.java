package javadayplaner.gui;

import javax.swing.border.Border;
import java.awt.*;

/**
 * The Design class represents the design settings for a graphical user interface.
 * It encapsulates various properties such as background color, text color, fonts, and borders.
 */
public class Design {

    private final Color backgroundColor;
    private final Color backgroundColorComponents;
    private final Color textColor;
    private final Color textColorHeader;
    private final Font textFont;
    private final Font textFontHeader;
    private final Border borderButtons;
    private final Border borderComponents;
    private final Border borderHeader;
    private final Color caretColor;

    public Design(Color backgroundColor, Color backgroundColorComponents, Color textColor, Color textColorHeader, Font textFont, Font textFontHeader, Border borderButtons, Border borderComponents, Border borderHeader, Color caretColor) {
        this.backgroundColor = backgroundColor;
        this.backgroundColorComponents = backgroundColorComponents;
        this.textColor = textColor;
        this.textColorHeader = textColorHeader;
        this.textFont = textFont;
        this.textFontHeader = textFontHeader;
        this.borderButtons = borderButtons;
        this.borderComponents = borderComponents;
        this.borderHeader = borderHeader;
        this.caretColor = caretColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getBackgroundColorComponents() {
        return backgroundColorComponents;
    }

    public Color getTextColor() {
        return textColor;
    }

    public Color getTextColorHeader() {
        return textColorHeader;
    }

    public Font getTextFont() {
        return textFont;
    }

    public Font getTextFontHeader() {
        return textFontHeader;
    }

    public Border getBorderButtons() {
        return borderButtons;
    }

    public Border getBorderComponents() {
        return borderComponents;
    }

    public Border getBorderHeader() {
        return borderHeader;
    }
}
