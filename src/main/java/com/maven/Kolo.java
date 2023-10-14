package com.maven;

public class Kolo {
    double promien;

    public double pole(){
        return Math.PI * Math.pow(this.promien, 2);
    }
    public double pole(double n){
        return Math.PI * Math.pow(n, 2);
    }
}