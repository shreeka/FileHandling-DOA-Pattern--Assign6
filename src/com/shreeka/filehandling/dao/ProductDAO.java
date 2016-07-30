/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.filehandling.dao;

import com.shreeka.filehandling.entity.Product;
import com.sun.scenario.effect.impl.prism.PrCropPeer;
import java.util.List;

/**
 *
 * @author Decode
 */
public interface ProductDAO {
    boolean insert(Product p);
    boolean delete(int id);
    Product getById(int id);
    List<Product> getAll();
}
