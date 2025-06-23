public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document word = wordFactory.createDocument();
        Document pdf = pdfFactory.createDocument();
        Document excel = excelFactory.createDocument();

        System.out.println("Created document of type: " + word.getType());
        System.out.println("Created document of type: " + pdf.getType());
        System.out.println("Created document of type: " + excel.getType());
    }
}