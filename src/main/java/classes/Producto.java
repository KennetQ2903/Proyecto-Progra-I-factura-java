package classes;

import java.io.Serializable;

public class Producto implements Serializable{

    public String getCodeAr() {
        return codeAr;
    }

    public void setCodeAr(String codeAr) {
        this.codeAr = codeAr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    private String codeAr;
    private String code;
    private String name;
    private String cant;
    private String price;
}
