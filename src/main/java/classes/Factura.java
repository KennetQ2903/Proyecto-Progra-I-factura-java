package classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Factura implements Serializable{

    public String getSePagoCon() {
        return sePagoCon;
    }
    
    public void setSePagoCon(String sePagoCon) {
        this.sePagoCon = sePagoCon;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientNIt() {
        return clientNIt;
    }

    public void setClientNIt(String clientNIt) {
        this.clientNIt = clientNIt;
    }

    public String getEmployedCashRegister() {
        return employedCashRegister;
    }

    
    public void setEmployedCashRegister(String employedCashRegister) {
        this.employedCashRegister = employedCashRegister;
    }

    public String getEmployedName() {
        return employedName;
    }

    public void setEmployedName(String employedName) {
        this.employedName = employedName;
    }

    
    public String getDate() {
        return date;
    }

    
    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<sellProduct> getArrProd() {
        return arrProd;
    }

    public void setArrProd(ArrayList<sellProduct> arrProd) {
        this.arrProd = arrProd;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }


    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    private String ID;
    private String clientName;
    private String clientNIt;
    private String employedCashRegister;
    private String employedName;
    private String date;
    private ArrayList<sellProduct> arrProd = new ArrayList<>();
    private String total;
    private String sePagoCon;
    private String cambio;
    private String estado;
}
