/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voidydatos.java;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA1
 */
public class VoidydatosJava {

    //es un metodo  void que suma dos numerosy presenta el resultado
    public void sumar(int numero1, int numero2) { // recibe 2 numeros de tipo 
        System.out.println("La suma es" + (numero1 + numero2));// presenta el resultado

    }

    // los  metodos que devuelven datos pueden ser diferentes tipos como
    //int,double,String char,boolean y tambien pueden ser objetos 
    public int sumar1(int numero1, int numero2) {
        return numero1 + numero2; //devolvemos el valor

    }

    public String unircadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;

    }

    public boolean iniciasesion(String usuario, String passaword) {
        boolean valor = false;
        if (usuario.equals("admin") && passaword.equals("1234")) {
            valor = true;
        }
        return valor;

    }

    public static void main(String[] args) {
        VoidyDatos objeto = new VoidyDatos(); //creamosun objeto 
        objeto.Sumar(10, 8);//llmamos el metodo sumar y enviamos 2 numeros
        objeto.Sumar(11, 23);
        objeto.Sumar(80, 7);
        int resultado = objeto.sumar1(40, 10); // guardo lo que devuelvo el metodo
        System.out.println("la suma es" + resultado);
        int resultado1 = objeto.sumar1(150, 20);
        System.out.println(resultado1 + resultado);
        String cadena = objeto.unircadenas("hola", "mundo");
        System.out.println("La cadena enidaes : " + cadena);
        boolean valiableinicio = objeto.iniciasesion("admin", "1234");
        boolean variableinicio = false;
        System.out.println(variableinicio);
        Scanner entrada= new Sanner(System.in);
        System.out.println("ingrese el usuario");
        String usuario=entrada.next();
        System.out.println("ingrese la contraseña");
        String password=entrada.next();
        boolean iniciasesion=objeto.iniciasesion(usuario,password);
        if(iniciosesion){
        
            System.out.println("bienvenidos al sistema");
        }else{
                    System.out.println("credenciales incorrectos");
                    }
        }
        
        
        
        
        
       

    }

}
