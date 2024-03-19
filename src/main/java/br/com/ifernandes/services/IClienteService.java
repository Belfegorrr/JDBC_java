package main.java.br.com.ifernandes.services;

import main.java.br.com.ifernandes.domain.Cliente;
import main.java.br.com.ifernandes.exceptions.DAOException;
import main.java.br.com.ifernandes.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;
}