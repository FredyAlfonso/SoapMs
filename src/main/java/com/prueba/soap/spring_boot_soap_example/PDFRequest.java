package com.prueba.soap.spring_boot_soap_example;

import javax.xml.bind.annotation.*;
import java.io.File;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "file"
})
@XmlRootElement(namespace="http://soap.prueba.com/springboot-soap-example",name = "pdfRequest")
public class PDFRequest {
    @XmlElement(namespace="http://soap.prueba.com/springboot-soap-example", required = true)
    private String name;
    @XmlElement(namespace="http://soap.prueba.com/springboot-soap-example", required = true)
    private byte[] file;

    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
    }
    public byte[] getFile() {
        return file;
    }
    public void setFile(byte[] value) {
        this.file = value;
    }
}
