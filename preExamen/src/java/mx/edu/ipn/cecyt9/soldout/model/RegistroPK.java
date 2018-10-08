/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.soldout.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Alumno
 */
@Embeddable
public class RegistroPK implements Serializable {

    
    private String nombre;
    
    private String apelldo;
    
    private int idRegistro;

    public RegistroPK() {
    }

    public RegistroPK(String nombre, String apelldo, int idRegistro) {
        this.nombre = nombre;
        this.apelldo = apelldo;
        this.idRegistro = idRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldo() {
        return apelldo;
    }

    public void setApelldo(String apelldo) {
        this.apelldo = apelldo;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        hash += (apelldo != null ? apelldo.hashCode() : 0);
        hash += (int) idRegistro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroPK)) {
            return false;
        }
        RegistroPK other = (RegistroPK) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        if ((this.apelldo == null && other.apelldo != null) || (this.apelldo != null && !this.apelldo.equals(other.apelldo))) {
            return false;
        }
        if (this.idRegistro != other.idRegistro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.soldout.model.RegistroPK[ nombre=" + nombre + ", apelldo=" + apelldo + ", idRegistro=" + idRegistro + " ]";
    }
    
}
