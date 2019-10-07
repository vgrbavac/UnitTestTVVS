/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvvs;

import java.math.MathContext;

/**
 *
 * @author Hrvoje Dumančić & Vedran Grbavac
 */
public class Calculator {
    
    public double addition(double x, double y) {
        return x+y;
    }
    
    public double substraction(double x, double y) {
        return x-y;
    }
    
    public double division(double x, double y) {
        if(y == 0)
            return 0;
        return x/y;
    }
    
    public double multiplication(double x, double y) {
        return x*y;
    }
    
    public int oneNumberFactorial(int x) {
        if(x <= 0) 
            return 0;
        int y = 1;
        do {
            y *= x--;
        } while(x > 0);
        return y;
    }
    
    public int twoNumberFactorial(int x, int y) {
        if(x <= 0 || y <= 0) 
            return 0;
        int xFactorial = 1;
        do {
            xFactorial *= x;
            x -= 1;
        } while(x > 0);

        int yFactorial = 1;
        do {
            yFactorial *= y;
            y -= 2;
        } while(y > 0);
        return xFactorial/yFactorial;
    }
    
    public boolean primeNumberCheck(int x) {
        for(int i = 1; i <= x ; i++) {
            if(x%i == 0)
                return false;
        }
        return true;
    }
}
