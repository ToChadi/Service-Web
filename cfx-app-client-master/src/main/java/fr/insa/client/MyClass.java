package fr.insa.client;

import java.rmi.RemoteException;
import java.util.List;

import fr.insa.service.Product;
import fr.insa.service.ProductService;
import fr.insa.service.ProductServiceService;
import fr.insa.service.SearchProductsByCriteria;

public class MyClass {

	public Product getResult() throws RemoteException {

		ProductServiceService productServiceSvc = new ProductServiceService();
		ProductService productService = productServiceSvc.getProductServicePort();
		System.out.println("toto");
		Product product = productService.getProduct("102");
		return product;
	}
	
	public List<Product> searchResult(String productName,String category) throws RemoteException{
		ProductServiceService productServiceSvc = new ProductServiceService();
		ProductService productService = productServiceSvc.getProductServicePort();
		System.out.println("Recherche");
		List<Product> p=productService.searchProductsByCriteria(productName, category);
		return p;

	}

	public static void main(String[] args) throws RemoteException {

		MyClass c = new MyClass();
		System.out.println(c.getResult());
		System.out.println(c.searchResult("Banana", "Fruit"));
	}
}
