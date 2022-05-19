
package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class entidadGrego {
    
    private String nombre;
    private String apellido;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private entidadGrego id;

    public entidadGrego(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public entidadGrego() {
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

    public entidadGrego getId() {
        return id;
    }

    public void setId(entidadGrego id) {
        this.id = id;
    }
    
    
    
    

}
