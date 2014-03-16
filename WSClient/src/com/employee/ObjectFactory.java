
package com.employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.employee package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PrintNameResponse_QNAME = new QName("http://Employee.com/", "printNameResponse");
    private final static QName _PrintName_QNAME = new QName("http://Employee.com/", "printName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintNameResponse }
     * 
     */
    public PrintNameResponse createPrintNameResponse() {
        return new PrintNameResponse();
    }

    /**
     * Create an instance of {@link PrintName }
     * 
     */
    public PrintName createPrintName() {
        return new PrintName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Employee.com/", name = "printNameResponse")
    public JAXBElement<PrintNameResponse> createPrintNameResponse(PrintNameResponse value) {
        return new JAXBElement<PrintNameResponse>(_PrintNameResponse_QNAME, PrintNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Employee.com/", name = "printName")
    public JAXBElement<PrintName> createPrintName(PrintName value) {
        return new JAXBElement<PrintName>(_PrintName_QNAME, PrintName.class, null, value);
    }

}
