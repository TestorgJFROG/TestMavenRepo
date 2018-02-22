package Helpers;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class UsersInfo {
    @XmlElementWrapper(name = "users")
    @XmlElement(name = "user")
    public User[] users;

    public User getUserByName(String name) {
        for (User user : users) {
            if (user.login.equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByType(String type){
        for (User user : users) {
            if (user.type.equals(type)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByNameAndType(String name, String type) {
        for (User user : users) {
            if (user.login.toLowerCase().equals(name) && user.type.toLowerCase().equals(type)) {
                return user;
            }
        }
        return null;
    }
}