package pojo;
// Generated 29-nov-2016 19:53:01 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Inmueble generated by hbm2java
 */
public class Inmueble  implements java.io.Serializable {


     private Integer idInmueble;
     private Agencia agencia;
     private String direccion;
     private String tipo;
     private String estado;
     private String propietario;
     private int superficie;
     private Integer habitacionesP;
     private Integer bañosP;
     private String tipoGasP;
     private String ubicacionP;
     private String licenciaLocal;
     private Set ventaInmuebles = new HashSet(0);

    public Inmueble() {
    }

	
    public Inmueble(Agencia agencia, String direccion, String tipo, String estado, String propietario, int superficie) {
        this.agencia = agencia;
        this.direccion = direccion;
        this.tipo = tipo;
        this.estado = estado;
        this.propietario = propietario;
        this.superficie = superficie;
    }
    public Inmueble(Agencia agencia, String direccion, String tipo, String estado, String propietario, int superficie, Integer habitacionesP, Integer bañosP, String tipoGasP, String ubicacionP, String licenciaLocal, Set ventaInmuebles) {
       this.agencia = agencia;
       this.direccion = direccion;
       this.tipo = tipo;
       this.estado = estado;
       this.propietario = propietario;
       this.superficie = superficie;
       this.habitacionesP = habitacionesP;
       this.bañosP = bañosP;
       this.tipoGasP = tipoGasP;
       this.ubicacionP = ubicacionP;
       this.licenciaLocal = licenciaLocal;
       this.ventaInmuebles = ventaInmuebles;
    }
   
    public Integer getIdInmueble() {
        return this.idInmueble;
    }
    
    public void setIdInmueble(Integer idInmueble) {
        this.idInmueble = idInmueble;
    }
    public Agencia getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPropietario() {
        return this.propietario;
    }
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public int getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public Integer getHabitacionesP() {
        return this.habitacionesP;
    }
    
    public void setHabitacionesP(Integer habitacionesP) {
        this.habitacionesP = habitacionesP;
    }
    public Integer getBañosP() {
        return this.bañosP;
    }
    
    public void setBañosP(Integer bañosP) {
        this.bañosP = bañosP;
    }
    public String getTipoGasP() {
        return this.tipoGasP;
    }
    
    public void setTipoGasP(String tipoGasP) {
        this.tipoGasP = tipoGasP;
    }
    public String getUbicacionP() {
        return this.ubicacionP;
    }
    
    public void setUbicacionP(String ubicacionP) {
        this.ubicacionP = ubicacionP;
    }
    public String getLicenciaLocal() {
        return this.licenciaLocal;
    }
    
    public void setLicenciaLocal(String licenciaLocal) {
        this.licenciaLocal = licenciaLocal;
    }
    public Set getVentaInmuebles() {
        return this.ventaInmuebles;
    }
    
    public void setVentaInmuebles(Set ventaInmuebles) {
        this.ventaInmuebles = ventaInmuebles;
    }




}


