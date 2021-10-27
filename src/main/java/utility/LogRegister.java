package utility;

import org.apache.log4j.Logger;

public class LogRegister {
    public static Logger log = Logger.getLogger("Cr test");



    public static void printLogInfo(String mensaje) {

        try {
            log.info(mensaje);
        } catch (Exception e) {
            log.error(e);
        }

    }

    public static void printLogError(String mensaje) {
        try {
            log.error(mensaje);
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }

}
