package com.davidokun.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by David Marin on 25/06/2015.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonJAXB {

    private String firstName;
    private String lastName;
    private Integer age;

    public PersonJAXB() {
    }

    public PersonJAXB(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
