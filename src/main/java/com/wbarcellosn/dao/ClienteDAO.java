/**
 * @author winic
 */
package com.wbarcellosn.dao;

import com.wbarcellosn.dao.generic.GenericDAO;
import com.wbarcellosn.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
