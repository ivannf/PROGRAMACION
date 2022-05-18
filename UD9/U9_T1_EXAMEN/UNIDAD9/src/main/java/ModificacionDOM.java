import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/restaurante.xml"));

            NodeList nl = doc.getElementsByTagName("plato");

            for (int i = 0; i < nl.getLength() ; i++) {
                Element disponible = doc.createElement("disponible");
                disponible.setTextContent("si");
                nl.item(i).appendChild(disponible);
            }

            Node root = doc.getDocumentElement();

            Element plato = doc.createElement("plato");
            plato.setAttribute("calorias","650");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Guisantes");

            Element precio = doc.createElement("precio");
            precio.setTextContent("7.50");

            Element disponible = doc.createElement("disponible");
            disponible.setTextContent("si");

            plato.appendChild(nombre);
            plato.appendChild(precio);
            plato.appendChild(disponible);

            root.appendChild(plato);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File examen2 = new File("examen2.xml");
            StreamResult destino = new StreamResult(examen2);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
