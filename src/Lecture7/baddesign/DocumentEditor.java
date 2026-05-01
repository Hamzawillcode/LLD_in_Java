package Lecture7.baddesign;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class DocumentEditor {
    private List<String> list;
    private String render;

    public DocumentEditor() {
        this.list = new ArrayList<>();
        this.render = "";
    }
    public void addText(String text){
        list.add(text);
    }
    public void addImage(String path){
        list.add(path);
    }
    public String render(){
        if(render.isEmpty()){
            StringBuilder sb=new StringBuilder();
            for(String str:list){
                if(str.length()>4&&str.endsWith(".jpg")||str.endsWith(".png")){
                    sb.append("[Image:").append(str).append("]\n");
                }
                else{
                    sb.append(str).append("\n");
                }
            }
            render= sb.toString();
        }
        return render;
    }
    public void saveToFile(){
        try {
            FileWriter writer = new FileWriter("document.txt");
            writer.write(render());
            writer.close();
            System.out.println("Document saved to document.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing.");
        }
    }
    }

