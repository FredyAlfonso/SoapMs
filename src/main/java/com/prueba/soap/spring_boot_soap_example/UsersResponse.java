package com.prueba.soap.spring_boot_soap_example;

import javax.xml.bind.annotation.*;
import java.util.Collection;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "usersResponse")
public class UsersResponse {
    @XmlElement(name="user")
    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }
    public void setUsers(Collection<User> values) {
        this.users = values;
    }
}
