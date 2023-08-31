package utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class DefaultConfiguration {

    protected static Logger logger = LogManager.getLogger("connector");
    protected static final String DEFAULT_CONFIGURATION = "Configs/Configuration.properties";
    protected static Properties props = new Properties();

    static {
        loadProperties(props, DEFAULT_CONFIGURATION);
    }

    protected static Properties loadProperties(Properties props, String configurationFile) {
        try {
            logger.debug("Loading Default properties file configuration:");

            props.load(new FileInputStream(new File(configurationFile)));
        } catch (Exception e) {
            logger.error("Error while loading Default properties file configuration: " + e);
            e.printStackTrace();
            props = null;
        }
        return props;
    }

    public static String getProperty(String name) {
        return props.getProperty(name, null);
    }









}
