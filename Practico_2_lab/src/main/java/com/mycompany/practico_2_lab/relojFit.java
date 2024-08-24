/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practico_2_lab;

/**
 *
 * @author Lucia
 */
public class relojFit extends Reloj {
        private int pasos;

    public RelojFit(int frecuencia) {//crear en clase "Reloj" int frecuencia
        super(frecuencia);
        this.pasos = 0;
    }

    public void cuentaPasos(int x, int y) {
        this.pasos += Math.abs(x) + Math.abs(y);
        System.out.println("Pasos contados: " + this.pasos);
    }

    public void frecuenciaAleatoria() {
        int nuevaFrecuencia = (int)(Math.random() * 100); // Frecuencia aleatoria entre 0 y 100
        setFrecuencia(nuevaFrecuencia);//crear en "Reloj" un "setFrecuencia"
        System.out.println("Frecuencia aleatoria establecida: " + nuevaFrecuencia + " Hz");
    }
    
}
