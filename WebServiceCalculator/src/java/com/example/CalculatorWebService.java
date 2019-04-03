/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ninastijepovic
 */
@WebService(serviceName = "CalculatorWebService")
public class CalculatorWebService {


    /**
     * Web service operation
     * @param i 
     * @param j 
     * @return  
     */
    @WebMethod(operationName = "Addition")
    public String Addition(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
        float result = i+j;
        return (Float.toString(result));
    }

    /**
     * Web service operation
     * @param i
     * @param j
     * @return 
     */
    @WebMethod(operationName = "Subtraction")
    public String Subtraction(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
         float result = i-j;
        return (Float.toString(result));
    }

    /**
     * Web service operation
     * @param i
     * @param j
     * @return 
     */
    @WebMethod(operationName = "Multiplication")
    public String Multiplication(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
         float result = i * j;
        return (Float.toString(result));
    }

    /**
     * Web service operation
     * @param i
     * @param j
     * @return 
     */
    @WebMethod(operationName = "Division")
    public String Division(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
         float result = i / j;
        return (Float.toString(result));
    }
}
