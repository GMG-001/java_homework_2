import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileRead {
    //ლოგერრის გამოზახება
    private static final Logger logger= LoggerFactory.getLogger(FileRead.class);

    //კითხულობს ფაილიდან ჩაწერილ ინფორმაციას ითვლის საშუალოს და წერს ფაილში
    public static void fileInputOutput() {
        try {
            //ფაილიდან წაკითხვა
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/data.txt"));
            String line = bufferedReader.readLine();
            int sum = 0;
            int count = 0;
            while (line != null) {
                sum += Integer.parseInt(line);
                line = bufferedReader.readLine();
                count++;
            }
            //საშუალოს გამოთვლა
            int average = sum/count;

            //ფაილში ჩაწერა
            BufferedWriter br = new BufferedWriter(new FileWriter("src/main/resources/data.txt",true));
            br.write("\n"+ average);
            br.close();

            //გამოთვლილი საშუაოს დალოგვა წარმატებით შესრულების შემთხვევაში
            logger.trace("average is: " + average );
        } catch (Exception ex) {
            //შეცდომის დალოგვა
            System.out.println(ex.getMessage());
            logger.error("Error during reading system input", ex);
        }

    }
}

