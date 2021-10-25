import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final Logger logger= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
//        logger.trace("message");
//        logger.debug("message");
//        logger.info("asdasda");
//        logger.warn("sadadasd");
//        logger.error("asdadasd");


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter radius");
            String radiusStr = reader.readLine();
            Double radius = Double.parseDouble(radiusStr);
            Double result = radius * radius * Math.PI;
            System.out.println(result);
            logger.trace("Area for the system input is: " + result );
        } catch (IOException ex) {
            logger.error("Error during reading system input", ex);
        } catch (NumberFormatException ex) {
            logger.error("Error during parsing system input", ex);
        }
    }
}
