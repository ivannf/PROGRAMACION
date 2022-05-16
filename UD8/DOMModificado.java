package Practica;

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

public class DOMModificado {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnos.xml"));

            Text saltoLinea = doc.createTextNode("\n");
            Text saltoLineaTab = doc.createTextNode("\n\t");

            NodeList nl = doc.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength() ; i++) {
                Element Instituto = doc.createElement("instituto");
                Instituto.setTextContent("IES ALIXAR");
                nl.item(i).appendChild(Instituto);
                nl.item(i).appendChild(saltoLineaTab);
            }

            Node root = doc.getDocumentElement();

            Element alumno = doc.createElement("alumno");
            alumno.setAttribute("dni","8888888X");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Luis");

            Element apellido = doc.createElement("apellido");
            apellido.setTextContent("Ruiz");

            Element direccion = doc.createElement("direccion");
            direccion.setTextContent("Allí");

            Element instituto = doc.createElement("instituto");
            instituto.setTextContent("IES ALIXAR");

            alumno.appendChild(saltoLinea);
            alumno.appendChild(nombre);
            alumno.appendChild(saltoLineaTab);
            alumno.appendChild(apellido);
            alumno.appendChild(saltoLineaTab);
            alumno.appendChild(direccion);
            alumno.appendChild(saltoLineaTab);
            alumno.appendChild(instituto);
            alumno.appendChild(saltoLinea);


            root.appendChild(alumno);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("alumnos_modificado.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
