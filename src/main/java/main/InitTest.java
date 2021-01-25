package main;


import java.util.logging.Level;
import java.util.logging.Logger;

public class InitTest {
    private static final Logger LOGGER = Logger.getLogger(InitTest.class.getName());
    public static void main(String[] args){
        LOGGER.log(Level.FINE, "log test");
        LOGGER.info("Test information");
        LOGGER.warning("Test Warning");
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.insert(5, "xDD");
        sb.reverse();
    }
}
