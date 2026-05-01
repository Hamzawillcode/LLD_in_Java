package Lecture7.gooddesign;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentType> documentElements=new ArrayList<>();
    public void addElement(DocumentType element){
        documentElements.add(element);
    }
    public String render(){
        StringBuilder sb=new StringBuilder();
        for(DocumentType elements:documentElements){
            sb.append(elements.render());
        }
        return sb.toString();
    }

}
