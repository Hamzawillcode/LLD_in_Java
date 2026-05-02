package adapterPattern;

public class AdapterPattern {
    static void main() {
        XMLDataProvider xml=new XMLDataProvider();
        IReport report=new XMLDataProviderAdapter(xml);
        Client client=new Client();
        String rawdata="Alice:42";
        client.getReport(report,rawdata);
    }
}
