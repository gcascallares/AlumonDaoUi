/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class AlumnoDTO {
    
    private Integer dni;
    
    private String nombre;
    
    private String apellido;
    
    private MiCalendar fecNac;
    
    public MiCalendar getfecNac() {
	return fecNac;
    }

    public void setFecNac(MiCalendar fecNac) {
	this.fecNac = fecNac;
    }
    
     public Integer getDni() {
	return dni;
    }

    public void setDni(Integer dni) {
	this.dni = dni;
    }
    
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
    
}
