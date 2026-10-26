package url.edu.gt.repasospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import url.edu.gt.repasospring.service.BienvenidaService;

@RestController
public class BienvenidaController {

    private final BienvenidaService bienvenidaService;

    // Spring entrega el servicio automáticamente por este constructor.
    public BienvenidaController(BienvenidaService bienvenidaService) {
        this.bienvenidaService = bienvenidaService;
    }

    @GetMapping("/api/saludo")
    public String saludo() {
        return bienvenidaService.mensajeGeneral();
    }

    @GetMapping("/api/bienvenida")
    public String bienvenida(@RequestParam(defaultValue = "visitante") String nombre) {
        return bienvenidaService.mensajePara(nombre);
    }

    @GetMapping("/api/horario")
    public String horario() {
        return "Atendemos de lunes a viernes, de 8:00 a 16:00.";
    }

    @GetMapping("/api/donacion")
    public String donacion(
            @RequestParam(defaultValue = "anónimo") String nombre,
            @RequestParam(defaultValue = "0") int libras) {
        return "Gracias, " + nombre + ", por donar " + libras + " libras de alimento.";
    }

}