/**
 * ProductServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.insa.service.impl;

public class ProductServiceLocator extends org.apache.axis.client.Service implements fr.insa.service.impl.ProductService {

    public ProductServiceLocator() {
    }


    public ProductServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductServiceImplPort
    private java.lang.String ProductServiceImplPort_address = "http://localhost:8080/cfx-app/services/productService";

    public java.lang.String getProductServiceImplPortAddress() {
        return ProductServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductServiceImplPortWSDDServiceName = "ProductServiceImplPort";

    public java.lang.String getProductServiceImplPortWSDDServiceName() {
        return ProductServiceImplPortWSDDServiceName;
    }

    public void setProductServiceImplPortWSDDServiceName(java.lang.String name) {
        ProductServiceImplPortWSDDServiceName = name;
    }

    public fr.insa.service.ProductService getProductServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductServiceImplPort(endpoint);
    }

    public fr.insa.service.ProductService getProductServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.insa.service.impl.ProductServiceSoapBindingStub _stub = new fr.insa.service.impl.ProductServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProductServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductServiceImplPortEndpointAddress(java.lang.String address) {
        ProductServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.insa.service.ProductService.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.insa.service.impl.ProductServiceSoapBindingStub _stub = new fr.insa.service.impl.ProductServiceSoapBindingStub(new java.net.URL(ProductServiceImplPort_address), this);
                _stub.setPortName(getProductServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProductServiceImplPort".equals(inputPortName)) {
            return getProductServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.insa.fr/", "productService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.insa.fr/", "ProductServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductServiceImplPort".equals(portName)) {
            setProductServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
