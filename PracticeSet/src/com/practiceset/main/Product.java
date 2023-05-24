package com.practiceset.main;
import java.io.*;
import java.util.*;

	public class Product implements Serializable {
		private static final long serialVersionUID = -3293573713546694699L;
		private int id;
	    private String name;
	    private double price;
	    private int qty;

	    public Product(int id, String name, double price, int qty) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.qty = qty;
	    }

	    public void disp() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + qty);
	    }

	    public static void main(String[] args) {
	        ArrayList<Product> products = new ArrayList<>();
	        products.add(new Product(1, "Product 1", 10.0, 5));
	        products.add(new Product(2, "Product 2", 15.0, 10));
	        products.add(new Product(3, "Product 3", 20.0, 15));
	        products.add(new Product(4, "Product 4", 25.0, 20));

	        try {
	            FileOutputStream fos = new FileOutputStream("products.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(products);
	            oos.close();
	            fos.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        try {
	            FileInputStream fis = new FileInputStream("products.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            ArrayList<Product> productsFromFile = (ArrayList<Product>) ois.readObject();
	            ois.close();
	            fis.close();

	            Iterator<Product> iterator = productsFromFile.iterator();
	            while (iterator.hasNext()) {
	                Product product = iterator.next();
	                product.disp();
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
}
