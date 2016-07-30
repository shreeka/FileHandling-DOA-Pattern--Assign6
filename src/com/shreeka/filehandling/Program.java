/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.filehandling;

import com.shreeka.filehandling.controller.ProgramController;
import com.shreeka.filehandling.dao.ProductDAO;
import com.shreeka.filehandling.dao.impl.ProductDAOImpl;
import com.shreeka.filehandling.entity.Product;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Decode
 */
public class Program {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        
        ProductDAO productDAO=new ProductDAOImpl();
        ProgramController pc=new ProgramController(input, productDAO);
        pc.process(); 
    }
        
    
         

