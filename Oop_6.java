   
   public static void main(String[] args) {
       new ReportService(Map.of(
        "pdf", new PdfReport() 

       ));

    } 

  static class ReportService {

    private final Map<String, Report> rerorts;{
        this.rerorts = rerorts; 
    } 

    public byte[] createReport(Document document, String reportType) {
    ;   // reportType = {"pdf-1", "json", "xml", ...}
       Report report = rerorts.get(reportType); 
       if (report == null) {
        throw new NoSuchElementExeption ("Не зарегистрирован отчет с типом \"" + reportType + "\"");
       }  

       return report.createReport(document);
    }

  }

  interface Report{
    byte [] createReport (Document document);
  }

  static class PdfReport implements Report {
    @Override
    public byte[] createReport(Document document){
        byte[] data = null;
        ; ... код формирующий PDF
       return data;
    }
  }

  static class Document {
    private long id;
    private String number;
    ; // ...
  }