package co.edu.icesi.eventos.service;

import co.edu.icesi.eventos.domain.postgres.Areas;
import co.edu.icesi.eventos.service.postgres.AreasService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AreasTest {

    @Autowired
    private AreasService areasService;

    @Test
    void debeConsultarTodasAreas(){
        List<Areas> lstAreas = areasService.findAll();
        System.out.println(lstAreas);
    }

}
