package fr.insa.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.persistence.internal.jpa.parsing.EqualsAssignmentNode;

import fr.insa.model.Product;
import fr.insa.model.ProductOrdering;

public class ProductServiceMockDaoImpl {
	private static List<Product> productList = new ArrayList<Product>();
	private static List<ProductOrdering> productOrderings = new ArrayList<>();

	static {
		Product p1 = new Product("101", "Laptop", "Electronics");
		Product p2 = new Product("102", "Bannana", "Fruits");
		Product p3 = new Product("103", "Pencil", "Stationary");
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
	}
	
	// new code
	public static List<Product> searchProductsByCriteria(String productName, String category) { 
	System.out.println("searchProductsByCriteria()");
	
	// TODO: retourner une réponse avec :
	// un sous-ensemble de la liste des produits
	
	List<Product> products = new ArrayList<>();
	for(Product produit : productList) {
		if(produit.getProductName().equals(productName) || produit.getProductCatg().equals(category))
			products.add(produit);
	}
	return products;
	}

	public static Product getProduct(String productId) {
		for (Product product : ProductServiceMockDaoImpl.getAllProducts()) {
			if (product.getProductId().equals(productId)) {
				return product;
			}
		}
		return null;

	}

	public static List<Product> getAllProducts() {
		return productList;
	}

	public static List<ProductOrdering> getProductOrderings() {
		return productOrderings;
	}

	public static Optional<ProductOrdering> getProductOrderingById(String productOrderingId) {
		return ProductServiceMockDaoImpl.getProductOrderings().stream()
				.filter(current -> current.getId().equals(productOrderingId)).findFirst();
	}
}