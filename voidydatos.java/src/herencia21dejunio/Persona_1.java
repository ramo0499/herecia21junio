/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21dejunio;

/**
 *
 * @author ISTLOJA1
 */
class Persona {

    private String nombre;
    private String apellido;
    private int cedula;
    private int sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public void saludar() {
        System.out.println("hola como estas ");

    }

    public void despedirse() {
        System.out.println("chao nos vemos otro dia");
    }

    public static void main(String[] args) {
        Persona objeto = new Persona();
        objeto.setNombre("carlos");
        System.out.println("");

    }

}
