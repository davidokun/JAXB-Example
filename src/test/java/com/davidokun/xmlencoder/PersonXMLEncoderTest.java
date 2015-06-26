package com.davidokun.xmlencoder;

import org.junit.Before;
import org.junit.Test;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by David Marin on 25/06/2015.
 */
public class PersonXMLEncoderTest {

    private XMLEncoder encoder;

    @Before
    public void init() throws FileNotFoundException {
        this.encoder = new XMLEncoder(new FileOutputStream(new File("person_encoder.xml")));
    }

    @Test
    public void encode(){
        encoder.writeObject(new PersonXMLEncoder("Jane", "Doe", 31));
        encoder.flush();
    }
}