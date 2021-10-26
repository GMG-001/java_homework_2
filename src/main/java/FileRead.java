import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileRead {
    private static final Logger logger= LoggerFactory.getLogger(FileRead.class);

    public static void fileInputOutput() {
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/data.txt"));
            String line = bufferedReader.readLine();
            double sum = 0;
            int count = 0;
            while (line != null) {
                sum += Integer.parseInt(line);
                line = bufferedReader.readLine();
                count++;
            }

            double average = sum/count;
            String averageFinal = "\n"+String.valueOf(average);


            BufferedWriter br = new BufferedWriter(new FileWriter("src/main/resources/data.txt",true));
            br.write(averageFinal);
            br.close();
            logger.trace("average is: " + averageFinal );
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            logger.error("Error during reading system input", ex);
        }

    }
}

