package com.redhat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-28T10:26:33.538-04:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://redhat.com/", name = "LocationDetailServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface LocationDetailServicePortType {

    @WebMethod
    @RequestWrapper(localName = "contact", targetNamespace = "http://redhat.com/", className = "com.redhat.Contact")
    @ResponseWrapper(localName = "contactResponse", targetNamespace = "http://redhat.com/", className = "com.redhat.ContactResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.redhat.ContactInfo contact(
        @WebParam(name = "arg0", targetNamespace = "http://redhat.com/")
        java.lang.Integer arg0
    );
}
