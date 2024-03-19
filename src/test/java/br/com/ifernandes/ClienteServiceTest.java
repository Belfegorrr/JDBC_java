package test.java.br.com.ifernandes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.br.com.ifernandes.dao.IClienteDAO;
import main.java.br.com.ifernandes.domain.Cliente;
import main.java.br.com.ifernandes.exceptions.DAOException;
import main.java.br.com.ifernandes.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.ifernandes.services.ClienteService;
import main.java.br.com.ifernandes.services.IClienteService;
import test.java.br.com.ifernandes.dao.ClienteDaoMock;


public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Rodrigo Pires");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}
}