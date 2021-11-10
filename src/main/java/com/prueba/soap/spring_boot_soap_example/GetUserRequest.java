package com.prueba.soap.spring_boot_soap_example;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name"
})
@XmlRootElement(namespace="http://soap.prueba.com/springboot-soap-example",name = "getUserRequest")
public class GetUserRequest {
    @XmlElement(namespace="http://soap.prueba.com/springboot-soap-example", required = true)
    private String name;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }
}
