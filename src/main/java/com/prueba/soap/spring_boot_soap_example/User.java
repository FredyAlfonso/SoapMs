package com.prueba.soap.spring_boot_soap_example;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="user", propOrder = {
        "name",
        "empId",
        "salary"
})
public class User {
    @XmlElement(required = true)
    private String name;
    private int empId;
    private double salary;

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

    /**
     * Gets the value of the empId property.
     *
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     *
     */
    public void setEmpId(int value) {
        this.empId = value;
    }

    /**
     * Gets the value of the salary property.
     *
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     *
     */
    public void setSalary(double value) {
        this.salary = value;
    }
}
