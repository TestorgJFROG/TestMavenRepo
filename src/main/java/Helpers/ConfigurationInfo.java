package Helpers;

import org.apache.commons.configuration.XMLConfiguration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationInfo {
    public static String URL;

    public static String environmentType;
    public static UsersInfo USERSINFO;
    public static String userType;

    static {
        HashMap<String, Object> config = read();
        URL=config.get("url").toString();
        if (config != null) {
            try {
                URL = (String) config.get("url");

                if (URL.contains("dev")) {
                    environmentType = "dev";
                } else if (URL.contains("staging")) {
                    environmentType = "staging";
                } else if (URL.contains("prod")) {
                    environmentType = "prod";
                } else if (URL.contains("qa")) {
                    environmentType = "qa";
                }

               File file = new File("Users.xml");
                try {
                    JAXBContext jaxbContext = JAXBContext.newInstance(UsersInfo.class);
                    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                    USERSINFO = (UsersInfo) jaxbUnmarshaller.unmarshal(file);
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    private static HashMap<String, Object> read() {
        XMLConfiguration config;
        HashMap<String, Object> map = new HashMap<>();
        try {
            config = new XMLConfiguration("Configuration.xml");
            map.put("url", config.getString("url"));

            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
