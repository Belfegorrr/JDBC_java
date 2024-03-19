package main.java.br.com.ifernandes.dao;

import main.java.br.com.ifernandes.dao.generics.IGenericDAO;
import main.java.br.com.ifernandes.domain.Venda;
import main.java.br.com.ifernandes.exceptions.DAOException;
import main.java.br.com.ifernandes.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}