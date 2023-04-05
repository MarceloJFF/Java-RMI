package com.app.Controllers;

import com.app.Dao.DaoGenerico;
import com.app.model.Address;

public class AddressController {
    private DaoGenerico<Address> dao = null;
    
    public AddressController(){
        dao = dao.getIntance();
    }

    public boolean salvar(Address c){
        return dao.salvar(c);
    }

    public Address get(Integer id){
        return  (Address) dao.get(Address.class, id);
    }

    public boolean excluir(Address c){
        return dao.excluir(c);
    }
}
