package classes;

import java.io.Serializable;

public class Empleado implements Serializable {

    public String getNoCaja() {
        return NoCaja;
    }

    
    public void setNoCaja(String NoCaja) {
        this.NoCaja = NoCaja;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    private String code;
    private String name;
    private String puesto;
    private String salary;
    private String NoCaja;

}
