package com.tavisca.converter;

import com.tavisca.Departments;
import com.tavisca.Employees;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XMLConverter implements Converter{

    @Override
    public void convert(Departments departments) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Departments.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(departments, System.out);
            File xml = new File("./file.xml");
            xml.createNewFile();
            jaxbMarshaller.marshal(departments, new FileWriter("./file.xml"));

        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }
    }
}
