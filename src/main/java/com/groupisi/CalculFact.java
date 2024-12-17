package com.groupisi;

public class CalculFact {

    public static long factoriel(int n){
        if(n< 0){
            throw new IllegalArgumentException("le nombre donné ne doit pas etre négatif");
        }
        if(n ==0 || n ==1 ){
            return 1;
        }
        return n * factoriel(n-1);
    }
    public static void main(String[] arg){
        int nombre =6;
        System.out.println("le factoriel de " + nombre +":" + factoriel(nombre));
    }

}
