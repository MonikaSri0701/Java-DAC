package com.jdbcdemo.dao;
import java.util.List;
import com.jdbcdemo.pojo.Product;

public interface ProductDao {

	//query operations
	List<Product> getAllProducts();
	Product searchProduct(int id);
	
	//curd operations
	boolean addNewProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(int id);
}
