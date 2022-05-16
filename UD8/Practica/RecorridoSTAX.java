package Practica;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class RecorridoSTAX {
    public static void main(String[] args) {
        Integer numAlumnos = 0;

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("alumnos.xml"));

            while (xmlReader.hasNext()){

                XMLEvent xmlEvent = xmlReader.nextEvent();

                 if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();

                    if (endtag.getName().getLocalPart().equals("alumno")) {
                        numAlumnos++;
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hay "+numAlumnos+" alumnos");

    }
}