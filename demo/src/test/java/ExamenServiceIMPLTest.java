import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.example.ejemplos.models.Examen;
import com.example.ejemplos.respositories.ExamenRepositoryIMPL;
import com.example.ejemplos.respositories.ExamenRepositry;
import com.example.ejemplos.services.ExamenService;
import com.example.ejemplos.services.ExamenServiceIMPL;

public class ExamenServiceIMPLTest {


    //test de busqueda
    @Test

    void findExamenPerName(){
        ExamenRepositry repositry = new ExamenRepositoryIMPL();
        ExamenService service = new ExamenServiceIMPL(repositry);
        Examen examen = service.findExamenPerName("Math");
        assertNotNull(examen);
        assertEquals(1L, examen.getId()); //referencia del valor requerido, no afecta los resultados
        assertEquals("Math", examen.getName());
    }


    //Test de guardado
    @Test
    void saveExamenInRepository(){
        ExamenRepositry repositry = new ExamenRepositoryIMPL();
        ExamenService service = new ExamenServiceIMPL(repositry);
        Examen newExamen = new Examen(4L, "Fisica");

        service.saveExamen(newExamen);

        assertEquals(4, repositry.findAll().size());
        Examen examenSave = repositry.findById(4L);
        assertNotNull(examenSave);
        assertEquals("Fisica", examenSave.getName());
    }

}
