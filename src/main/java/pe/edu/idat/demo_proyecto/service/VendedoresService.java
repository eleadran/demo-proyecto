package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Vendedores;
import pe.edu.idat.demo_proyecto.repository.VendedoresRespository;

import java.util.List;
@Service
public class VendedoresService {

    private final VendedoresRespository vendedoresRespository;
    public VendedoresService(VendedoresRespository vendedoresRespository) {
        this.vendedoresRespository = vendedoresRespository ;
    }

    public List<Vendedores> obtenerVendedores (){

        return vendedoresRespository.findAll();

    }

    public Vendedores obtenerVendedoresXid (int id){
        return vendedoresRespository.findById(id).orElse(null);

    }


    public void guardarVendedores(Vendedores vendedores){
        vendedoresRespository.save(vendedores);
    }

    public void eliminarVendedores(int id) {
        vendedoresRespository.deleteById(id);
    }


}
