package com.sena.rest.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "personas")

public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
	private String cedula;
    private String nombre;
    private Double valorVentasMes;
    private Double valorAPagar;
    private int edad;
    
  
	public Persona() {
    }
    
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorVentasMes() {
        return valorVentasMes;
    }

    
    public void setValorVentasMes(Double valorVentasMes) {
        this.valorVentasMes = valorVentasMes;
    }

    public Double getValorAPagar() {      
       if(this.edad >= 18){
           this.valorAPagar = 1000000.0 + (this.valorVentasMes * 3/100) * 10/100;
        }else{
           this.valorAPagar = 1000000.0 + (this.valorVentasMes * 10/100) + 300000.0;
        }
        return valorAPagar;
    }

    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", valorVentasMes=" + valorVentasMes
				+ ", valorAPagar=" + valorAPagar + ", edad=" + edad + "]";
	}
    
    

    
}
