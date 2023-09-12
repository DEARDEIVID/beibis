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
            fact=factorial(i);
            val=val+(1/fact);
        }
        val=val+1;
        return val;
    }
    
    double expX(double x, int n){
        double val=0;
        int expon=1;
        int ex=1;
        for (int i = 1; i <= n; i++) {
            x=Math.pow(x, expon);
            expon= expon+1;
            ex=factorial(i);
            val=val+(x/ex);
        }
        val=val+1;
        return val;
    }
}
