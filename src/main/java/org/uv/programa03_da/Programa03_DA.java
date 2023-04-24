/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03_da;

import java.util.logging.Logger;


public class Programa03_DA {

    public static void main(String[] args) {
        
//        ClaseConcreta c= new ClaseConcreta();
//        c.imprimir();
//        
//        ClaseAHija cah = new ClaseAHija();
//        cah.imprimir();
        
//        ClaseA ca=null;
//        
//        ca=new ClaseAHija();
//        ca.imprimir();
//                
//        ca=new ClaseAHija2();
//        ca.imprimir();
//        
//        //Clase anonima
//        ca=new ClaseA(){
//            @Override
//            public void msg(){
//                 Logger.getLogger("Otra clase anonima...");
//            }
//        };
//        ca.imprimir();

    IClaseInterface eje=null;
    eje = new IClaseConcretaUno();
    eje.msg();
    
    eje=new IClaseConcretaDos();
    eje.msg();
    
    eje = new IClaseInterface() {
        @Override
        public void msg() {
            System.out.println("Como dijo el chavo del 8: otro gato...");
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    eje.msg();
    
    }
}