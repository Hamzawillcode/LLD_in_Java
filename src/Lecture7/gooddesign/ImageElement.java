package Lecture7.gooddesign;

public class ImageElement implements DocumentType{
    String imageElement;

    public ImageElement(String imageElement) {
        this.imageElement = imageElement;
    }

    @Override
    public String render() {
        return imageElement;
    }
}
