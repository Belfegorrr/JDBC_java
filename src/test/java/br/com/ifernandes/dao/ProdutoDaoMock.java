package test.java.br.com.ifernandes.dao;

import java.util.Collection;

import main.java.br.com.ifernandes.dao.IProdutoDAO;
import main.java.br.com.ifernandes.domain.Produto;
import main.java.br.com.ifernandes.exceptions.TipoChaveNaoEncontradaException;




public class ProdutoDaoMock implements IProdutoDAO {

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(String valor) {		
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
	}

	@Override
	public Produto consultar(String valor) {
		Produto produto = new Produto();
		produto.setCodigo(valor);
		return produto;
	}

	@Override
	public Collection<Produto> buscarTodos() {
		return null;
	}

}