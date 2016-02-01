package net.lubot.StrimBagZPush;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * This file is part of StrimBagZ-Push.
 * Created by unlink on 01/02/16.
 */
public class StrimBagZPush {
    public static Logger log = Logger.getLogger(StrimBagZPush.class.toString());
    public static Properties config = new Properties();

    public static void main(String[] args) {
        //read properties
        try {
            config.load(new FileReader(new File("./config.properties")));
        } catch(IOException e) {
            log.warning(e.toString());
        }
    }
}
