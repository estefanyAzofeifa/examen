/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author estef
 */
public class Agente {
    
    String nombreAgente;
    int numeroCedula;
    int codigo;
    String sucursalPerteneciente;
    String poseedorDeVehiculo;

    Agente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursalPerteneciente() {
        return sucursalPerteneciente;
    }

    public void setSucursalPerteneciente(String sucursalPerteneciente) {
        this.sucursalPerteneciente = sucursalPerteneciente;
    }

    public String getPoseedorDeVehiculo() {
        return poseedorDeVehiculo;
    }

    public void setPoseedorDeVehiculo(String poseedorDeVehiculo) {
        this.poseedorDeVehiculo = poseedorDeVehiculo;
    }

    public Agente(String nombreAgente, int numeroCedula, int codigo, String sucursalPerteneciente, String poseedorDeVehiculo) {
        this.nombreAgente = nombreAgente;
        this.numeroCedula = numeroCedula;
        this.codigo = codigo;
        this.sucursalPerteneciente = sucursalPerteneciente;
        this.poseedorDeVehiculo = poseedorDeVehiculo;
    }


}
