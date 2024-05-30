/**
 * @author winic
 */
package com.wbarcellosn.dao;

import com.wbarcellosn.dao.generic.GenericDAO;
import com.wbarcellosn.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}