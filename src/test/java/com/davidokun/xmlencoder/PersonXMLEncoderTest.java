package com.davidokun.xmlencoder;

import org.junit.Before;
import org.junit.Test;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by David Marin on 25/06/2015.
 */
public class PersonXMLEncoderTest {

    private XMLEncoder encoder;
    private XMLDecoder decoder;

    @Before
    public void init() throws FileNotFoundException {
        this.encoder = new XMLEncoder(new FileOutputStream(new File("person_encoder.xml")));
        this.decoder = new XMLDecoder(new FileInputStream(new File("person_encoder.xml")));
    }

    @Test
    public void encode(){
        encoder.writeObject(new PersonXMLEncoder("Jane", "Doe", 31));
        encoder.flush();

        final Object person = decoder.readObject();

        System.out.println(person.toString());
    }
}