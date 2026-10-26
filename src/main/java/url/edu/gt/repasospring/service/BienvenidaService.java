package url.edu.gt.repasospring.service;

import org.springframework.stereotype.Service;

import url.edu.gt.repasospring.model.Visitante;

@Service
public class BienvenidaService {
    private static final String INSTITUCION = "Banco de Alimentos San Miguel";

    public String mensajeGeneral() {
        return "¡Bienvenido(a) al " + INSTITUCION + "!";
    }

    public String mensajePara(String nombre) {
        Visitante visitante = new Visitante(nombre);
        return "Hola, " + visitante.getNombre()
                + ". Gracias por apoyar al " + INSTITUCION + ".";
    }
}
