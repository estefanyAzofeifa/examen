/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author estef
 */
public class Factura {
    // creamos variables 

    String nombreCliente;
    int cedulaCliente;
    int codigoDeFactura;
    double montoFcatura;
    int numeroMes;
    String electricos;
    String automotrices;
    String contruccion;

    // hacemos los metodos de get
    Factura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public double getCodigoDeFactura() {
        return codigoDeFactura;
    }

    public void setCodigoDeFactura(int codigoDeFactura) {
        this.codigoDeFactura = codigoDeFactura;
    }

    public double getMontoFcatura() {
        return montoFcatura;
    }

    public void setMontoFcatura(double montoFcatura) {
        this.montoFcatura = montoFcatura;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public String getElectricos() {
        return electricos;
    }

    public void setElectricos(String electricos) {
        this.electricos = electricos;
    }

    public String getAutomotrices() {
        return automotrices;
    }

    public void setAutomotrices(String automotrices) {
        this.automotrices = automotrices;
    }

    public String getContruccion() {
        return contruccion;
    }

    public void setContruccion(String contruccion) {
        this.contruccion = contruccion;
    }
    // realizamos el constructor

    public Factura(String nombreCliente, int cedulaCliente, int codigoDeFactura, double montoFcatura, int numeroMes, String electricos, String automotrices, String contruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoDeFactura = codigoDeFactura;
        this.montoFcatura = montoFcatura;
        this.numeroMes = numeroMes;
        this.electricos = electricos;
        this.automotrices = automotrices;
        this.contruccion = contruccion;

    }
// retornar mes
    public String nombreMes(int numeroMes) {
        if (numeroMes == 1) {
            return "Enero";
        } else if (numeroMes == 2) {
            return "Febrero";
        } else if (numeroMes == 3) {
            return "Marzo";
        } else if (numeroMes == 4) {
            return "Abril";
        } else if (numeroMes == 5) {
            return "Mayo";
        } else if (numeroMes == 6) {
            return "Junio";
        } else if (numeroMes == 7) {
            return "Julio";
        } else if (numeroMes == 8) {
            return "Agosto";
        } else if (numeroMes == 9) {
            return "Setiembre";
        } else if (numeroMes == 10) {
            return "Octubre";
        } else if (numeroMes == 11) {
            return "Noviembre";
        } else if (numeroMes == 12) {
            return "Diciembre";
        }else {
            return "";
        }
    }
}
