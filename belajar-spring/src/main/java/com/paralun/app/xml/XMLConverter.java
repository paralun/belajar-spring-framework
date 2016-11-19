package com.paralun.app.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class XMLConverter {
    
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public Marshaller getMarshaller() {
        return marshaller;
    }

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    
    public void convertFromObjectToXML(Object object, File filepath) throws IOException{
        try(FileOutputStream os = new FileOutputStream(filepath)) {
            getMarshaller().marshal(object, new StreamResult(os));
        }
    }
    
    public Object convertFromXMLToObject(File xmlfile) throws IOException {
        try(FileInputStream is = new FileInputStream(xmlfile)) {
            return getUnmarshaller().unmarshal(new StreamSource(is));
        }
    }
}
