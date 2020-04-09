package fr.insa.service;

public class ProductServiceProxy implements fr.insa.service.ProductService_PortType {
  private String _endpoint = null;
  private fr.insa.service.ProductService_PortType productService_PortType = null;
  
  public ProductServiceProxy() {
    _initProductServiceProxy();
  }
  
  public ProductServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductServiceProxy();
  }
  
  private void _initProductServiceProxy() {
    try {
      productService_PortType = (new fr.insa.service.impl.ProductService_ServiceLocator()).getProductServiceImplPort();
      if (productService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productService_PortType != null)
      ((javax.xml.rpc.Stub)productService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.insa.service.ProductService_PortType getProductService_PortType() {
    if (productService_PortType == null)
      _initProductServiceProxy();
    return productService_PortType;
  }
  
  
}