package com.davidokun.jaxb;

import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by David Marin on 25/06/2015.
 */
public class PersonJAXBTest {

    private JAXBContext context;

    @Before
    public void init() throws JAXBException {
        this.context = JAXBContext.newInstance(PersonJAXB.class);
    }

    @Test
    public void writeObject() throws JAXBException {

        final Marshaller marshaller = this.context.createMarshaller();
        marshaller.marshal(new PersonJAXB("John", "Doe", 37), new File("person_jaxb.xml"));

        final Unmarshaller unmarshaller = this.context.createUnmarshaller();
        final Object unmarshal = unmarshaller.unmarshal(new File("person_jaxb.xml"));

        System.out.println(unmarshal.toString());
    }
}