package co.edu.icesi.eventos.controller.postgres;

import co.edu.icesi.eventos.service.postgres.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Areas")
public class AreasController {

    @Autowired
    private AreasService areasService;

}
