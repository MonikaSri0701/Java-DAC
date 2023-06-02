package com.jdbcdemo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.jdbcdemo.pojo.Product;

public class ProductMapper {

	public static Product mapRow(ResultSet rs) throws SQLException {
		
		Product product = new Product();
		product.setPid(rs.getInt("pid"));
		product.setPname(rs.getString("pname"));
		product.setPrice(rs.getInt("price"));
		return product;
	}
}
