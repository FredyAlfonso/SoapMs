package com.prueba.soap.spring_boot_soap_example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name"
})
@XmlRootElement(namespace="http://soap.prueba.com/springboot-soap-example",name = "usersRequest")
public class UsersRequest {
}
