import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {
    public static void main(String[] args) {
        Integer numPlatos = 0;

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("src/main/java/restaurante.xml"));

            while (reader.hasNext()) {

                XMLEvent xmlEvent = reader.nextEvent();

                if (xmlEvent.isEndElement()) {

                    EndElement endTag = xmlEvent.asEndElement();

                    if (endTag.getName().getLocalPart().equals("plato")) {
                        numPlatos++;
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hay " + numPlatos + " platos en la carta.");
    }
}