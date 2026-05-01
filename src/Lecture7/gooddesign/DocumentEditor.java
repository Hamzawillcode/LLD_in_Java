package Lecture7.gooddesign;

public class DocumentEditor {
    private Document doc;
    private Persistence storage;
    private String renderedDocument;

    public DocumentEditor(Document doc,Persistence storage){
        this.doc=doc;
        this.storage=storage;
        this.renderedDocument="";
    }
    public void addText(String text){
        doc.addElement(new TextElement(text));
    }
    public void addImage(String path){
        doc.addElement(new ImageElement(path));
    }
    public void addNewLine(){
        doc.addElement(new NewLine());
    }
    public void addTabSpace(){
        doc.addElement(new TabSpace());
    }
    public String renderDocument(){
        if(renderedDocument.isEmpty()){
            renderedDocument=doc.render();
        }
        return renderedDocument;
    }
    public void saveDocument(){
        storage.save(renderDocument());
    }
}
