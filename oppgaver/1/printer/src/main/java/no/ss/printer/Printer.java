package no.ss.printer;

import java.util.logging.Logger;

public class Printer {
    private final Logger logger = Logger.getLogger("PrinterLogger");

    public void println(String message) {
        logger.info(message);
    }
}
