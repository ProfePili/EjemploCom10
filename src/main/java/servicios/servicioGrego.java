
package servicios;

import entidades.entidadGrego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicioGrego {
    
    entidadGrego grego = new entidadGrego();
    
    public void asignarValores(){
        System.out.println("si 1 + 1 es 2");
        grego.setNombre("Javier Gregorio");
        System.out.println("si 2 + 2 es 4");
        grego.setApellido("Lujan");
    
        
        System.out.println("cambios asignados exitosamente, 4 + 4: 8");
    }
   
}
