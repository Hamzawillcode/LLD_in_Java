package Lecture7.gooddesign;

public class TextElement implements DocumentType{
    String textElement;

    public TextElement(String textElement) {
        this.textElement = textElement;
    }

    @Override
    public String render() {
        return textElement;
    }
}
