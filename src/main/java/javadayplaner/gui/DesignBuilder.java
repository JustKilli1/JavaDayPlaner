package javadayplaner.gui;

import javax.swing.border.Border;
import java.awt.*;

/**
 * The DesignBuilder class is used to construct instances of the Design class.
 * It provides a fluent interface for setting different design properties and
 * allows the user to build the final Design object.
 */
public class DesignBuilder {

    private Color backgroundColor;
    private Color backgroundColorComponents;
    private Color textColor;
    private Color textColorHeader;
    private Font textFont;
    private Font textFontHeader;
    private Border borderButtons;
    private Border borderComponents;
    private Border borderHeader;
    private Color caretColor;

    public DesignBuilder setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public DesignBuilder setBackgroundColorComponents(Color backgroundColorComponents) {
        this.backgroundColorComponents = backgroundColorComponents;
        return this;
    }

    public DesignBuilder setTextColor(Color textColor) {
        this.textColor = textColor;
        return this;
    }

    public DesignBuilder setTextColorHeader(Color textColorHeader) {
        this.textColorHeader = textColorHeader;
        return this;
    }

    public DesignBuilder setTextFont(Font textFont) {
        this.textFont = textFont;
        return this;
    }

    public DesignBuilder setTextFontHeader(Font textFontHeader) {
        this.textFontHeader = textFontHeader;
        return this;
    }

    public DesignBuilder setBorderButtons(Border borderButtons) {
        this.borderButtons = borderButtons;
        return this;
    }

    public DesignBuilder setBorderComponents(Border borderComponents) {
        this.borderComponents = borderComponents;
        return this;
    }

    public DesignBuilder setBorderHeader(Border borderHeader) {
        this.borderHeader = borderHeader;
        return this;
    }

    public void setCaretColor(Color caretColor) {
        this.caretColor = caretColor;
    }

    public Design build() {
        return new Design(backgroundColor, backgroundColorComponents, textColor, textColorHeader, textFont, textFontHeader, borderButtons, borderComponents, borderHeader, caretColor);
    }
}
