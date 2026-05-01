package Lecture7.baddesign;

public class DocumentEditorClient {
    public static void main() {
        DocumentEditor editor=new DocumentEditor();
        editor.addText("Hello,World!");
        editor.addImage("picture.jpg");
        editor.addText("This is a document editor.");
        System.out.println(editor.render());
        editor.saveToFile();
    }
}
