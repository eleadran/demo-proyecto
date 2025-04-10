package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Facturas;
import pe.edu.idat.demo_proyecto.repository.FacturasRepository;

import java.util.List;
@Service
public class FacturasService {
    private final FacturasRepository facturasRepository;
    public FacturasService(FacturasRepository facturasRepository) {
        this.facturasRepository = facturasRepository;
    }

    public List<Facturas> obtenerFacturas (){

        return facturasRepository.findAll();

    }

    public Facturas obtenerFacturasXid (int id){
        return facturasRepository.findById(id).orElse(null);

    }


    public void guardarFacturas(Facturas facturas){
        facturasRepository.save(facturas);
    }

    public void eliminarFacturas(int id) {
        facturasRepository.deleteById(id);
    }
}
