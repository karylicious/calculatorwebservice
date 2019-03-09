/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Carla Augusto
 */
@WebService( portName = "CalculatorPort", serviceName = "CalculatorService")
public class Calculator {

           
    @WebMethod(operationName = "sum")
    public int sum(int a, int b) {
        return a+b;
    } 

    @WebMethod(operationName = "diff")
    public int diff(int a, int b) {
        return a-b;
    } 

    @WebMethod(operationName = "multiply")
    public int multiply(int a, int b) {
        return a*b;
    }

    @WebMethod(operationName = "divide")
    public int divide(int a, int b) {
        return a/b;
    }
}
