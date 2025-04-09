package pe.edu.idat.demo_proyecto.service;

import pe.edu.idat.demo_proyecto.model.Clientes;
import pe.edu.idat.demo_proyecto.repository.ClientesRepository;

import java.util.List;

public class ClientesService {
    private final ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public List<Clientes> obtenerClientes (){

        return clientesRepository.findAll();

    }
    public void guardarClientes(Clientes clientes){
        clientesRepository.save(clientes);
    }
}
