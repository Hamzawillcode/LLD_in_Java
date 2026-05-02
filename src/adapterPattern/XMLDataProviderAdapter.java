package adapterPattern;

public class XMLDataProviderAdapter implements IReport{
    XMLDataProvider prv;
    public XMLDataProviderAdapter(XMLDataProvider prv){
        this.prv=prv;
    }
    @Override
    public String getJSON(String data) {
       String xml=prv.getXML(data);
        // 2. Naïvely parse out <name> and <id> values
        int startName = xml.indexOf("<name>") + 6;
        int endName   = xml.indexOf("</name>");
        String name   = xml.substring(startName, endName);

        int startId = xml.indexOf("<id>") + 4;
        int endId   = xml.indexOf("</id>");
        String id    = xml.substring(startId, endId);
        return "{\"name\":\"" + name + "\", \"id\":" + id + "}";
    }
}
