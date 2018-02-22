package Helpers;

import javax.xml.bind.annotation.XmlElement;


public class User {
    @XmlElement
    public String type;
    @XmlElement
    public String login;
    @XmlElement
    public String password;


    public User copy() {
        User user = new User();
        user.type = this.type;
        user.login = this.login;
        user.password = this.password;

        return user;
    }
}