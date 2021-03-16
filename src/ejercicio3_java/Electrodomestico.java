/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_java;

/**
 *
 * @author Victor Rosario
 */
public class Electrodomestico {
    protected double precioBase = 100;
    protected String color = "Blanco";
    protected char consumoEnergetico = 'F';
    protected double peso = 5;
    
    public Electrodomestico(){}
    
    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }
    
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }
    
    protected double getPrecioBase(){ return precioBase; }
    protected String getColor(){ return color; }
    protected char getConsumoEnergetico(){ return consumoEnergetico; }
    protected double getPeso(){ return peso; }
    
    
}
