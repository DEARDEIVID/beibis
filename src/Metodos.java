/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Metodos {
    int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    double constante(double c){
        double fact = 1;
        double val=0;
        for (int i = 1; i <= c; i++) {
            fact=fact*i;
            val=val+(1/fact);
        }
        val=val+1;
        return val;
    }
    
    double expX(double x, int n){
        
        return 0;
    }
}