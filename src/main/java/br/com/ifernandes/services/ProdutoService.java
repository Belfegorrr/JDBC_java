package main.java.br.com.ifernandes.services;

import main.java.br.com.ifernandes.dao.IProdutoDAO;
import main.java.br.com.ifernandes.domain.Produto;
import main.java.br.com.ifernandes.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}