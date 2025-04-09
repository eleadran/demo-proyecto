package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Clientes;
import pe.edu.idat.demo_proyecto.repository.ClientesRepository;

import java.util.List;

@Service
public class ClientesService {
    private final ClientesRepository clientesRepository;
    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public List<Clientes> obtenerClientes (){

        return clientesRepository.findAll();

    }

    public Clientes obtenerClientesXid (int id){
        return clientesRepository.findById(id).orElse(null);

    }


    public void guardarClientes(Clientes clientes){
        clientesRepository.save(clientes);
    }

    public void eliminarCliente(int id) {
        clientesRepository.deleteById(id);
    }
}
