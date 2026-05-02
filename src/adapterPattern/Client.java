package adapterPattern;

public class Client {

    public void getReport(IReport report,String rawdata){
        System.out.println(report.getJSON(rawdata));
    }
}
