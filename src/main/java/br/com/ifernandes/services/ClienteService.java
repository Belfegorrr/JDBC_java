package main.java.br.com.ifernandes.services;

import main.java.br.com.ifernandes.dao.IClienteDAO;
import main.java.br.com.ifernandes.domain.Cliente;
import main.java.br.com.ifernandes.exceptions.DAOException;
import main.java.br.com.ifernandes.exceptions.MaisDeUmRegistroException;
import main.java.br.com.ifernandes.exceptions.TableException;
import main.java.br.com.ifernandes.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);		
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}
}