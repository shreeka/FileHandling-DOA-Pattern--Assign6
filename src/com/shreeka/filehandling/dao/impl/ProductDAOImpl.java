/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.filehandling.dao.impl;

import com.shreeka.filehandling.dao.ProductDAO;
import com.shreeka.filehandling.entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Decode
 */
public class ProductDAOImpl implements ProductDAO {
    
    private List<Product> productList=new ArrayList<>();

    @Override
    public boolean insert(Product p) {
        return productList.add(p);
    }

    @Override
    public boolean delete(int id) {
        for(Product p:productList)
        {
            if(p.getId()==id)
            {
                return productList.remove(p);
            }
        }
        return false;
    }

    @Override
    public Product getById(int id) {
        for(Product p:productList)
        {
            if(p.getId()==id)
            {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return productList;
        
    }
    
    
    
}
