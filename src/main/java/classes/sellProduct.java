package classes;

import java.io.Serializable;

public class sellProduct implements Serializable {

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getCodeAr() {
        return codeAr;
    }

    public void setCodeAr(String codeAr) {
        this.codeAr = codeAr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getPrice() {
        return unitPrice;
    }

    public void setPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    private String codeAr;
    private String subTotal;
    private String name;
    private String cant;
    private String unitPrice;
}
