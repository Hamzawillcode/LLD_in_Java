package Lecture7.gooddesign;

public class TabSpace implements DocumentType{
    @Override
    public String render() {
        return "\t";
    }
}
